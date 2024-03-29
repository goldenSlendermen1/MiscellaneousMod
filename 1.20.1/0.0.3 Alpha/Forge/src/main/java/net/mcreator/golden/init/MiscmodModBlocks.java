
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.golden.block.SharpenerBlock;
import net.mcreator.golden.MiscmodMod;

public class MiscmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MiscmodMod.MODID);
	public static final RegistryObject<Block> SHARPENER = REGISTRY.register("sharpener", () -> new SharpenerBlock());
}
