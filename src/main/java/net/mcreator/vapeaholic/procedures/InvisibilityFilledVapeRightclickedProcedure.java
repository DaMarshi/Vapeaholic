package net.mcreator.vapeaholic.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.vapeaholic.network.VapeaholicModVariables;
import net.mcreator.vapeaholic.init.VapeaholicModParticleTypes;

public class InvisibilityFilledVapeRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double speed = 0;
		double spread = 0;
		if (itemstack.getDamageValue() != 30) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 160, 0, false, true));
			speed = 0.1;
			spread = 0.02;
			for (int index0 = 0; index0 < (int) VapeaholicModVariables.MapVariables.get(world).PuffAmount; index0++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (VapeaholicModParticleTypes.WATER_PUFF.get()), (entity.getX()), (entity.getY() + entity.getEyeHeight()), (entity.getZ()), 0,
							(entity.getLookAngle().x * speed + Mth.nextDouble(RandomSource.create(), spread * (-1), spread)), (entity.getLookAngle().y * speed + Mth.nextDouble(RandomSource.create(), spread * (-1), spread)),
							(entity.getLookAngle().z * speed + Mth.nextDouble(RandomSource.create(), spread * (-1), spread)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vapeaholic:breathing")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vapeaholic:breathing")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Vape Pod Needs Replaced!"), true);
		}
	}
}
