package com.maxscout.mod.registry;

import com.maxscout.mod.Main;

import com.maxscout.mod.materials.RubyArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final ArmorMaterial RubyArmorMaterial = new RubyArmorMaterial();
    public static final Item RUBY = new Item(new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item RUBY_HELMET = new ArmorItem(RubyArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(RubyArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item RUBY_LEGGINGS = new ArmorItem(RubyArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item RUBY_BOOTS = new ArmorItem(RubyArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(Main.ITEM_GROUP));

    //Blocks
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem DEEPSLATE_RUBY_ORE = new BlockItem(ModBlocks.DEEPSLATE_RUBY_ORE, new Item.Settings().group(Main.ITEM_GROUP));

    public static void registerModItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_boots"), RUBY_BOOTS);
    }

}
