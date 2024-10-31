package net.bin.lacomarca.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.bin.lacomarca.entity.Golemllager4Entity;

public class Golemllager4Model extends GeoModel<Golemllager4Entity> {
	@Override
	public ResourceLocation getAnimationResource(Golemllager4Entity entity) {
		return new ResourceLocation("lacomarca", "animations/golemllager4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Golemllager4Entity entity) {
		return new ResourceLocation("lacomarca", "geo/golemllager4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Golemllager4Entity entity) {
		return new ResourceLocation("lacomarca", "textures/entities/" + entity.getTexture() + ".png");
	}

}
