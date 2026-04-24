package dw.api.enums.biome;

public enum EWildlife {
        ALMOST_NONE("Almost no wildlife"),
        FEW("Few and small animals"),
        TAME("Mostly tame creatures"),
        HARMLESS("Generally harmless fauna"),
        TERRITORIAL("Territorial wildlife"),
        AGGRESSIVE("Aggressive beasts can be found"),
        FULL("Full of untamed creatures"),
        TEEMING("Teeming with predators"),
        OVERRUN("Overrun by dangerous beasts");

    private final String label;
    EWildlife(String label) {this.label = label;}
    public String getLabel() {return label;}

}
