package io.github.simplycmd.even_more_origins.power;

import io.github.apace100.origins.power.Power;
import io.github.apace100.origins.power.PowerType;
import net.minecraft.entity.player.PlayerEntity;

public class SilentPower extends Power {
    public SilentPower(PowerType<?> type, PlayerEntity player) {
        super(type, player);
    }
}
