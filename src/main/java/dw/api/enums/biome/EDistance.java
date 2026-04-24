package dw.api.enums.biome;

public enum EDistance {
        NEAR("No need to camp"),
        ONE_NIGHT("Requires one night of camping"),
        THREE_NIGHTS("Requires three nights of camping");

        private final String label;
        EDistance(String label) {this.label = label;}
        public String getLabel() {return label;}

}
