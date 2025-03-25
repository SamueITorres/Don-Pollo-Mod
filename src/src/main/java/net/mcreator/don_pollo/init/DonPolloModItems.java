
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.don_pollo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.don_pollo.item.DonPolloSwordItem;
import net.mcreator.don_pollo.DonPolloMod;

import java.util.function.Function;

public class DonPolloModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DonPolloMod.MODID);
	public static final DeferredItem<Item> DONPOLLOBLOCK = block(DonPolloModBlocks.DONPOLLOBLOCK);
	public static final DeferredItem<Item> DON_POLLO_BOSS_FIGHT_SPAWN_EGG = register("don_pollo_boss_fight_spawn_egg", properties -> new SpawnEggItem(DonPolloModEntities.DON_POLLO_BOSS_FIGHT.get(), properties));
	public static final DeferredItem<Item> DON_POLLO_SWORD = register("don_pollo_sword", DonPolloSwordItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
