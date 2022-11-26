package com.charlotte.sweetnotsavourymod.common.entityai;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.monster.MonsterEntity;

public class RSWMummyAttackGoal extends MeleeAttackGoal {
    private int random;

    public RSWMummyAttackGoal(MonsterEntity creature, double speedIn , boolean useLongMemory ){
        super( creature , speedIn , useLongMemory );

        this.random = 0;
    }

    @Override
    protected double getAttackReachSqr(LivingEntity attackTarget ){
        return 8.0F + attackTarget.getBbWidth();
    }

    @Override
    protected void checkAndPerformAttack( LivingEntity enemy , double distToEnemySqr ){
        this.random = getRandomNumber( 0 , 40 );
        double d0 = this.getAttackReachSqr( enemy );
        super.checkAndPerformAttack( enemy , distToEnemySqr );
    }

    private int getRandomNumber( int min , int max ){
        return (int) ((Math.random() * (max - min)) + min);
    }

}
