package com.ppatel.tutorialmod.Init;

import com.ppatel.tutorialmod.TutorialMod;
import net.minecraft.world.item.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
    public static final RegistryObject<Item> RUBY = register("ruby",()-> new Item(new Item.Properties().tab(TutorialMod.PARTHS_MODS)));
    public static final RegistryObject<Item> RUBY_SWORD = register("ruby_sword",()-> new SwordItem(Tiers.RUBY, 3,-2.3F, new Item.Properties().tab(TutorialMod.PARTHS_MODS)));
    public static final RegistryObject<Item> RUBY_PICKAXE = register("ruby_pickaxe",()-> new PickaxeItem(Tiers.RUBY, 1, -2.7F, new Item.Properties().tab(TutorialMod.PARTHS_MODS)));
    public static final RegistryObject<Item> RUBY_AXE = register("ruby_axe",()-> new AxeItem(Tiers.RUBY, 5,-2.9F, new Item.Properties().tab(TutorialMod.PARTHS_MODS)));
    public static final RegistryObject<Item> RUBY_SHOVEL = register("ruby_shovel",()-> new ShovelItem(Tiers.RUBY, 1.6F, -2.9F, new Item.Properties().tab(TutorialMod.PARTHS_MODS)));
    public static final RegistryObject<Item> RUBY_HOE = register("ruby_hoe",()-> new HoeItem(Tiers.RUBY, -4,  0, new Item.Properties().tab(TutorialMod.PARTHS_MODS)));
    public static final RegistryObject<Item> RAW_RUBY = register("raw_ruby",()-> new Item(new Item.Properties().tab(TutorialMod.PARTHS_MODS)));
private static <T extends Item> RegistryObject<T>register(final String name, final Supplier<T>item){
    return ITEMS.register(name,item);
}
}
