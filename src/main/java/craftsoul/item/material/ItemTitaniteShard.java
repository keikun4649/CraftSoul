package craftsoul.item.material;

import cpw.mods.fml.common.registry.GameRegistry;
import craftsoul.CraftSoul;
import net.minecraft.item.Item;

public class ItemTitaniteShard extends Item
{
	public ItemTitaniteShard()
	{
		this.setCreativeTab(CraftSoul.tabSoulCraft);
		this.setUnlocalizedName("TitaniteShard");
		this.setTextureName("soulcraft:ItemTitaniteShard");

	    maxStackSize = 64;

		GameRegistry.registerItem(this,"TitaniteShard");

		return;
	}
}
