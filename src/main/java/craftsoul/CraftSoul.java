package craftsoul;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import craftsoul.creativetab.TabSoulCraft;
import craftsoul.item.ItemCore;
import craftsoul.recipe.RecipeCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;

@Mod(	modid 	= CraftSoul.MOD_ID,
		name 	= CraftSoul.MOD_NAME,
		version = CraftSoul.VERSION)
public class CraftSoul {
	public static final String MOD_ID	= "craftsoul";
	public static final String MOD_NAME	= "Craft Soul";
    public static final String VERSION	= "0.1.0.0";

	@Mod.Instance(MOD_ID)
	public static CraftSoul INSTANCE;

	public static CreativeTabs tabSoulCraft = new TabSoulCraft("SoulCraftTab");


    /***
     * Configファイル読み込みと出力
     * アイテム　ブロックの登録
     * @param event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ItemCore.registry();
    }

    /***
     * レシピの追加
     * 各種データ設定
     * @param event
     */
    @EventHandler
    public void preInit(FMLPostInitializationEvent event)
    {
    	RecipeCore.registry();
    }

	public static ToolMaterial TOOLMATERIAL;
    /***
     * その他
     * 他のMod連携など
     * @param event
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }


}
