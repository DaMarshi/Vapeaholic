
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vapeaholic.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.vapeaholic.client.particle.WitherPuffParticle;
import net.mcreator.vapeaholic.client.particle.WeaknessPuffParticle;
import net.mcreator.vapeaholic.client.particle.WaterPuffParticle;
import net.mcreator.vapeaholic.client.particle.WaterBreathingPuffParticle;
import net.mcreator.vapeaholic.client.particle.TurtleMasterPuffParticle;
import net.mcreator.vapeaholic.client.particle.SwiftnessPuffParticle;
import net.mcreator.vapeaholic.client.particle.StrengthPuffParticle;
import net.mcreator.vapeaholic.client.particle.SlownessPuffParticle;
import net.mcreator.vapeaholic.client.particle.SlowFallPuffParticle;
import net.mcreator.vapeaholic.client.particle.RegenPuffParticle;
import net.mcreator.vapeaholic.client.particle.PoisonPuffParticle;
import net.mcreator.vapeaholic.client.particle.NightVisionPuffParticle;
import net.mcreator.vapeaholic.client.particle.LuckPuffParticle;
import net.mcreator.vapeaholic.client.particle.JumpBoostPuffParticle;
import net.mcreator.vapeaholic.client.particle.InstantHealthPuffParticle;
import net.mcreator.vapeaholic.client.particle.InstantDamagePuffParticle;
import net.mcreator.vapeaholic.client.particle.FireResistancePuffParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VapeaholicModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(VapeaholicModParticleTypes.NIGHT_VISION_PUFF.get(), NightVisionPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.WATER_PUFF.get(), WaterPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.JUMP_BOOST_PUFF.get(), JumpBoostPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.FIRE_RESISTANCE_PUFF.get(), FireResistancePuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.SWIFTNESS_PUFF.get(), SwiftnessPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.SLOWNESS_PUFF.get(), SlownessPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.TURTLE_MASTER_PUFF.get(), TurtleMasterPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.WATER_BREATHING_PUFF.get(), WaterBreathingPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.INSTANT_HEALTH_PUFF.get(), InstantHealthPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.INSTANT_DAMAGE_PUFF.get(), InstantDamagePuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.POISON_PUFF.get(), PoisonPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.REGEN_PUFF.get(), RegenPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.STRENGTH_PUFF.get(), StrengthPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.WEAKNESS_PUFF.get(), WeaknessPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.LUCK_PUFF.get(), LuckPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.WITHER_PUFF.get(), WitherPuffParticle::provider);
		event.registerSpriteSet(VapeaholicModParticleTypes.SLOW_FALL_PUFF.get(), SlowFallPuffParticle::provider);
	}
}
