package net.bin.lacomarca.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.bin.lacomarca.entity.Golemllager1Entity;

public class Golemllager1Model extends GeoModel<Golemllager1Entity> {
	@Override
	public ResourceLocation getAnimationResource(Golemllager1Entity entity) {
		return new ResourceLocation("lacomarca", "animations/golemllager.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Golemllager1Entity entity) {
		return new ResourceLocation("lacomarca", "geo/golemllager.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Golemllager1Entity entity) {
		return new ResourceLocation("lacomarca", "textures/entities/" + entity.getTexture() + ".png");
	}

}
