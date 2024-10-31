
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bin.lacomarca.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.bin.lacomarca.entity.VineBiterEntity;
import net.bin.lacomarca.entity.Golemllager5Entity;
import net.bin.lacomarca.entity.Golemllager4Entity;
import net.bin.lacomarca.entity.Golemllager3Entity;
import net.bin.lacomarca.entity.Golemllager2Entity;
import net.bin.lacomarca.entity.Golemllager1Entity;
import net.bin.lacomarca.LacomarcaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LacomarcaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LacomarcaMod.MODID);
	public static final RegistryObject<EntityType<VineBiterEntity>> VINE_BITER = register("vine_biter",
			EntityType.Builder.<VineBiterEntity>of(VineBiterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VineBiterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Golemllager1Entity>> GOLEMLLAGER_1 = register("golemllager_1",
			EntityType.Builder.<Golemllager1Entity>of(Golemllager1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Golemllager1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Golemllager2Entity>> GOLEMLLAGER_2 = register("golemllager_2",
			EntityType.Builder.<Golemllager2Entity>of(Golemllager2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Golemllager2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Golemllager3Entity>> GOLEMLLAGER_3 = register("golemllager_3",
			EntityType.Builder.<Golemllager3Entity>of(Golemllager3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Golemllager3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Golemllager4Entity>> GOLEMLLAGER_4 = register("golemllager_4",
			EntityType.Builder.<Golemllager4Entity>of(Golemllager4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Golemllager4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Golemllager5Entity>> GOLEMLLAGER_5 = register("golemllager_5",
			EntityType.Builder.<Golemllager5Entity>of(Golemllager5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Golemllager5Entity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			VineBiterEntity.init();
			Golemllager1Entity.init();
			Golemllager2Entity.init();
			Golemllager3Entity.init();
			Golemllager4Entity.init();
			Golemllager5Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(VINE_BITER.get(), VineBiterEntity.createAttributes().build());
		event.put(GOLEMLLAGER_1.get(), Golemllager1Entity.createAttributes().build());
		event.put(GOLEMLLAGER_2.get(), Golemllager2Entity.createAttributes().build());
		event.put(GOLEMLLAGER_3.get(), Golemllager3Entity.createAttributes().build());
		event.put(GOLEMLLAGER_4.get(), Golemllager4Entity.createAttributes().build());
		event.put(GOLEMLLAGER_5.get(), Golemllager5Entity.createAttributes().build());
	}
}
