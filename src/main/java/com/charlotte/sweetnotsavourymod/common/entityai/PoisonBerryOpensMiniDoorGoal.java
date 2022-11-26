package com.charlotte.sweetnotsavourymod.common.entityai;

import com.charlotte.sweetnotsavourymod.common.block.poisonberry.PoisonOakMiniDoor;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.GroundPathHelper;
import net.minecraft.util.math.BlockPos;

public class PoisonBerryOpensMiniDoorGoal extends Goal {
    protected MobEntity entity;
    protected BlockPos doorPosition = BlockPos.ZERO;
    protected boolean doorInteract;
    private boolean hasStoppedDoorInteraction;
    private float entityPositionX;
    private float entityPositionZ;

    public PoisonBerryOpensMiniDoorGoal(MobEntity entityIn) {
        this.entity = entityIn;
        if(!GroundPathHelper.hasGroundPathNavigation( entityIn )){
            throw new IllegalArgumentException( "Unsupported mob type for DoorInteractGoal" );
        }
    }


    protected void toggleDoor( boolean open ){

        if(this.doorInteract){
            BlockState blockstate = this.entity.level.getBlockState( this.doorPosition );
            if(blockstate.getBlock() instanceof PoisonOakMiniDoor){
                ((PoisonOakMiniDoor) blockstate.getBlock()).openDoor( this.entity.level , blockstate , this.doorPosition , open );
            }
        }

    }

    /**
     * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
     * method as well.
     */
    public boolean canUse() {
        if(!GroundPathHelper.hasGroundPathNavigation( this.entity )){
            return false;
        }else if(!this.entity.horizontalCollision){
            return false;
        }else{
            GroundPathNavigator groundpathnavigator = (GroundPathNavigator)this.entity.getNavigation();
            Path path = groundpathnavigator.getPath();
            if(path != null && !path.isDone() && groundpathnavigator.canOpenDoors()){ // might be passDoors
                for(int i = 0; i < Math.min(path.getNextNodeIndex() + 2 , path.getNodeCount()); ++i){
                    PathPoint pathpoint = path.getNode(i);
                    this.doorPosition = new BlockPos( pathpoint.x , pathpoint.y , pathpoint.z );
                    if(!(this.entity.distanceToSqr(this.doorPosition.getX(), this.entity.getY(),
                            this.doorPosition.getZ() ) > 2.25D)){
                        this.doorInteract = (this.entity.level.getBlockState(this.doorPosition).getBlock()
                                == BlockInit.POISONOAKMINIDOOR.get());
                        if(this.doorInteract){
                            return true;
                        }
                    }
                }

                this.doorPosition = this.entity.blockPosition();
                this.doorInteract = (this.entity.level.getBlockState(this.doorPosition).getBlock()
                        == BlockInit.POISONOAKMINIDOOR.get());
                return this.doorInteract;
            }else{
                return false;
            }
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting() {
        if(this.hasStoppedDoorInteraction){
            toggleDoor( false );
        }
        return !this.hasStoppedDoorInteraction;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void start() {
        this.hasStoppedDoorInteraction = false;
        this.entityPositionX = (float) ((double) this.doorPosition.getX() + 0.5D - this.entity.getX());
        this.entityPositionZ = (float) ((double) this.doorPosition.getZ() + 0.5D - this.entity.getZ());
        if(shouldContinueExecuting()){
            toggleDoor( true );
        }
    }

    @Override
    public void stop() {
        toggleDoor( false );
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void tick() {
        float f = (float) ((double) this.doorPosition.getX() + 0.5D - this.entity.getX());
        float f1 = (float) ((double) this.doorPosition.getZ() + 0.5D - this.entity.getZ());
        float f2 = this.entityPositionX * f + this.entityPositionZ * f1;
        if(f2 < 1.0F) {
            this.hasStoppedDoorInteraction = true;
        }
    }
}
