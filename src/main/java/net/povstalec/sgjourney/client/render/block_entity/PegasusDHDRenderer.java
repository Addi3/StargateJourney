package net.povstalec.sgjourney.client.render.block_entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.povstalec.sgjourney.StargateJourney;
import net.povstalec.sgjourney.client.models.block_entity.AbstractDHDModel;
import net.povstalec.sgjourney.common.block_entities.dhd.AbstractDHDEntity;

public class PegasusDHDRenderer extends AbstractDHDRenderer<AbstractDHDEntity>
{
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(
            StargateJourney.MODID, "textures/entity/dhd/pegasus_dhd.png");

    private final AbstractDHDModel model;

    public PegasusDHDRenderer(BlockEntityRendererProvider.Context context)
    {
        super(context);
        this.model = new AbstractDHDModel(context.bakeLayer(AbstractDHDModel.LAYER_LOCATION));
    }

    @Override
    protected void renderModel(AbstractDHDEntity dhd, float partialTick, PoseStack poseStack,
                               MultiBufferSource bufferSource, int packedLight, int packedOverlay)
    {
        model.setupAnim(dhd, partialTick);

        VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE));
        model.renderToBuffer(poseStack, vertexConsumer, packedLight, packedOverlay, 1);
    }
}