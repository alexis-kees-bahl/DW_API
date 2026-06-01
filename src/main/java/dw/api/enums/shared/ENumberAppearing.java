package dw.api.enums.shared;

public enum ENumberAppearing {
    HORDE("4d6 per wave"),
    GROUP("1d6+2 per wave"),
    SOLITARY("1");

    private final String label;

    ENumberAppearing(String label) {
        this.label = label;
    }

    public String getDescription() { return label; }

}
