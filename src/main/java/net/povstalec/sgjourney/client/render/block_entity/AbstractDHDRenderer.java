package net.povstalec.sgjourney.client.render.block_entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.povstalec.sgjourney.common.block_entities.dhd.AbstractDHDEntity;
import net.povstalec.sgjourney.common.blocks.dhd.AbstractDHDBlock;

public abstract class AbstractDHDRenderer<T extends AbstractDHDEntity> implements BlockEntityRenderer<T>
{
    protected final BlockEntityRendererProvider.Context context;

    public AbstractDHDRenderer(BlockEntityRendererProvider.Context context)
    {
        this.context = context;
    }

    @Override
    public void render(T dhd, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay)
    {
        poseStack.pushPose();

        poseStack.translate(0.5F, 0.0F, 0.5F);

        Direction facing = dhd.getBlockState().getValue(AbstractDHDBlock.FACING);

        float yRotation = -getRotationFromFacing(facing);
        poseStack.mulPose(Axis.YP.rotationDegrees(yRotation));

        poseStack.mulPose(Axis.XP.rotationDegrees(180));

        poseStack.translate(0.0F, -1.5F, 0.0F);

        renderModel(dhd, partialTick, poseStack, bufferSource, packedLight, packedOverlay);

        poseStack.popPose();
    }

    protected float getRotationFromFacing(Direction facing)
    {
        return switch (facing) {
            case NORTH -> 180;
            case EAST -> 270;
            case SOUTH -> 0;
            case WEST -> 90;
            default -> 180;
        };
    }

    protected abstract void renderModel(T dhd, float partialTick, PoseStack poseStack,
                                        MultiBufferSource bufferSource, int packedLight, int packedOverlay);
}