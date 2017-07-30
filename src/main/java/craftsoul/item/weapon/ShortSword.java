package craftsoul.item.weapon;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import craftsoul.CraftSoul;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ShortSword extends ItemSword
{
	public static Item ShortSword;

	public ShortSword(ToolMaterial par1) {
		super(par1);

		String name = "ShortSword";

		this.setCreativeTab(CraftSoul.tabSoulCraft);
	    this.setUnlocalizedName(name);
		this.setTextureName("soulcraft:ShortSword");

	    maxStackSize = 1;

	    GameRegistry.registerItem(this,name);

	    return;

	}

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean advanced)
    {
        list.add("小型の直剣");
    }

}
