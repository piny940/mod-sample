package com.example.exampletnt;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleTNT.MOD_ID)
public class ExampleTNT {
    public static final String MOD_ID = "exampletnt";

    public ExampleTNT() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::registerProviders);
        ExampleTNTItems.register(modEventBus);
    }

    private void registerProviders(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        gen.addProvider(event.includeClient(), new ExampleTNTItemModelProvider(packOutput, fileHelper));
    }
}
