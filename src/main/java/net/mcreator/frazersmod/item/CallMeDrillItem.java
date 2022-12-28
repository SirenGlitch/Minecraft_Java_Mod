
package net.mcreator.frazersmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.frazersmod.init.FrazersModModSounds;

public class CallMeDrillItem extends RecordItem {
	public CallMeDrillItem() {
		super(0, FrazersModModSounds.REGISTRY.get(new ResourceLocation("frazers_mod:callmedrilmusic")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
