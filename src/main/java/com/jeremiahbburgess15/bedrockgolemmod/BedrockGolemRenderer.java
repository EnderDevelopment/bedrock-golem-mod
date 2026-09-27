package com.jeremiahbburgess15.bedrockgolemmod;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public
class BedrockGolemRenderer extends MobEntityRenderer<BedrockGolemEntity, BedrockGolemModel<BedrockGolemEntity>> {
    public BedrockGolemRenderer(EntityRendererFactory.Context context) {
        super(context, new BedrockGolemModel<>(context.getPart(BedrockGolemModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public Identifier getTexture(BedrockGolemEntity entity) {
        return new Identifier(BedrockGolemMod.MOD_ID, "textures/entity/bedrock_golem.png");
    }
}
