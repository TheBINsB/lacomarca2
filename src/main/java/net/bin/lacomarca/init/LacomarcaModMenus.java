
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bin.lacomarca.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.bin.lacomarca.world.inventory.TradesMenu;
import net.bin.lacomarca.LacomarcaMod;

public class LacomarcaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LacomarcaMod.MODID);
	public static final RegistryObject<MenuType<TradesMenu>> TRADES = REGISTRY.register("trades", () -> IForgeMenuType.create(TradesMenu::new));
}
