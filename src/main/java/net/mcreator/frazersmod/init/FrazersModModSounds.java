
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.frazersmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.frazersmod.FrazersModMod;

public class FrazersModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FrazersModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CALLMEDRILMUSIC = REGISTRY.register("callmedrilmusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("frazers_mod", "callmedrilmusic")));
}
