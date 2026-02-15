package com.blackflamby.logicalredstone.registry;

import com.blackflamby.logicalredstone.BfsLogicalRedstone;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BfsLogicalRedstone.MODID);

    public static final DeferredItem<Item> STONEPLATE = ITEMS.register("stone_plate",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
