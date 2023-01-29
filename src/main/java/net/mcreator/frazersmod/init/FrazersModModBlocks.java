
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.frazersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.frazersmod.block.TestBlockBlock;
import net.mcreator.frazersmod.block.HotWheelsBlock;
import net.mcreator.frazersmod.FrazersModMod;

public class FrazersModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FrazersModMod.MODID);
	public static final RegistryObject<Block> TEST_BLOCK = REGISTRY.register("test_block", () -> new TestBlockBlock());
	public static final RegistryObject<Block> HOT_WHEELS = REGISTRY.register("hot_wheels", () -> new HotWheelsBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			HotWheelsBlock.registerRenderLayer();
		}
	}
}
