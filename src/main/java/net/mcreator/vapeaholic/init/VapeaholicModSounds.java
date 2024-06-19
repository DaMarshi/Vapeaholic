
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vapeaholic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.vapeaholic.VapeaholicMod;

public class VapeaholicModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VapeaholicMod.MODID);
	public static final RegistryObject<SoundEvent> BREATHING = REGISTRY.register("breathing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("vapeaholic", "breathing")));
}
