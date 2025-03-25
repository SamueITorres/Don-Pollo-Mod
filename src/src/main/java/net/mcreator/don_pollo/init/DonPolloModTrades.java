
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.don_pollo.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class DonPolloModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == DonPolloModVillagerProfessions.DONPOLLOTRABAJO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(DonPolloModBlocks.DONPOLLOBLOCK.get(), 16), new ItemStack(DonPolloModItems.DON_POLLO_BOSS_FIGHT_SPAWN_EGG.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.COOKED_CHICKEN, 9), 10, 5, 0.05f));
		}
	}
}
