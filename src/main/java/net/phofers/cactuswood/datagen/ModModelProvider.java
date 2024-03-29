package net.phofers.cactuswood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.phofers.cactuswood.block.ModBlocks;
import net.phofers.cactuswood.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool cactusPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CACTUS_PLANKS);


        cactusPool.stairs(ModBlocks.CACTUS_STAIRS);
        cactusPool.button(ModBlocks.CACTUS_BUTTON);
        cactusPool.slab(ModBlocks.CACTUS_SLAB);
        cactusPool.pressurePlate(ModBlocks.CACTUS_PRESSURE_PLATE);
        cactusPool.fenceGate(ModBlocks.CACTUS_FENCE_GATE);
        cactusPool.fence(ModBlocks.CACTUS_FENCE);

        blockStateModelGenerator.registerDoor(ModBlocks.CACTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CACTUS_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CACTUS_RIBS, Models.GENERATED);
    }
}