package craftsoul.creativetab;

import craftsoul.item.ItemCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;;

public class TabSoulCraft extends CreativeTabs
{
	public TabSoulCraft(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ItemCore.ItemTitaniteShard;
	}

}
