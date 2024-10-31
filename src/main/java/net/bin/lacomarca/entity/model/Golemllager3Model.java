package net.bin.lacomarca.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.bin.lacomarca.entity.Golemllager3Entity;

public class Golemllager3Model extends GeoModel<Golemllager3Entity> {
	@Override
	public ResourceLocation getAnimationResource(Golemllager3Entity entity) {
		return new ResourceLocation("lacomarca", "animations/golemllager3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Golemllager3Entity entity) {
		return new ResourceLocation("lacomarca", "geo/golemllager3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Golemllager3Entity entity) {
		return new ResourceLocation("lacomarca", "textures/entities/" + entity.getTexture() + ".png");
	}

}
