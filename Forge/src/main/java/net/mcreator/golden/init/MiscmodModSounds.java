
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.golden.MiscmodMod;

public class MiscmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MiscmodMod.MODID);
	public static final RegistryObject<SoundEvent> ITEM_SWORD_SLICE = REGISTRY.register("item.sword.slice", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("miscmod", "item.sword.slice")));
}
