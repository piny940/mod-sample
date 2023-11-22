package com.example.exampletnt;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExampleTNT.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventsSubscriber {
    @SubscribeEvent
    public static void creativeTabsBuildEvent(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ItemsRegistry.SMALL_TNT.get());
        } else if (event.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(BlocksRegistry.LARGE_TNT.get());
        }
    }
}
