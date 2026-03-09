package com.gemsores.gemsoresmod;

import com.gemsores.gemsoresmod.block.ModBlock;
import com.gemsores.gemsoresmod.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(GemsoresMod.MOD_ID)
public class GemsoresMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "gemsoresmod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public GemsoresMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlock.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        }

        LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());

        Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.RUBY);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.TOPAZ);
            event.accept(ModItems.AQUAMARINE);
            event.accept(ModItems.CHAROITE);
            event.accept(ModItems.ENDERITE);
            event.accept(ModItems.PRISM);
            event.accept(ModItems.TOPAZ_NUGGET);
            event.accept(ModItems.COAL_NUGGET);
            event.accept(ModItems.LAPIS_NUGGET);
            event.accept(ModItems.DIAMOND_NUGGET);
            event.accept(ModItems.COPPER_NUGGET);
            event.accept(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE);
            event.accept(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE);
            event.accept(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE);
        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlock.RUBY_ORE);
            event.accept(ModBlock.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlock.SAPPHIRE_ORE);
            event.accept(ModBlock.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlock.TOPAZ_ORE);
            event.accept(ModBlock.DEEPSLATE_TOPAZ_ORE);
            event.accept(ModBlock.AQUAMARINE_ORE);
            event.accept(ModBlock.DEEPSLATE_AQUAMARINE_ORE);
            event.accept(ModBlock.NETHER_TOPAZ_ORE);
            event.accept(ModBlock.NETHER_COAL_ORE);
            event.accept(ModBlock.NETHER_IRON_ORE);
            event.accept(ModBlock.NETHER_REDSTONE_ORE);
            event.accept(ModBlock.NETHER_LAPIS_ORE);
            event.accept(ModBlock.NETHER_DIAMOND_ORE);
            event.accept(ModBlock.NETHER_COPPER_ORE);
            event.accept(ModBlock.NETHER_CHAROITE_ORE);
            event.accept(ModBlock.END_CHAROITE_ORE);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlock.RUBY_BLOCK);
            event.accept(ModBlock.TOPAZ_BLOCK);
            event.accept(ModBlock.SAPPHIRE_BLOCK);
            event.accept(ModBlock.AQUAMARINE_BLOCK);
            event.accept(ModBlock.CHAROITE_BLOCK);
            event.accept(ModBlock.ENDERITE_BLOCK);
            event.accept(ModBlock.PRISM_BLOCK);

        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.TOPAZ_SWORD);
            event.accept(ModItems.EMERALD_SWORD);
            event.accept(ModItems.SAPPHIRE_SWORD);
            event.accept(ModItems.CHAROITE_SWORD);
            event.accept(ModItems.ENDERITE_SWORD);
            event.accept(ModItems.PRISM_SWORD);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.TOPAZ_AXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.CHAROITE_AXE);
            event.accept(ModItems.ENDERITE_AXE);
            event.accept(ModItems.PRISM_AXE);
            //armor
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_BOOTS);
            event.accept(ModItems.TOPAZ_HELMET);
            event.accept(ModItems.TOPAZ_CHESTPLATE);
            event.accept(ModItems.TOPAZ_LEGGINGS);
            event.accept(ModItems.TOPAZ_BOOTS);
            event.accept(ModItems.EMERALD_HELMET);
            event.accept(ModItems.EMERALD_CHESTPLATE);
            event.accept(ModItems.EMERALD_LEGGINGS);
            event.accept(ModItems.EMERALD_BOOTS);
            event.accept(ModItems.SAPPHIRE_HELMET);
            event.accept(ModItems.SAPPHIRE_CHESTPLATE);
            event.accept(ModItems.SAPPHIRE_LEGGINGS);
            event.accept(ModItems.SAPPHIRE_BOOTS);
            event.accept(ModItems.CHAROITE_HELMET);
            event.accept(ModItems.CHAROITE_CHESTPLATE);
            event.accept(ModItems.CHAROITE_LEGGINGS);
            event.accept(ModItems.CHAROITE_BOOTS);
            event.accept(ModItems.ENDERITE_HELMET);
            event.accept(ModItems.ENDERITE_CHESTPLATE);
            event.accept(ModItems.ENDERITE_LEGGINGS);
            event.accept(ModItems.ENDERITE_BOOTS);
            event.accept(ModItems.PRISM_HELMET);
            event.accept(ModItems.PRISM_CHESTPLATE);
            event.accept(ModItems.PRISM_LEGGINGS);
            event.accept(ModItems.PRISM_BOOTS);
            //horse armor
            event.accept(ModItems.RUBY_HORSE_ARMOR);
            event.accept(ModItems.TOPAZ_HORSE_ARMOR);
            event.accept(ModItems.EMERALD_HORSE_ARMOR);
            event.accept(ModItems.SAPPHIRE_HORSE_ARMOR);
            event.accept(ModItems.CHAROITE_HORSE_ARMOR);
            event.accept(ModItems.ENDERITE_HORSE_ARMOR);
            event.accept(ModItems.PRISM_HORSE_ARMOR);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_HOE);
            event.accept(ModItems.RUBY_SHOVEL);
            event.accept(ModItems.TOPAZ_PICKAXE);
            event.accept(ModItems.TOPAZ_AXE);
            event.accept(ModItems.TOPAZ_HOE);
            event.accept(ModItems.TOPAZ_SHOVEL);
            event.accept(ModItems.EMERALD_PICKAXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.EMERALD_HOE);
            event.accept(ModItems.EMERALD_SHOVEL);
            event.accept(ModItems.SAPPHIRE_PICKAXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.SAPPHIRE_HOE);
            event.accept(ModItems.SAPPHIRE_SHOVEL);
            event.accept(ModItems.CHAROITE_PICKAXE);
            event.accept(ModItems.CHAROITE_AXE);
            event.accept(ModItems.CHAROITE_HOE);
            event.accept(ModItems.CHAROITE_SHOVEL);
            event.accept(ModItems.ENDERITE_PICKAXE);
            event.accept(ModItems.ENDERITE_AXE);
            event.accept(ModItems.ENDERITE_HOE);
            event.accept(ModItems.ENDERITE_SHOVEL);
            event.accept(ModItems.PRISM_PICKAXE);
            event.accept(ModItems.PRISM_AXE);
            event.accept(ModItems.PRISM_HOE);
            event.accept(ModItems.PRISM_SHOVEL);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
