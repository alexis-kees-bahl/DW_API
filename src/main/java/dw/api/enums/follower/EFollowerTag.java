package dw.api.enums.follower;

public enum EFollowerTag {

    WISE("____-wise"),
    ARCHER("Archer"),
    ATHLETIC("Athletic"),
    BEAUTIFUL("Beautiful"),
    CAUTIOUS("Cautious"),
    CONNECTED("Connected (____)"),
    CUNNING("Cunning"),
    DEVIOUS("Devious"),
    GROUP("Group"),
    GUIDE("Guide (____)"),
    HARDY("Hardy"),
    HEALER("Healer"),
    MEEK("Meek"),
    MAGICAL("Magical"),
    ORGANIZED("Organized"),
    SELF_SUFFICIENT("Self-sufficient"),
    STEALTHY("Stealthy"),
    WARRIOR("Warrior");

    private final String label;

    EFollowerTag(String label) {
        this.label = label;
    }

    public String getLabel() { return label; }
}
