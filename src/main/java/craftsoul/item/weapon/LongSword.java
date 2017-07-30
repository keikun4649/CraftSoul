package craftsoul.item.weapon;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import craftsoul.CraftSoul;
import craftsoul.item.ItemCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class LongSword extends ItemSword
{

	public LongSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);

		String name = "LongSword";

		this.setCreativeTab(CraftSoul.tabSoulCraft);
	    this.setUnlocalizedName(name);
		this.setTextureName("soulcraft:LongSword");

	    maxStackSize = 1;

	    GameRegistry.registerItem(this,name);

	    return;
	}

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean advanced)
    {
        list.add("標準的な直剣");
    }

    public static void recipe()
    {
		GameRegistry.addRecipe
		(
			new ItemStack(ItemCore.LongSword),
			new Object[]
			{
				"x",
				"x",
				"x",
				'x', Items.iron_ingot,
			}
		);
    }

}
