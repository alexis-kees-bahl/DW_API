package dw.api.enums.steading;

public enum ESteadingProsperity {

    DIRT(1, "Dirt"),
    POOR(2, "Poor"),
    MODERATE(3, "Moderate"),
    WEALTHY(4, "Wealthy"),
    RICH(5, "Rich");

    private final int level;
    private final String label;

    ESteadingProsperity(int level, String label) {
        this.level = level;
        this.label = label;
    }

    public int getLevel() { return level; }
    public String getLabel() { return label; }
}
