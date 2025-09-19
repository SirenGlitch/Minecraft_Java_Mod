
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.frazersmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.frazersmod.item.ColaItem;
import net.mcreator.frazersmod.item.CallMeDrillItem;
import net.mcreator.frazersmod.FrazersModMod;

public class FrazersModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, FrazersModMod.MODID);
	public static final DeferredHolder<Item, Item> TEST_BLOCK = block(FrazersModModBlocks.TEST_BLOCK);
	public static final DeferredHolder<Item, Item> COLA = REGISTRY.register("cola", () -> new ColaItem());
	public static final DeferredHolder<Item, Item> CALL_ME_DRILL = REGISTRY.register("call_me_drill", () -> new CallMeDrillItem());
	public static final DeferredHolder<Item, Item> HOT_WHEELS = block(FrazersModModBlocks.HOT_WHEELS);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
