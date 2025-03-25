
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.don_pollo.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.don_pollo.client.renderer.DonPolloBossFightRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DonPolloModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DonPolloModEntities.DON_POLLO_BOSS_FIGHT.get(), DonPolloBossFightRenderer::new);
		event.registerEntityRenderer(DonPolloModEntities.DONPOLLOFIREBALL.get(), ThrownItemRenderer::new);
	}
}
