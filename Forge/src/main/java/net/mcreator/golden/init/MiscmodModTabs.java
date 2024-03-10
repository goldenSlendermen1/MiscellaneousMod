
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golden.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.golden.MiscmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiscmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MiscmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(MiscmodModBlocks.SHARPENER.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MiscmodModItems.SHARPENED_WOODEN_SWORD.get());
			tabData.accept(MiscmodModItems.SHARPENED_STONE_SWORD.get());
			tabData.accept(MiscmodModItems.SHARPENED_IRON_SWORD.get());
			tabData.accept(MiscmodModItems.SHARPENED_DIAMOND_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MiscmodModItems.SAWBLADE.get());
		}
	}
}
