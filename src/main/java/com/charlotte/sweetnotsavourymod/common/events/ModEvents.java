package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.BasicTrade;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETBANANA.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETPEACH.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETSTRAWBERRY.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETBLACKBERRY.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETBLUEBERRY.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETRASPBERRY.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETORANGE.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETMANGO.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETPINEAPPLE.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETLIME.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETLEMON.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.SWEETCARROT.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1),
                    stack,10,3,0.02F));


        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemInit.CANDYCANESUGAR.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add(new BasicTrade(
                    new ItemStack(Items.APPLE, 1),
                    stack,10,3,0.02F));


        }

    }
}
