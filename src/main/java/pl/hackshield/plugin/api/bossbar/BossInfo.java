package pl.hackshield.plugin.api.bossbar;

import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

@Getter
public class BossInfo {

    private final UUID uniqueId;

    private boolean darkenSky, playEndBossMusic, createFog;
    private Overlay overlay;
    private float percent;
    private String name;
    private Color color;

    public BossInfo(UUID uniqueId, String name, Color color, Overlay overlay) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.color = color;
        this.overlay = overlay;
        this.percent = 1.0F;
    }

    public BossInfo(String name, Color color, Overlay overlay) {
        this(UUID.randomUUID(), name, color, overlay);
    }

    public boolean hasDisplayName() {
        return Objects.nonNull(name);
    }

    public BossInfo setOverlay(Overlay overlay) {
        this.overlay = overlay;
        return this;
    }

    public BossInfo setPercent(float percent) {
        this.percent = Float.max(percent, 0.0F);
        this.percent = Float.min(1.0F, this.percent);
        return this;
    }

    public BossInfo setName(String name) {
        this.name = name;
        return this;
    }

    public BossInfo setColor(Color color) {
        this.color = color;
        return this;
    }

    public BossInfo setDarkenSky(boolean darkenSky) {
        this.darkenSky = darkenSky;
        return this;
    }

    public BossInfo setPlayEndBossMusic(boolean playEndBossMusic) {
        this.playEndBossMusic = playEndBossMusic;
        return this;
    }

    public BossInfo setCreateFog(boolean createFog) {
        this.createFog = createFog;
        return this;
    }

    public enum Color {
        PINK,
        BLUE,
        RED,
        GREEN,
        YELLOW,
        PURPLE,
        WHITE
    }

    public enum Overlay {
        PROGRESS,
        NOTCHED_6,
        NOTCHED_10,
        NOTCHED_12,
        NOTCHED_20
    }

}