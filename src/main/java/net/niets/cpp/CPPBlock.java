package net.niets.cpp;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class CPPBlock extends PressurePlateBlock {

    public CPPBlock() {
        super(Sensitivity.EVERYTHING, Block.Properties.create(Material.CACTUS)
                .harvestLevel(0)
                .sound(SoundType.CLOTH)
                .harvestTool(ToolType.AXE)
        );
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityCollision(state, worldIn, pos, entityIn);
        entityIn.attackEntityFrom(DamageSource.CACTUS, 1);
    }

}
