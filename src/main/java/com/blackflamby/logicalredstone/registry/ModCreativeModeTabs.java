package com.blackflamby.logicalredstone.registry;

import com.blackflamby.logicalredstone.BfsLogicalRedstone;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
                DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BfsLogicalRedstone.MODID);

        public static final Supplier<CreativeModeTab> BFSTAB = CREATIVE_MODE_TAB.register("bfs_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STONEPLATE.get()))
                        .title(Component.translatable("creativetab.bfs_lr.stone_plate"))
                        .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.STONEPLATE);
                            output.accept(ModBlocks.ORGATE);
                        }).build());

        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TAB.register(eventBus);
        }
}
