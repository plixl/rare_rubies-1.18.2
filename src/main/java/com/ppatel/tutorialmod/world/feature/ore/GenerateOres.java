package com.ppatel.tutorialmod.world.feature.ore;


import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class GenerateOres {
    public static void generateOres(final BiomeLoadingEvent event) {
    List<Holder<PlacedFeature>> base =
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(OrePlacement.RUBY_ORE_PLACED);
}
}
