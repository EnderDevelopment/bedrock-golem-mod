package com.jeremiahbburgess15.bedrockgolemmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class BedrockGolemMod implements ModInitializer {
    public static final String MOD_ID = "bedrockgolemmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final EntityType<BedrockGolemEntity> BEDROCK_GOLEM = Registry.register(
    Registry.ENTITY_TYPE,
    new Identifier(MOD_ID, "bedrock_golem"),
    FabricEntityTypeBuilder.create(SpawnGroup.MISC, BedrockGolemEntity::new)
    .dimensions(EntityDimensions.fixed(1.4f, 2.7f)).build()
    );

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Bedrock Golem Mod");
    }
}
