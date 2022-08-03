package com.charlotte.sweetnotsavourymod.common.screen.chest;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.resources.ResourceLocation;

public class SNSChestMenuTemplate {


	public final String id;
	public ResourceLocation texture;
	public final int width, height;
	public final int size;
	public final SlotPos[] slots;

	public SNSChestMenuTemplate(String id, int width, int height, SlotPos ... slots) {
		this.id = id;
		this.texture = new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/gui/chest/" + id + ".png");
		this.width = width;
		this.height = height;
		this.size = slots.length;
		this.slots = slots;
	}

	public SNSChestMenuTemplate(String id, int width, int height, int ... slotsCords) {
		this(id, width, height, createSlotPos(slotsCords));
	}

	private static SlotPos[] createSlotPos(int[] slotsCords) {
		int l = slotsCords.length >> 1;
		SlotPos[] result = new SlotPos[l];
		int cordIndex = 0;
		for (int i = 0; i < l; i++)
			result[i] = new SlotPos(slotsCords[cordIndex++], slotsCords[cordIndex++]);
		return result;
	}


	public static record SlotPos(int x, int y) {}
}
