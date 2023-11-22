package com.example.exampletnt;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public abstract class ExampleTNTLangProvider extends LanguageProvider {
    public ExampleTNTLangProvider(PackOutput output, String locale) {
        super(output, ExampleTNT.MOD_ID, locale);
    }

    public static class ExampleTNTLangJP extends ExampleTNTLangProvider {

        public ExampleTNTLangJP(PackOutput output) {
            super(output, "ja_jp");
        }

        @Override
        protected void addTranslations() {
            this.add(ExampleTNTItems.SMALL_TNT.get(), "小型TNT");
        }
    }

    public static class ExampleTNTLangUS extends ExampleTNTLangProvider {

        public ExampleTNTLangUS(PackOutput output) {
            super(output, "en_us");
        }

        @Override
        protected void addTranslations() {
            this.add(ExampleTNTItems.SMALL_TNT.get(), "Small TNT");
        }
    }
}