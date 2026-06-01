package dw.api.enums.area;

import dw.api.enums.shared.ELocationType;

import java.util.*;

public enum EAreaAttributeCategory {

    TRAP(Set.of(ELocationType.WORLD, ELocationType.AREA)), //
    CREATURE(Set.of(ELocationType.WORLD, ELocationType.AREA)), //
    FEATURE(Set.of(ELocationType.WORLD, ELocationType.AREA)), //
    FIND(Set.of(ELocationType.WORLD, ELocationType.AREA)), //
    HAZARD(Set.of(ELocationType.WORLD)), //
    UNNATURAL_ENTITY(Set.of(ELocationType.WORLD, ELocationType.AREA)), //
    NATURAL_FEATURE(Set.of(ELocationType.WORLD, ELocationType.AREA)), //
    UNNATURAL_FEATURE(Set.of(ELocationType.WORLD, ELocationType.AREA)), //
    EVIDENCE(Set.of(ELocationType.WORLD, ELocationType.AREA)), //
    STRUCTURE(Set.of(ELocationType.WORLD, ELocationType.AREA)); //

    private final Set<ELocationType> locationType;

    EAreaAttributeCategory(Set<ELocationType> locationType) {
        this.locationType = locationType;
    }

    public Set<ELocationType> getLocationType() {
        return locationType;
    }

    public static List<EAreaAttributeCategory> getByLocation(ELocationType locationType) {
        List<EAreaAttributeCategory> list = new ArrayList<>();

        for (EAreaAttributeCategory p : EAreaAttributeCategory.values()) {
            if (p.locationType.contains(locationType)) {
                list.add(p);
            }
        }

        return Collections.unmodifiableList(list);
    }


}

