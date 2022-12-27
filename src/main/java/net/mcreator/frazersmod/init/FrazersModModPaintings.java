
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.frazersmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FrazersModModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(64, 64).setRegistryName("siren_xl"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("siren_big"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("siren"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("siren_smol"));
	}
}
