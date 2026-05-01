package net.povstalec.sgjourney.client.models.block_entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.povstalec.sgjourney.StargateJourney;
import net.povstalec.sgjourney.common.block_entities.dhd.AbstractDHDEntity;

public class AbstractDHDModel extends EntityModel<Entity>
{
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(StargateJourney.MODID, "dial_home_device"), "main");

    private final ModelPart dhd;
    private final ModelPart bone;
    private final ModelPart bone4;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart main;
    private final ModelPart area;
    private final ModelPart dialbutton;
    private final ModelPart dialbuttonlight;
    private final ModelPart bone9;
    private final ModelPart bone7;
    private final ModelPart bone5;
    private ModelPart bone8;
    private ModelPart bone6;
    private final ModelPart[] symbolButtonsOuter = new ModelPart[18];
    private final ModelPart[] symbolButtonsInner = new ModelPart[18];

    public AbstractDHDModel(ModelPart root)
    {
        this.dhd = root.getChild("dhd");
        this.bone = this.dhd.getChild("bone");
        this.bone4 = this.dhd.getChild("bone4");
        this.bone2 = this.dhd.getChild("bone2");
        this.bone3 = this.dhd.getChild("bone3");
        this.main = this.dhd.getChild("main");
        this.area = this.main.getChild("area");
        this.dialbutton = this.main.getChild("dialbutton");
        this.dialbuttonlight = this.dialbutton.getChild("dialbuttonlight");
        this.bone9 = this.main.getChild("bone9");
        this.bone7 = this.bone9.getChild("bone7");
        this.bone5 = this.bone7.getChild("bone5");
        this.bone8 = this.bone9.getChild("bone8");
        this.bone6 = this.bone8.getChild("bone6");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition dhd = partdefinition.addOrReplaceChild("dhd", CubeListBuilder.create().texOffs(0, 23).addBox(-5.0F, -15.0F, -4.0F, 10.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = dhd.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 23).addBox(-6.0F, -9.0F, -3.0F, 12.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 5.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition bone = dhd.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, -1.0F, -4.5F, 0.0F, -0.3927F, 0.0F));

        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, -11.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5629F, -9.5433F, 0.5629F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 104).addBox(0.0F, -6.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0607F, -4.0F, -1.0607F, -0.3655F, -0.7119F, 0.5299F));

        PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 104).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone4 = dhd.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, -1.0F, 3.5F, 0.0F, -0.3927F, 0.0F));

        PartDefinition cube_r5 = bone4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(94, -2).addBox(-1.5307F, -14.6955F, -1.5F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0607F, -4.0F, -1.0607F, -0.3655F, -0.7119F, 0.5299F));

        PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(97, 52).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone2 = dhd.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, -1.0F, -4.5F, 0.0F, 0.3927F, 0.0F));

        PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(95, 15).addBox(-3.0F, -11.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5629F, -9.5433F, 0.5629F, -0.6155F, 0.5236F, -0.9553F));

        PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 66).addBox(-3.0F, -6.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0607F, -4.0F, -1.0607F, -0.3655F, 0.7119F, -0.5299F));

        PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 104).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition bone3 = dhd.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, -1.0F, 3.5F, 0.0F, 0.3927F, 0.0F));

        PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(91, 93).addBox(-1.4693F, -14.6955F, -1.5F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0607F, -4.0F, -1.0607F, -0.3655F, 0.7119F, -0.5299F));

        PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(94, 29).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition main = dhd.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.5F, -5.0F, 0.4363F, 0.0F, 0.0F));

        PartDefinition area = main.addOrReplaceChild("area", CubeListBuilder.create().texOffs(2, 2).addBox(-11.0F, -13.0845F, -10.1495F, 26.0F, 1.0F, 19.0F, new CubeDeformation(0.002F))
                .texOffs(39, 36).addBox(-1.5F, -15.1345F, -4.0995F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offset(-2.0F, 11.6345F, 8.1495F));

        PartDefinition cube_r12 = area.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(98, 80).addBox(-10.1768F, -2.0F, 11.8232F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.8063F, -11.6355F, -5.4244F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r13 = area.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(108, 8).addBox(-9.1154F, -2.0F, -0.2218F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.8532F, -11.6355F, -3.2627F, 0.0F, 1.0908F, 0.0F));

        PartDefinition cube_r14 = area.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(108, 16).addBox(-9.0F, -2.0F, -0.75F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(14.4315F, -11.6355F, 6.6341F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r15 = area.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(108, 4).addBox(-9.1154F, -2.0F, -0.7782F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.8532F, -11.6355F, 2.5309F, 0.0F, -1.0908F, 0.0F));

        PartDefinition cube_r16 = area.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 104).addBox(-9.1768F, -2.0F, -0.8232F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(15.7044F, -11.6345F, -2.3784F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r17 = area.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(98, 76).addBox(2.1768F, -2.0F, 11.8232F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.8051F, -11.6365F, -5.4238F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r18 = area.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(108, 0).addBox(5.1154F, -2.0F, -0.2218F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.852F, -11.6365F, -3.262F, 0.0F, -1.0908F, 0.0F));

        PartDefinition cube_r19 = area.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(108, 12).addBox(5.0F, -2.0F, -0.75F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-10.4302F, -11.6365F, 6.6348F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r20 = area.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(105, 106).addBox(5.1154F, -2.0F, -0.7782F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.852F, -11.6365F, 2.5316F, 0.0F, 1.0908F, 0.0F));

        PartDefinition cube_r21 = area.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(65, 104).addBox(4.1768F, -2.0F, -0.8232F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-11.7031F, -11.6355F, -2.3777F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r22 = area.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(105, 102).addBox(-7.617F, -1.0F, -0.8643F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.6356F, -12.6345F, -9.7887F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r23 = area.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(53, 104).addBox(-4.117F, -1.0F, -0.8643F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0984F, -12.6345F, -9.7887F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r24 = area.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(105, 98).addBox(-3.6285F, -1.0F, -0.7891F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0984F, -12.6345F, -9.7887F, 0.0F, 0.3054F, 0.0F));

        PartDefinition cube_r25 = area.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(105, 94).addBox(-0.3715F, -1.0F, -0.7891F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.0984F, -12.6345F, -9.7887F, 0.0F, -0.3054F, 0.0F));

        PartDefinition dialbutton = main.addOrReplaceChild("dialbutton", CubeListBuilder.create().texOffs(24, 47).addBox(-2.0F, -1.5F, -1.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(8, 47).addBox(-2.0F, -1.5F, -1.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, -2.9F, 7.3F));

        PartDefinition dialbuttonlight = dialbutton.addOrReplaceChild("dialbuttonlight", CubeListBuilder.create().texOffs(24, 53).addBox(-2.0F, -1.5F, -1.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.05F))
                .texOffs(24, 53).addBox(-2.0F, -1.5F, -1.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.55F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone9 = main.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, 7.5F));

        PartDefinition bone7 = bone9.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r26 = bone7.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

        PartDefinition cube_r27 = bone7.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r28 = bone7.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.3963F, 0.0F));

        PartDefinition cube_r29 = bone7.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 1.3963F, 3.1416F));

        PartDefinition cube_r30 = bone7.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 1.0472F, 3.1416F));

        PartDefinition cube_r31 = bone7.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.6981F, 3.1416F));

        PartDefinition cube_r32 = bone7.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.3491F, 3.1416F));

        PartDefinition cube_r33 = bone7.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r34 = bone7.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

        PartDefinition cube_r35 = bone7.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.7925F, 0.0F));

        PartDefinition cube_r36 = bone7.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.4435F, 0.0F));

        PartDefinition cube_r37 = bone7.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r38 = bone7.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.7453F, 0.0F));

        PartDefinition cube_r39 = bone7.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

        PartDefinition cube_r40 = bone7.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r41 = bone7.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

        PartDefinition cube_r42 = bone7.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

        PartDefinition bone5 = bone7.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.05F, 0.0F));

        PartDefinition button1 = bone5.addOrReplaceChild("button1", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition button2 = bone5.addOrReplaceChild("button2", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

        PartDefinition button3 = bone5.addOrReplaceChild("button3", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

        PartDefinition button4 = bone5.addOrReplaceChild("button4", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition button5 = bone5.addOrReplaceChild("button5", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

        PartDefinition button6 = bone5.addOrReplaceChild("button6", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.7453F, 0.0F));

        PartDefinition button7 = bone5.addOrReplaceChild("button7", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition button8 = bone5.addOrReplaceChild("button8", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.4435F, 0.0F));

        PartDefinition button9 = bone5.addOrReplaceChild("button9", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.7925F, 0.0F));

        PartDefinition button10 = bone5.addOrReplaceChild("button10", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition button11 = bone5.addOrReplaceChild("button11", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.7925F, 0.0F));

        PartDefinition button12 = bone5.addOrReplaceChild("button12", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.4435F, 0.0F));

        PartDefinition button13 = bone5.addOrReplaceChild("button13", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition button14 = bone5.addOrReplaceChild("button14", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.7453F, 0.0F));

        PartDefinition button15 = bone5.addOrReplaceChild("button15", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.3963F, 0.0F));

        PartDefinition button16 = bone5.addOrReplaceChild("button16", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition button17 = bone5.addOrReplaceChild("button17", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

        PartDefinition button18 = bone5.addOrReplaceChild("button18", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

        PartDefinition bone8 = bone9.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

        PartDefinition cube_r43 = bone8.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 1.3963F, 3.1416F));

        PartDefinition cube_r44 = bone8.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 1.0472F, 3.1416F));

        PartDefinition cube_r45 = bone8.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.3963F, 0.0F));

        PartDefinition cube_r46 = bone8.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.6981F, 3.1416F));

        PartDefinition cube_r47 = bone8.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.3491F, 3.1416F));

        PartDefinition cube_r48 = bone8.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r49 = bone8.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

        PartDefinition cube_r50 = bone8.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r51 = bone8.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

        PartDefinition cube_r52 = bone8.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.6981F, 3.1416F));

        PartDefinition cube_r53 = bone8.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -1.0472F, 3.1416F));

        PartDefinition cube_r54 = bone8.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.3491F, 3.1416F));

        PartDefinition cube_r55 = bone8.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

        PartDefinition cube_r56 = bone8.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r57 = bone8.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -1.3963F, 3.1416F));

        PartDefinition cube_r58 = bone8.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

        PartDefinition cube_r59 = bone8.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

        PartDefinition bone6 = bone8.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, -0.05F, 0.0F));

        PartDefinition button19 = bone6.addOrReplaceChild("button19", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition button20 = bone6.addOrReplaceChild("button20", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

        PartDefinition button21 = bone6.addOrReplaceChild("button21", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

        PartDefinition button22 = bone6.addOrReplaceChild("button22", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition button23 = bone6.addOrReplaceChild("button23", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

        PartDefinition button24 = bone6.addOrReplaceChild("button24", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.7453F, 0.0F));

        PartDefinition button25 = bone6.addOrReplaceChild("button25", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition button26 = bone6.addOrReplaceChild("button26", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.4435F, 0.0F));

        PartDefinition button27 = bone6.addOrReplaceChild("button27", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.7925F, 0.0F));

        PartDefinition button28 = bone6.addOrReplaceChild("button28", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition button29 = bone6.addOrReplaceChild("button29", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.7925F, 0.0F));

        PartDefinition button30 = bone6.addOrReplaceChild("button30", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.4435F, 0.0F));

        PartDefinition button31 = bone6.addOrReplaceChild("button31", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition button32 = bone6.addOrReplaceChild("button32", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.7453F, 0.0F));

        PartDefinition button33 = bone6.addOrReplaceChild("button33", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.3963F, 0.0F));

        PartDefinition button34 = bone6.addOrReplaceChild("button34", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition button35 = bone6.addOrReplaceChild("button35", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

        PartDefinition button36 = bone6.addOrReplaceChild("button36", CubeListBuilder.create().texOffs(-2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }





    public void setupAnim(AbstractDHDEntity dhd, float partialTick)
    {
        // Animate dial button (center button)
        float dialButtonPress = dhd.isCenterButtonEngaged() ? 0.2F : 0.0F;
        this.dialbutton.y = -2.9F + dialButtonPress;

        // Animate outer buttons (1-18) based on address
        if (dhd.getAddress() != null)
        {
            for (int i = 0; i < 18 && i < symbolButtonsOuter.length; i++)
            {
                if (symbolButtonsOuter[i] != null)
                {
                    boolean isPressed = dhd.isSymbolEngaged(i + 1);
                    float pressOffset = isPressed ? 0.2F : 0.0F;
                    symbolButtonsOuter[i].y = -0.05F + pressOffset;
                }
            }

            // Animate inner buttons (19-36)
            for (int i = 0; i < 18 && i < symbolButtonsInner.length; i++)
            {
                if (symbolButtonsInner[i] != null)
                {
                    boolean isPressed = dhd.isSymbolEngaged(i + 19);
                    float pressOffset = isPressed ? 0.2F : 0.0F;
                    symbolButtonsInner[i].y = -0.05F + pressOffset;
                }
            }
        }
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color)
    {
        dhd.render(poseStack, vertexConsumer, packedLight, packedOverlay);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
        // Not used for block entities
    }
}