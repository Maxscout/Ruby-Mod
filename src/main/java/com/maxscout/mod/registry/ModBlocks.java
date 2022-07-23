package com.maxscout.mod.registry;

import com.maxscout.mod.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //Create blocks
    public static final Block DEEPSLATE_RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f));
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.6f));
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(1f));
    //Register blocks
    public static void registerModBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
    }

}
