package org.cyclops.cyclopscore;

/**
 * Class that can hold basic static things that are better not hard-coded
 * like mod details, texture paths, ID's...
 * @author rubensworks
 */
public final class Reference {

    // Mod info
    public static final String MOD_ID = Tags.MODID;
    public static final String MOD_NAME = Tags.MODNAME;
    public static final String MOD_VERSION = Tags.VERSION;
    public static final String MOD_MC_VERSION = "1.12.2";

    // Mod ID's
    public static final String MOD_VANILLA = "Minecraft";
    public static final String MOD_BAUBLES = "baubles";
    public static final String MOD_VERSION_CHECKER = "VersionChecker";

    // Paths
    public static final String TEXTURE_PATH_PARTICLES = "textures/particles/";

    // MOD ID's
    public static final String MOD_WAILA = "waila";
    public static final String MOD_JEI = "jei";
    public static final String MOD_COMMONCAPABILITIES = "commoncapabilities";

    // Dependencies
    public static final String MOD_DEPENDENCIES =
              "required-after:forge@[14.23.5.2768,);";

}
