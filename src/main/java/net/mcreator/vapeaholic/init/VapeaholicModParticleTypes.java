
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vapeaholic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.vapeaholic.VapeaholicMod;

public class VapeaholicModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, VapeaholicMod.MODID);
	public static final RegistryObject<SimpleParticleType> NIGHT_VISION_PUFF = REGISTRY.register("night_vision_puff", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> WATER_PUFF = REGISTRY.register("water_puff", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> JUMP_BOOST_PUFF = REGISTRY.register("jump_boost_puff", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FIRE_RESISTANCE_PUFF = REGISTRY.register("fire_resistance_puff", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SWIFTNESS_PUFF = REGISTRY.register("swiftness_puff", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SLOWNESS_PUFF = REGISTRY.register("slowness_puff", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> TURTLE_MASTER_PUFF = REGISTRY.register("turtle_master_puff", () -> new SimpleParticleType(false));
}
