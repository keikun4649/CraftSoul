package craftsoul.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import craftsoul.item.ItemCore;
import craftsoul.item.weapon.LongSword;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeCore {
	public static void registry(){
		GameRegistry.addShapelessRecipe(new ItemStack(ItemCore.ItemTitaniteShard),
				Blocks.cobblestone,
				Items.iron_ingot
			);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemCore.ItemLargeTitaniteShard),
				ItemCore.ItemTitaniteShard,
				Blocks.cobblestone,
				Items.iron_ingot
			);

		GameRegistry.addRecipe
		(
			new ItemStack(ItemCore.ShortSword),
			new Object[]
			{
				"x",
				"y",
				'x', Items.iron_ingot,
				'y', Items.stick
			}
		);

		LongSword.recipe();
	}
}
