package net.bin.lacomarca.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.bin.lacomarca.entity.VineBiterEntity;

public class VineBiterModel extends GeoModel<VineBiterEntity> {
	@Override
	public ResourceLocation getAnimationResource(VineBiterEntity entity) {
		return new ResourceLocation("lacomarca", "animations/vine_biter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VineBiterEntity entity) {
		return new ResourceLocation("lacomarca", "geo/vine_biter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VineBiterEntity entity) {
		return new ResourceLocation("lacomarca", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(VineBiterEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
