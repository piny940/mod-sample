package com.example.exampletnt;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExampleTNT.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExampleTNTEvents {
    @SubscribeEvent
    public static void creativeTabsBuildEvent(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ExampleTNTItems.SMALL_TNT.get());
        }
    }
}
