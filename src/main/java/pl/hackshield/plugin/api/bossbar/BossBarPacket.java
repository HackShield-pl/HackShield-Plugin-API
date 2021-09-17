package pl.hackshield.plugin.api.bossbar;

import lombok.Getter;
import pl.hackshield.plugin.api.HsPacket;

@Getter
public final class BossBarPacket implements HsPacket {

    private Operation operation;
    private BossInfo data;

    public BossBarPacket(Operation operation, BossInfo data) {
        this.operation = operation;
        this.data = data;
    }

    public enum Operation {
        ADD,
        REMOVE,
        UPDATE_PCT,
        UPDATE_NAME,
        UPDATE_STYLE,
        UPDATE_PROPERTIES
    }
}
