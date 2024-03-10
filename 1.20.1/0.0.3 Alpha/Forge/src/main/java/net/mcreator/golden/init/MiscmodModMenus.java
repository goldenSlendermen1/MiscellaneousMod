
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.golden.world.inventory.SharpenerguiMenu;
import net.mcreator.golden.MiscmodMod;

public class MiscmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MiscmodMod.MODID);
	public static final RegistryObject<MenuType<SharpenerguiMenu>> SHARPENER_GUI = REGISTRY.register("sharpener_gui", () -> IForgeMenuType.create(SharpenerguiMenu::new));
}
