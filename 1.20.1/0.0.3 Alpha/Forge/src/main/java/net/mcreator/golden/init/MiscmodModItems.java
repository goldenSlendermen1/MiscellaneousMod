
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.golden.item.SharpenedwoodenswordItem;
import net.mcreator.golden.item.SharpenedstoneswordItem;
import net.mcreator.golden.item.SharpenedironswordItem;
import net.mcreator.golden.item.SharpeneddiamondswordItem;
import net.mcreator.golden.item.SawbladeItem;
import net.mcreator.golden.MiscmodMod;

public class MiscmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MiscmodMod.MODID);
	public static final RegistryObject<Item> SHARPENED_WOODEN_SWORD = REGISTRY.register("sharpened_wooden_sword", () -> new SharpenedwoodenswordItem());
	public static final RegistryObject<Item> SHARPENED_STONE_SWORD = REGISTRY.register("sharpened_stone_sword", () -> new SharpenedstoneswordItem());
	public static final RegistryObject<Item> SHARPENER = block(MiscmodModBlocks.SHARPENER);
	public static final RegistryObject<Item> SAWBLADE = REGISTRY.register("sawblade", () -> new SawbladeItem());
	public static final RegistryObject<Item> SHARPENED_IRON_SWORD = REGISTRY.register("sharpened_iron_sword", () -> new SharpenedironswordItem());
	public static final RegistryObject<Item> SHARPENED_DIAMOND_SWORD = REGISTRY.register("sharpened_diamond_sword", () -> new SharpeneddiamondswordItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
