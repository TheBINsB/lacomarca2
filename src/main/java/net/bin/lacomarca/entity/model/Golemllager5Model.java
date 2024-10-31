package net.bin.lacomarca.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.bin.lacomarca.entity.Golemllager5Entity;

public class Golemllager5Model extends GeoModel<Golemllager5Entity> {
	@Override
	public ResourceLocation getAnimationResource(Golemllager5Entity entity) {
		return new ResourceLocation("lacomarca", "animations/golemllager5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Golemllager5Entity entity) {
		return new ResourceLocation("lacomarca", "geo/golemllager5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Golemllager5Entity entity) {
		return new ResourceLocation("lacomarca", "textures/entities/" + entity.getTexture() + ".png");
	}

}
