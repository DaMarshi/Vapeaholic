
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vapeaholic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.vapeaholic.VapeaholicMod;

public class VapeaholicModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VapeaholicMod.MODID);
	public static final RegistryObject<CreativeModeTab> VAPES = REGISTRY.register("vapes",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vapeaholic.vapes")).icon(() -> new ItemStack(VapeaholicModItems.RED_VAPE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VapeaholicModItems.WHITE_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_GRAY_VAPE.get());
				tabData.accept(VapeaholicModItems.GRAYVAPE.get());
				tabData.accept(VapeaholicModItems.BLACK_VAPE.get());
				tabData.accept(VapeaholicModItems.BROWN_VAPE.get());
				tabData.accept(VapeaholicModItems.RED_VAPE.get());
				tabData.accept(VapeaholicModItems.ORANGE_VAPE.get());
				tabData.accept(VapeaholicModItems.YELLOW_VAPE.get());
				tabData.accept(VapeaholicModItems.LIME_VAPE.get());
				tabData.accept(VapeaholicModItems.GREEN_VAPE.get());
				tabData.accept(VapeaholicModItems.CYAN_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_BLUE_VAPE.get());
				tabData.accept(VapeaholicModItems.BLUE_VAPE.get());
				tabData.accept(VapeaholicModItems.PURPLE_VAPE.get());
				tabData.accept(VapeaholicModItems.MAGENTA_VAPE.get());
				tabData.accept(VapeaholicModItems.PINK_VAPE.get());
				tabData.accept(VapeaholicModItems.WHITE_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_GRAY_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GRAY_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLACK_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BROWN_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.RED_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.ORANGE_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.YELLOW_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIME_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GREEN_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.CYAN_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_BLUE_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLUE_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PURPLE_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.MAGENTA_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PINK_WATER_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.WHITE_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_GRAY_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GRAY_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLACK_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BROWN_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.RED_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.ORANGE_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.YELLOW_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIME_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GREEN_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.CYAN_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_BLUE_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLUE_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PURPLE_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.MAGENTA_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PINK_NIGHT_VISION_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.WHITE_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_GRAY_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GRAY_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLACK_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BROWN_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.RED_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.ORANGE_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.YELLOW_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIME_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GREEN_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.CYAN_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_BLUE_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLUE_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PURPLE_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.MAGENTA_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PINK_INVISIBILITY_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.WHITE_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_GRAY_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GRAY_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLACK_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BROWN_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.RED_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.ORANGE_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.YELLOW_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIME_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GREEN_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.CYAN_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_BLUE_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLUE_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PURPLE_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.MAGENTA_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PINK_JUMP_BOOST_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.WHITE_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_GRAY_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GRAY_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLACK_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BROWN_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.RED_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.ORANGE_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.YELLOW_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIME_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GREEN_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.CYAN_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_BLUE_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLUE_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PURPLE_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.MAGENTA_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PINK_FIRE_RESISTANCE_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.WHITE_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_GRAY_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GRAY_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLACK_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BROWN_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.RED_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.ORANGE_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.YELLOW_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIME_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GREEN_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.CYAN_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_BLUE_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLUE_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PURPLE_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.MAGENTA_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PINK_SWIFTNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.WHITE_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_GRAY_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GRAY_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLACK_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BROWN_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.RED_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.ORANGE_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.YELLOW_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIME_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.GREEN_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.CYAN_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.LIGHT_BLUE_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.BLUE_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PURPLE_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.MAGENTA_SLOWNESS_FILLED_VAPE.get());
				tabData.accept(VapeaholicModItems.PINK_SLOWNESS_FILLED_VAPE.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> VAPE_PODS = REGISTRY.register("vape_pods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vapeaholic.vape_pods")).icon(() -> new ItemStack(VapeaholicModItems.EMPTY_VAPE_POD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VapeaholicModItems.EMPTY_VAPE_POD.get());
				tabData.accept(VapeaholicModItems.WATER_FILLED_VAPE_POD.get());
				tabData.accept(VapeaholicModItems.MUNDANE_POTION_FILLED_VAPE_POD.get());
				tabData.accept(VapeaholicModItems.THICK_POTION_FILLED_VAPE_POD.get());
				tabData.accept(VapeaholicModItems.AWKWARD_POTION_FILLED_VAPE_POD.get());
				tabData.accept(VapeaholicModItems.VAPE_POD_OF_NIGHT_VISION.get());
				tabData.accept(VapeaholicModItems.VAPE_POD_OF_INVISIBILITY.get());
				tabData.accept(VapeaholicModItems.VAPE_POD_OF_JUMP_BOOST.get());
				tabData.accept(VapeaholicModItems.VAPE_POD_OF_FIRE_RESISTANCE.get());
				tabData.accept(VapeaholicModItems.VAPE_POD_OF_SWIFTNESS.get());
				tabData.accept(VapeaholicModItems.VAPE_POD_OF_SLOWNESS.get());
				tabData.accept(VapeaholicModItems.VAPE_POD_OF_THE_TURTLE_MASTER.get());
				tabData.accept(VapeaholicModItems.VAPE_POD_OF_WATER_BREATHING.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> VAPE_COMPONENTS = REGISTRY.register("vape_components",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vapeaholic.vape_components")).icon(() -> new ItemStack(VapeaholicModItems.BATTERY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VapeaholicModItems.BATTERY.get());
				tabData.accept(VapeaholicModItems.COIL.get());
				tabData.accept(VapeaholicModItems.MOUTHPIECE.get());
			})

					.build());
}
