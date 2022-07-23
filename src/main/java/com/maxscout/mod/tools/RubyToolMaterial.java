package com.maxscout.mod.tools;

import com.maxscout.mod.registry.ModItems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyToolMaterial implements ToolMaterial {

    public static final RubyToolMaterial INSTANCE = new RubyToolMaterial();

    @Override
    public int getDurability() {
        
        return 743;
    }

    @Override
    public float getMiningSpeedMultiplier() {
       
        return 1.0F;
    }

    @Override
    public float getAttackDamage() {
        
        return 6.5F;
    }

    @Override
    public int getMiningLevel() {
        
        return 3;
    }

    @Override
    public int getEnchantability() {
        
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RUBY);
    }
    
}
