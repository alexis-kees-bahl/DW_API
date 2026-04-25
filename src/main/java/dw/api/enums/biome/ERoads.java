package dw.api.enums.biome;

public enum ERoads {
        NO("No roads (virgin lands)"),
        FEW_BAD("Few dirt roads in bad shape"),
        FEW_PRESERVED("Few roads, somewhat preserved"),
        MANY_PRESERVED("Many roads, well preserved"),
        TRANSITABLE("The place is mostly transitable"),
        CROWDED_ROADS("Easily transitable and crowded roads");

    private final String label;
    ERoads(String label) {this.label = label;}
    public String getLabel() {return label;}

}
