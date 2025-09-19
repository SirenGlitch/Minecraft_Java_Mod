
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.frazersmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.frazersmod.block.TestBlockBlock;
import net.mcreator.frazersmod.block.HotWheelsBlock;
import net.mcreator.frazersmod.FrazersModMod;

public class FrazersModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, FrazersModMod.MODID);
	public static final DeferredHolder<Block, Block> TEST_BLOCK = REGISTRY.register("test_block", () -> new TestBlockBlock());
	public static final DeferredHolder<Block, Block> HOT_WHEELS = REGISTRY.register("hot_wheels", () -> new HotWheelsBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
