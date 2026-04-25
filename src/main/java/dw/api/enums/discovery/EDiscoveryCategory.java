package dw.api.enums.discovery;

import dw.api.enums.shared.ELocationType;

public enum EDiscoveryCategory {
        FEATURE(ELocationType.AREA),
        FIND(ELocationType.AREA),
        UNNATURAL_FEATURE(ELocationType.WORLD),
        NATURAL_FEATURE(ELocationType.WORLD),
        EVIDENCE(ELocationType.WORLD),
        CREATURE(ELocationType.WORLD),
        STRUCTURE(ELocationType.WORLD);

        private final ELocationType location;
        EDiscoveryCategory(ELocationType location) { this.location = location; }
        public ELocationType getLocation() { return location; }
}
