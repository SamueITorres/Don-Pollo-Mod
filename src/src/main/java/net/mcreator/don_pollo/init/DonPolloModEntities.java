
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.don_pollo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.don_pollo.entity.DonpollofireballEntity;
import net.mcreator.don_pollo.entity.DonPolloBossFightEntity;
import net.mcreator.don_pollo.DonPolloMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DonPolloModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, DonPolloMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<DonPolloBossFightEntity>> DON_POLLO_BOSS_FIGHT = register("don_pollo_boss_fight",
			EntityType.Builder.<DonPolloBossFightEntity>of(DonPolloBossFightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DonpollofireballEntity>> DONPOLLOFIREBALL = register("donpollofireball",
			EntityType.Builder.<DonpollofireballEntity>of(DonpollofireballEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(DonPolloMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		DonPolloBossFightEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DON_POLLO_BOSS_FIGHT.get(), DonPolloBossFightEntity.createAttributes().build());
	}
}
