package com.charlotte.sweetnotsavourymod.common.block;

import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class SNSLadderBlock extends LadderBlock {

    public SNSLadderBlock() {
        super(Properties.of(Material.BAMBOO)
                .strength(0.4f)
                .sound(SoundType.BAMBOO)
                .noOcclusion()
        );
    }
}
