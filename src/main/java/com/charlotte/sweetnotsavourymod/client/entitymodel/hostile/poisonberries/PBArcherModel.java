package com.charlotte.sweetnotsavourymod.client.entitymodel.hostile.poisonberries;// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries.PBArcherEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PBArcherModel extends AnimatedGeoModel<PBArcherEntity>
{
    @Override
    public ResourceLocation getModelLocation(PBArcherEntity entity)
    {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/poisonberryarcher.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PBArcherEntity entity)
    {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/poisonberryarcher/poisonberryarcher.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PBArcherEntity entity)
    {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/poisonberryarcher.animation.json");
    }
}