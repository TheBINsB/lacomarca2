
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bin.lacomarca.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.bin.lacomarca.client.renderer.VineBiterRenderer;
import net.bin.lacomarca.client.renderer.Golemllager5Renderer;
import net.bin.lacomarca.client.renderer.Golemllager4Renderer;
import net.bin.lacomarca.client.renderer.Golemllager3Renderer;
import net.bin.lacomarca.client.renderer.Golemllager2Renderer;
import net.bin.lacomarca.client.renderer.Golemllager1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LacomarcaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LacomarcaModEntities.VINE_BITER.get(), VineBiterRenderer::new);
		event.registerEntityRenderer(LacomarcaModEntities.GOLEMLLAGER_1.get(), Golemllager1Renderer::new);
		event.registerEntityRenderer(LacomarcaModEntities.GOLEMLLAGER_2.get(), Golemllager2Renderer::new);
		event.registerEntityRenderer(LacomarcaModEntities.GOLEMLLAGER_3.get(), Golemllager3Renderer::new);
		event.registerEntityRenderer(LacomarcaModEntities.GOLEMLLAGER_4.get(), Golemllager4Renderer::new);
		event.registerEntityRenderer(LacomarcaModEntities.GOLEMLLAGER_5.get(), Golemllager5Renderer::new);
	}
}
