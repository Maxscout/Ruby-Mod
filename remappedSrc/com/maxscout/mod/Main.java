package com.maxscout.mod;

import com.maxscout.mod.registry.ModBlocks;
import com.maxscout.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "itsmaxscoutmods";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "allitems"),
            () -> new ItemStack(ModItems.RUBY));

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "otheritems"))
            .icon(() -> new ItemStack(Blocks.ENCHANTING_TABLE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK));
                stacks.add(new ItemStack(Items.APPLE));
                stacks.add(new ItemStack(ModItems.RUBY));
                stacks.add(new ItemStack(Items.GLOWSTONE_DUST));
                    })
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
