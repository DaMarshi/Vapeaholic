
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vapeaholic.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.vapeaholic.client.particle.WaterPuffParticle;
import net.mcreator.vapeaholic.client.particle.TurtleMasterPuffParticle;
import net.mcreator.vapeaholic.client.particle.SwiftnessPuffParticle;
import net.mcreator.vapeaholic.client.particle.SlownessPuffParticle;
import net.mcreator.vapeaholic.client.particle.NightVisionPuffParticle;
import net.mcreator.vapeaholic.client.particle.JumpBoostPuffParticle;
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
	}
}
