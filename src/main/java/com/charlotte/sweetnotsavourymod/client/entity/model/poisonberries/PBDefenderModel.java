package com.charlotte.sweetnotsavourymod.client.entity.model.poisonberries;// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PBArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PBDefenderEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PBDefenderModel extends AnimatedGeoModel<PBDefenderEntity>
{
    @Override
    public ResourceLocation getModelLocation(PBDefenderEntity entity)
    {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/poisonberrydefender.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PBDefenderEntity entity)
    {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/poisonberrydefender/poisonberrydefender.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PBDefenderEntity entity)
    {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/poisonberryarcher.animation.json");
    }
}