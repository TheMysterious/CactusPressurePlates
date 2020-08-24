package net.niets.cpp;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(CPPMod.MOD_ID)
public class CPPMod
{
    public static final String MOD_ID = "cpp";

    public CPPMod() {
        CPPRegistry.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

}
