
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bin.lacomarca.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.bin.lacomarca.item.ComarcacoinplataItem;
import net.bin.lacomarca.item.ComarcacoinpilaplataItem;
import net.bin.lacomarca.item.ComarcacoinpilaoroItem;
import net.bin.lacomarca.item.ComarcacoinpilabronceItem;
import net.bin.lacomarca.item.ComarcacoinoroItem;
import net.bin.lacomarca.item.ComarcacoinbronceItem;
import net.bin.lacomarca.LacomarcaMod;

public class LacomarcaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LacomarcaMod.MODID);
	public static final RegistryObject<Item> COMARCACOINBRONCE = REGISTRY.register("comarcacoinbronce", () -> new ComarcacoinbronceItem());
	public static final RegistryObject<Item> COMARCACOINPLATA = REGISTRY.register("comarcacoinplata", () -> new ComarcacoinplataItem());
	public static final RegistryObject<Item> COMARCACOINORO = REGISTRY.register("comarcacoinoro", () -> new ComarcacoinoroItem());
	public static final RegistryObject<Item> COMARCACOINPILABRONCE = REGISTRY.register("comarcacoinpilabronce", () -> new ComarcacoinpilabronceItem());
	public static final RegistryObject<Item> COMARCACOINPILAPLATA = REGISTRY.register("comarcacoinpilaplata", () -> new ComarcacoinpilaplataItem());
	public static final RegistryObject<Item> COMARCACOINPILAORO = REGISTRY.register("comarcacoinpilaoro", () -> new ComarcacoinpilaoroItem());
	public static final RegistryObject<Item> VINE_BITER_SPAWN_EGG = REGISTRY.register("vine_biter_spawn_egg", () -> new ForgeSpawnEggItem(LacomarcaModEntities.VINE_BITER, -13994710, -3649456, new Item.Properties()));
	public static final RegistryObject<Item> GOLEMLLAGER_1_SPAWN_EGG = REGISTRY.register("golemllager_1_spawn_egg", () -> new ForgeSpawnEggItem(LacomarcaModEntities.GOLEMLLAGER_1, -8380384, -9799887, new Item.Properties()));
	public static final RegistryObject<Item> GOLEMLLAGER_2_SPAWN_EGG = REGISTRY.register("golemllager_2_spawn_egg", () -> new ForgeSpawnEggItem(LacomarcaModEntities.GOLEMLLAGER_2, -8380384, -9799887, new Item.Properties()));
	public static final RegistryObject<Item> GOLEMLLAGER_3_SPAWN_EGG = REGISTRY.register("golemllager_3_spawn_egg", () -> new ForgeSpawnEggItem(LacomarcaModEntities.GOLEMLLAGER_3, -8380384, -9799887, new Item.Properties()));
	public static final RegistryObject<Item> GOLEMLLAGER_4_SPAWN_EGG = REGISTRY.register("golemllager_4_spawn_egg", () -> new ForgeSpawnEggItem(LacomarcaModEntities.GOLEMLLAGER_4, -8380384, -9799887, new Item.Properties()));
	public static final RegistryObject<Item> GOLEMLLAGER_5_SPAWN_EGG = REGISTRY.register("golemllager_5_spawn_egg", () -> new ForgeSpawnEggItem(LacomarcaModEntities.GOLEMLLAGER_5, -8380384, -9799887, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
