package com.charlotte.sweetnotsavourymod.client.entityrender.boats;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.boats.ModBoatEntity;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BoatModel;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import java.util.stream.Stream;

public class ModBoatRenderer extends BoatRenderer {
    private final Map<ModBoatEntity.Type, Pair<ResourceLocation, BoatModel>> boatResources;

    public ModBoatRenderer(EntityRendererManager context) {
        super(context);
        this.shadowRadius = 0.8F;
        this.boatResources = Stream.of(ModBoatEntity.Type.values()).collect(ImmutableMap.toImmutableMap((p_173938_) -> p_173938_,
                (type) -> Pair.of(new ResourceLocation(SweetNotSavouryMod.MOD_ID,"textures/entity/boat/" + type.getName() + ".png"),
                        new BoatModel(context.bakeLayer(
                                new ModelLayerLocation(new ResourceLocation("minecraft", "boat/oak"),"main"))))));

    }

    @Override
    public ResourceLocation getTextureLocation(BoatEntity pEntity) {
        if(pEntity instanceof ModBoatEntity) {
            return this.boatResources.get(((ModBoatEntity)pEntity).getModBoatType()).getFirst();
        }

        return new ResourceLocation("minecraft", "boat/oak");
    }

    public Pair<ResourceLocation, BoatModel> getModelWithLocation(BoatEntity boat) {
        if(boat instanceof ModBoatEntity) {
            return this.boatResources.get(((ModBoatEntity)boat).getModBoatType());
        }

        return null;
    }
}
