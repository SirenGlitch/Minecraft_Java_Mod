
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.frazersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.frazersmod.item.ColaItem;
import net.mcreator.frazersmod.item.CallMeDrillItem;
import net.mcreator.frazersmod.FrazersModMod;

public class FrazersModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FrazersModMod.MODID);
	public static final RegistryObject<Item> TEST_BLOCK = block(FrazersModModBlocks.TEST_BLOCK, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> COLA = REGISTRY.register("cola", () -> new ColaItem());
	public static final RegistryObject<Item> CALL_ME_DRILL = REGISTRY.register("call_me_drill", () -> new CallMeDrillItem());
	public static final RegistryObject<Item> HOT_WHEELS = block(FrazersModModBlocks.HOT_WHEELS, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
