
package net.mcreator.vapeaholic.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import net.mcreator.vapeaholic.init.VapeaholicModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WaterBreathingBrewBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new WaterBreathingBrewBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(new ItemStack(VapeaholicModItems.AWKWARD_POTION_FILLED_VAPE_POD.get())).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(new ItemStack(Items.PUFFERFISH)).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(VapeaholicModItems.VAPE_POD_OF_WATER_BREATHING.get());
		}
		return ItemStack.EMPTY;
	}
}
