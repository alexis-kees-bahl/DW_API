package dw.api.enums.steading;

public enum ESteadingDefenses {

    NONE(1, "None"),
    MILITIA(2, "Militia"),
    WATCH(3, "Watch"),
    GUARD(4, "Guard"),
    GARRISON(5, "Garrison"),
    BATTALION(6, "Battalion"),
    LEGION(7, "Legion");

    private final int level;
    private final String label;

    ESteadingDefenses(int level, String label) {
        this.level = level;
        this.label = label;
    }

    public int getLevel() { return level; }
    public String getLabel() { return label; }

}
