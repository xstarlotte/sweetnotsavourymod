package com.charlotte.sweetnotsavourymod.common.entityai;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class IceCreamEntitySlowsTargetGoal extends MeleeAttackGoal {
    private int random;

    public IceCreamEntitySlowsTargetGoal(CreatureEntity pMob, double speedIn , boolean useLongMemory ){
        super( pMob , speedIn , useLongMemory );

        this.random = 0;
    }
    
    @Override
    protected double getAttackReachSqr(LivingEntity attackTarget) {
        return 8.0F + attackTarget.getBbWidth();
    }

    @Override
    protected void checkAndPerformAttack( LivingEntity enemy , double distToEnemySqr ){
        this.random = getRandomNumber( 0 , 40 );
        double d0 = this.getAttackReachSqr( enemy );
        super.checkAndPerformAttack( enemy , distToEnemySqr );


        if(distToEnemySqr <= d0){

            if(random >= 0){
                enemy.addEffect( new EffectInstance( Effects.MOVEMENT_SLOWDOWN , 60 ) );


            }
        }
    }

    private int getRandomNumber( int min , int max ){
        return (int) ((Math.random() * (max - min)) + min);
    }

}
