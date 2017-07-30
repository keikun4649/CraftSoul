package craftsoul.item;

import craftsoul.item.material.ItemLargeTitaniteShard;
import craftsoul.item.material.ItemTitaniteShard;
import craftsoul.item.weapon.LongSword;
import craftsoul.item.weapon.ShortSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemCore {
	public static Item ItemTitaniteShard;
	public static Item ItemLargeTitaniteShard;
	public static Item ItemTitaniteChunk;

	public static Item ShortSword;
	public static ToolMaterial ToolShortSword = EnumHelper.addToolMaterial("ShortSword", 1, 65, 1F, 0F, 10);
	/**
	 * ToolMaterial addToolMaterial
	 *
	 *  String name ツールマテリアルの名前
	 *  int harvestLevel 回収レベル
	 *  int maxUses 最大耐久値
	 *  float efficiency 採掘速度
	 *  float damage 攻撃に使用したときのダメージ倍率
	 *  int enchantability エンチャントの付きやすさ
	 *
	 *  ダイヤモンドは、3, 1561, 8.0F, 3.0F, 10
	 */

	public static Item LongSword;
	public static ToolMaterial ToolLongSword = EnumHelper.addToolMaterial("LongSword", 1, 70, 1F, 1F, 10);

	public static void registry()
	{
		ItemTitaniteShard = new ItemTitaniteShard();
		ItemLargeTitaniteShard = new ItemLargeTitaniteShard();

		ShortSword = new ShortSword(ToolShortSword);
		LongSword = new LongSword(ToolLongSword);
	}
}
