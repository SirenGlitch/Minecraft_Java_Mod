
package net.mcreator.frazersmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class CallMeDrillItem extends RecordItem {
	public CallMeDrillItem() {
		super(0, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("frazers_mod:callmedrilmusic")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
