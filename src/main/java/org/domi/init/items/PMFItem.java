package org.domi.init.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.domi.PMF;

public class PMFItem extends Item {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PMF.MODID);

    // 생성자
    public PMFItem(Properties properties) {
        super(properties);
    }

    // 아이템 등록 용
    public static RegistryObject<Item> registerItem(String name) {
        return ITEMS.register(name, () -> new PMFItem(new Item.Properties()));
    }

}
