package dw.api.enums.shared;

public enum EArmor {

    NO_ARMOR("Flesh or clothes", 0),
    LIGHT("Hides or leather", 1),
    MEDIUM("Scale or chain", 2),
    HEAVY("Plate", 3);

    private final String description;
    private final int value;

    EArmor(String description, int value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() { return description; }
    public int getValue() { return value; }


}
