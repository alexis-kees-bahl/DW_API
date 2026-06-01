package dw.api.enums.steading;

public enum ESteadingPopulation {

    EXODUS(1, "Exodus"),
    SHRINKING(2, "Shrinking"),
    STEADY(3, "Steady"),
    GROWING(4, "Growing"),
    BOOMING(5, "Booming");

    private final int level;
    private final String label;

    ESteadingPopulation(int level, String label) {
        this.level = level;
        this.label = label;
    }

    public int getLevel() { return level; }
    public String getLabel() { return label; }

}
