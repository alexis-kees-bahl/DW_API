package dw.api.enums.danger;

import dw.api.enums.shared.ELocationType;

import java.util.Set;

public enum EDangerCategory {
    TRAP(Set.of(ELocationType.AREA)),
    CREATURE(Set.of(ELocationType.AREA, ELocationType.WORLD)),
    UNNATURAL_ENTITY(Set.of(ELocationType.WORLD)),
    HAZARD(Set.of(ELocationType.WORLD));

    private final Set<ELocationType> locationTypes;
    EDangerCategory(Set<ELocationType> locationTypes) {this.locationTypes = locationTypes;}
    public Set<ELocationType> getLocationTypes() {return locationTypes;}
}
