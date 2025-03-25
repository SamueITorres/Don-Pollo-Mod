
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.don_pollo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.don_pollo.block.DonpolloblockBlock;
import net.mcreator.don_pollo.DonPolloMod;

import java.util.function.Function;

public class DonPolloModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DonPolloMod.MODID);
	public static final DeferredBlock<Block> DONPOLLOBLOCK = register("donpolloblock", DonpolloblockBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
