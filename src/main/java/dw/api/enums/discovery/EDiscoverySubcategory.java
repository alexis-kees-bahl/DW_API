package dw.api.enums.discovery;

import dw.api.enums.shared.ELocationType;

public enum EDiscoverySubcategory {
    /*====================
    AREA DISCOVERY → FIND
    ====================*/
        FIND,

    /*====================
    AREA DISCOVERY → FEATURE
    ====================*/
        FEATURE,

    /*====================
    WORLD DISCOVERY → UNNATURAL FEATURE
    ====================*/
        DIVINE,
        PLANAR,
        ARCANE,

    /*====================
    WORLD DISCOVERY → NATURAL FEATURE
    ====================*/
        LAIR,
        TERRAIN_CHANGE,
        WATER_FEATURE,
        LANDMARK,
        FLORA,
        FAUNA,
        RESOURCE,

    /*====================
    WORLD DISCOVERY → EVIDENCE
    ====================*/
        TRACKS,
        REMAINS,
        DEBRIS,
        STASH,

    /*====================
    WORLD DISCOVERY → CREATURE
    ====================*/
        CREATURE,

    /*====================
    WORLD DISCOVERY → STRUCTURE
    ====================*/
        ENIGMATIC,
        INFRASTRUCTURE,
        DWELLING,
        RELIGIOUS,
        RUIN,
        STEADING
}
