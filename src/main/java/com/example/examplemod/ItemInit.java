package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

  public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
      () -> new Item(new Item.Properties()));
}
