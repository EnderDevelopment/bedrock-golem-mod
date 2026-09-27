package com.jeremiahbburgess15.bedrockgolemmod;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.util.Identifier;

public
class BedrockGolemModel<T extends BedrockGolemEntity> extends EntityModel<T> {
    public static final Identifier LAYER_LOCATION = new Identifier(BedrockGolemMod.MOD_ID, "textures/entity/bedrock_golem.png");
    private final ModelPart body;

    public BedrockGolemModel(ModelPart root) {
        this.body = root.getChild("body");
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        // Set angles for the model parts
    }

    @Override
    public void render(T entity, float f, float g, float h, float i, float j) {
        this.body.render(f);
    }
}
