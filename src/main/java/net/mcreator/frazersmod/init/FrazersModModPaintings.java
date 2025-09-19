
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.frazersmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.core.registries.Registries;

import net.mcreator.frazersmod.FrazersModMod;

public class FrazersModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(Registries.PAINTING_VARIANT, FrazersModMod.MODID);
	public static final DeferredHolder<PaintingVariant, PaintingVariant> SIREN_XL = REGISTRY.register("siren_xl", () -> new PaintingVariant(64, 64));
	public static final DeferredHolder<PaintingVariant, PaintingVariant> SIREN_BIG = REGISTRY.register("siren_big", () -> new PaintingVariant(48, 48));
	public static final DeferredHolder<PaintingVariant, PaintingVariant> SIREN = REGISTRY.register("siren", () -> new PaintingVariant(32, 32));
	public static final DeferredHolder<PaintingVariant, PaintingVariant> SIREN_SMOL = REGISTRY.register("siren_smol", () -> new PaintingVariant(16, 16));
	public static final DeferredHolder<PaintingVariant, PaintingVariant> MR_PINEAPPLE = REGISTRY.register("mr_pineapple", () -> new PaintingVariant(32, 32));
	public static final DeferredHolder<PaintingVariant, PaintingVariant> MR_PINEAPPLE_XL = REGISTRY.register("mr_pineapple_xl", () -> new PaintingVariant(64, 64));
	public static final DeferredHolder<PaintingVariant, PaintingVariant> MR_PINEAPPLE_BIG = REGISTRY.register("mr_pineapple_big", () -> new PaintingVariant(48, 48));
	public static final DeferredHolder<PaintingVariant, PaintingVariant> MR_PINEAPPLE_SMOL = REGISTRY.register("mr_pineapple_smol", () -> new PaintingVariant(16, 16));
}
