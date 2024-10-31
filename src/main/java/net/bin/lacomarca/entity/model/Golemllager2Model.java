package net.bin.lacomarca.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.bin.lacomarca.entity.Golemllager2Entity;

public class Golemllager2Model extends GeoModel<Golemllager2Entity> {
	@Override
	public ResourceLocation getAnimationResource(Golemllager2Entity entity) {
		return new ResourceLocation("lacomarca", "animations/golemllager2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Golemllager2Entity entity) {
		return new ResourceLocation("lacomarca", "geo/golemllager2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Golemllager2Entity entity) {
		return new ResourceLocation("lacomarca", "textures/entities/" + entity.getTexture() + ".png");
	}

}
