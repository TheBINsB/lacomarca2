
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bin.lacomarca.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.bin.lacomarca.LacomarcaMod;

public class LacomarcaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LacomarcaMod.MODID);
	public static final RegistryObject<CreativeModeTab> LACOMARCA = REGISTRY.register("lacomarca",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lacomarca.lacomarca")).icon(() -> new ItemStack(LacomarcaModItems.COMARCACOINORO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LacomarcaModItems.COMARCACOINBRONCE.get());
				tabData.accept(LacomarcaModItems.COMARCACOINPLATA.get());
				tabData.accept(LacomarcaModItems.COMARCACOINORO.get());
				tabData.accept(LacomarcaModItems.COMARCACOINPILABRONCE.get());
				tabData.accept(LacomarcaModItems.COMARCACOINPILAPLATA.get());
				tabData.accept(LacomarcaModItems.COMARCACOINPILAORO.get());
				tabData.accept(LacomarcaModItems.VINE_BITER_SPAWN_EGG.get());
				tabData.accept(LacomarcaModItems.GOLEMLLAGER_1_SPAWN_EGG.get());
				tabData.accept(LacomarcaModItems.GOLEMLLAGER_2_SPAWN_EGG.get());
				tabData.accept(LacomarcaModItems.GOLEMLLAGER_3_SPAWN_EGG.get());
				tabData.accept(LacomarcaModItems.GOLEMLLAGER_4_SPAWN_EGG.get());
				tabData.accept(LacomarcaModItems.GOLEMLLAGER_5_SPAWN_EGG.get());
			})

					.build());
}
