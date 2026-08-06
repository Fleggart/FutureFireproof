package com.invadermonky.futurefireproof;

import com.invadermonky.futurefireproof.config.ModTags;
import com.invadermonky.futurefireproof.registry.RegistrarFF;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = FutureFireproof.MOD_ID,
        name = FutureFireproof.MOD_NAME,
        version = FutureFireproof.VERSION,
        acceptedMinecraftVersions = FutureFireproof.MC_VERSION
)
public class FutureFireproof {
    public static final String MOD_ID = "futurefireproof";
    public static final String MOD_NAME = "Future Fireproof";
    public static final String VERSION = "1.2.4";
    public static final String MC_VERSION = "[1.12.2]";

    @Mod.Instance(MOD_ID)
    public static FutureFireproof instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RegistrarFF.registerEntities();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModTags.syncConfig();
    }
}
