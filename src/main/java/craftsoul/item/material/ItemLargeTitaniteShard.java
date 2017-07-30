package craftsoul.item.material;

import cpw.mods.fml.common.registry.GameRegistry;
import craftsoul.CraftSoul;
import net.minecraft.item.Item;

public class ItemLargeTitaniteShard extends Item
{
	public ItemLargeTitaniteShard()
	{
		this.setCreativeTab(CraftSoul.tabSoulCraft);
		this.setUnlocalizedName("LargeTitaniteShard");
		this.setTextureName("soulcraft:ItemLargeTitaniteShard");

	    maxStackSize = 64;

		GameRegistry.registerItem(this,"LargeTitaniteShard");

		return;
	}
}
