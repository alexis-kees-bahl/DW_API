package dw.api.enums.shared;

import java.util.Set;

public enum ECauseOfRuin {
    ARCANE_DISASTER(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    DAMNATION(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    CURSE(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    PLAGUE(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    FAMINE(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    DROUGHT(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    OVERRUN_BY_MONSTERS(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    HUBRIS(Set.of(ELocationType.DUNGEON)),
    WAR(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    INVASION(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    DEPLETED_RESOURCES(Set.of(ELocationType.DUNGEON, ELocationType.RUIN)),
    BETTER_PROSPECTS_ELSEWHERE(Set.of(ELocationType.DUNGEON)),
    EARTHQUAKE(Set.of(ELocationType.RUIN)),
    FIRE(Set.of(ELocationType.RUIN)),
    FLOOD(Set.of(ELocationType.RUIN)),
    POLITICAL_UPHEAVAL(Set.of(ELocationType.RUIN)),
    ECONOMIC_COLLAPSE(Set.of(ELocationType.RUIN)),
    RELIGIOUS_STRIFE(Set.of(ELocationType.RUIN)),
    CULTURAL_DECAY(Set.of(ELocationType.RUIN)),
    EMIGRATION(Set.of(ELocationType.RUIN));


    private final Set<ELocationType> locationTypes;

    ECauseOfRuin(Set<ELocationType> locationTypes) {
        this.locationTypes = locationTypes;
    }

    public Set<ELocationType> getLocationTypes() {
        return locationTypes;
    }

}
