package dw.api.enums.area;

import java.util.*;

public enum EAreaAttributePrompt {

    /* =====================================================
       UNNATURAL FEATURE → DIVINE
       ===================================================== */

    PRESENCE(EAreaAttributeSubcategory.DIVINE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    MANIFESTATION(EAreaAttributeSubcategory.DIVINE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PROTECTED_PLACE(EAreaAttributeSubcategory.DIVINE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CURSED_PLACE(EAreaAttributeSubcategory.DIVINE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DEFILED_PLACE(EAreaAttributeSubcategory.DIVINE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    BLESSED_PLACE(EAreaAttributeSubcategory.DIVINE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SACRED_PLACE(EAreaAttributeSubcategory.DIVINE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       UNNATURAL FEATURE → PLANAR
       ===================================================== */

    OUTPOST(EAreaAttributeSubcategory.PLANAR_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PORTAL_PLANAR(EAreaAttributeSubcategory.PLANAR_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    GATE(EAreaAttributeSubcategory.PLANAR_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    RIFT(EAreaAttributeSubcategory.PLANAR_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    TEAR(EAreaAttributeSubcategory.PLANAR_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DISTORTION(EAreaAttributeSubcategory.PLANAR_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    WARP(EAreaAttributeSubcategory.PLANAR_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       UNNATURAL FEATURE → ARCANE
       ===================================================== */

    BLIGHT(EAreaAttributeSubcategory.ARCANE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    MUTATION(EAreaAttributeSubcategory.ARCANE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ENCHANTMENT(EAreaAttributeSubcategory.ARCANE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PORTAL_ARCANE(EAreaAttributeSubcategory.ARCANE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    TAINT(EAreaAttributeSubcategory.ARCANE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    RESIDUE(EAreaAttributeSubcategory.ARCANE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SOURCE(EAreaAttributeSubcategory.ARCANE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    RESOURCE_SOURCE(EAreaAttributeSubcategory.ARCANE_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),


    /* =====================================================
       UNNATURAL ENTITY → DIVINE
       ===================================================== */

    AGENT(EAreaAttributeSubcategory.DIVINE_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CHAMPION(EAreaAttributeSubcategory.DIVINE_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ARMY_FORCE(EAreaAttributeSubcategory.DIVINE_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    AVATAR_EMBODIMENT(EAreaAttributeSubcategory.DIVINE_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       UNNATURAL ENTITY → PLANAR
       ===================================================== */

    IMP(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SPRITE(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    LESSER_DEMON(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    LESSER_ELEMENTAL(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DEMON(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ELEMENTAL(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    GREATER_DEMON(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    GREATER_ELEMENTAL(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DEVIL_LORD(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ELEMENTAL_LORD(EAreaAttributeSubcategory.PLANAR_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       UNNATURAL ENTITY → UNDEAD
       ===================================================== */

    HAUNT(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    WISP(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PHANTOM(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SHADOW(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    GHOST(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SPECTER(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    WIGHT(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    WRAITH(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    REVENANT(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SPIRIT_LORD(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    LICH(EAreaAttributeSubcategory.UNDEAD, Set.of(ELocationType.WORLD, ELocationType.AREA)),



    /* =====================================================
       NATURAL FEATURE → LAIR
       ===================================================== */

    LAIR_RUIN(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CAVE(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD)),
    TUNNEL(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    NEST(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    HIVE(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    AERIE(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DEN(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD)),
    BURROW(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    WARREN(EAreaAttributeSubcategory.LAIR, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       NATURAL FEATURE → TERRAIN CHANGE
       ===================================================== */

    HOLLOW(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    CLEFT(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    DEFILE(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    CANYON(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    VALLEY(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    VALE(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    DALE(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    MULTILEVEL(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    TIERED(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    POCKET_OF_TERRAIN(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    SLOPE_UP(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),
    SLOPE_DOWN(EAreaAttributeSubcategory.TERRAIN_CHANGE, Set.of(ELocationType.WORLD)),

    /* =====================================================
       NATURAL FEATURE → WATER FEATURE
       ===================================================== */

    SEA(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD)),
    OCEAN(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD)),
    RIVER(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD)),
    LAKE(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD)),
    POND(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD)),
    MERE(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD)),
    TARN(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD)),
    BROOK(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD)),
    STREAM(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    RILL(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SPRING(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    HOT_SPRING(EAreaAttributeSubcategory.WATER_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       NATURAL FEATURE → LANDMARK
       ===================================================== */

    LANDMARK_ODDITY(EAreaAttributeSubcategory.LANDMARK, Set.of(ELocationType.WORLD)),
    STRIKING_LANDSCAPE(EAreaAttributeSubcategory.LANDMARK, Set.of(ELocationType.WORLD)),
    EARTH_BASED(EAreaAttributeSubcategory.LANDMARK, Set.of(ELocationType.WORLD)),
    PLANT_BASED(EAreaAttributeSubcategory.LANDMARK, Set.of(ELocationType.WORLD)),
    WATER_BASED(EAreaAttributeSubcategory.LANDMARK, Set.of(ELocationType.WORLD)),

    /* =====================================================
       NATURAL FEATURE → FLORA / FAUNA
       ===================================================== */

    NOTABLE_PLANT(EAreaAttributeSubcategory.FLORA, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    NOTABLE_FLOWER(EAreaAttributeSubcategory.FLORA, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    NOTABLE_TREE(EAreaAttributeSubcategory.FLORA, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    NOTABLE_BRUSH(EAreaAttributeSubcategory.FLORA, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    USEFUL_PLANT(EAreaAttributeSubcategory.FLORA, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    USEFUL_HERB(EAreaAttributeSubcategory.FLORA, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    USEFUL_ROOT(EAreaAttributeSubcategory.FLORA, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    NOTABLE_BEAST(EAreaAttributeSubcategory.FAUNA, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    USEFUL_BEAST(EAreaAttributeSubcategory.FAUNA, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       NATURAL FEATURE → RESOURCE
       ===================================================== */

    GAME(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    FRUIT(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    VEGETABLE(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    TIMBER(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    STONE(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    HERBS_SOURCE(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SPICE_SOURCE(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DYE_SOURCE(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    COPPER(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    TIN(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    IRON(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    GOLD(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SILVER(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    GEMS(EAreaAttributeSubcategory.RESOURCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       HAZARD → UNNATURAL
       ===================================================== */

    TAINT_HAZARD(EAreaAttributeSubcategory.UNNATURAL_HAZARD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    BLIGHT_HAZARD(EAreaAttributeSubcategory.UNNATURAL_HAZARD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CURSE(EAreaAttributeSubcategory.UNNATURAL_HAZARD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    MAGICAL_NATURAL_PLUS_MAGIC_TYPE(EAreaAttributeSubcategory.UNNATURAL_HAZARD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PLANAR_NATURAL_PLUS_ELEMENT(EAreaAttributeSubcategory.UNNATURAL_HAZARD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DIVINE_NATURAL_PLUS_DEITY(EAreaAttributeSubcategory.UNNATURAL_HAZARD, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       HAZARD → NATURAL
       ===================================================== */
    ODDITY_BASED(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    TECTONIC(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    VOLCANIC(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    UNSEEN_CHASM(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    UNSEEN_CREVASSE(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    UNSEEN_ABYSS(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    UNSEEN_RIFT(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    ENSNARING_BOG(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    ENSNARING_MIRE(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    ENSNARING_TARPIT(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    ENSNARING_QUICKSAND(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    DEFENSIVE(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    BLIZZARD(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    THUNDERSTORM(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    SANDSTORM(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    HAILSTORM(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    LIGHTNING_FIELD(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    ASH_FALL(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    ACID_RAIN(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    WILDFIRE(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    FLOOD(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    AVALANCHE(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    DROUGHT(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    ICE_STORM(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    HEAT_WAVE(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    MIST(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    FOG(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    MURK(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    GLOOM(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),
    MIASMA(EAreaAttributeSubcategory.NATURAL_HAZARD, Set.of(ELocationType.WORLD)),


    /* =====================================================
       EVIDENCE
       ===================================================== */

    TRAIL_OF_BLOOD(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    TRAIL_OF_FLUID(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SIGNS_OF_VIOLENCE(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    MANY_SIGNS(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DEFINITE(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    RECENT(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CLEAR(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    FAINT(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    OLD(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    UNCLEAR(EAreaAttributeSubcategory.TRACKS, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    BONES_OF_CREATURE(EAreaAttributeSubcategory.REMAINS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CREATURE_CARCASS(EAreaAttributeSubcategory.REMAINS, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    JUNK(EAreaAttributeSubcategory.DEBRIS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    REFUSE(EAreaAttributeSubcategory.DEBRIS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    LOST_SUPPLIES(EAreaAttributeSubcategory.DEBRIS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    GEAR(EAreaAttributeSubcategory.DEBRIS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    TOOLS(EAreaAttributeSubcategory.DEBRIS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    WEAPONS(EAreaAttributeSubcategory.DEBRIS, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ARMOR(EAreaAttributeSubcategory.DEBRIS, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    TRINKETS(EAreaAttributeSubcategory.STASH, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    COINS(EAreaAttributeSubcategory.STASH, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    MAP(EAreaAttributeSubcategory.STASH, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    NOTE(EAreaAttributeSubcategory.STASH, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    FOOD(EAreaAttributeSubcategory.STASH, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SUPPLIES(EAreaAttributeSubcategory.STASH, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    TREASURE(EAreaAttributeSubcategory.STASH, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       FEATURE
       ===================================================== */

    CAVE_IN(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.AREA)),
    COLLAPSE(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.AREA)),
    OBSTACLE(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    LOCKED_EXIT(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.AREA)),
    PILLAR(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    STAIRS(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    POOL(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PUZZLE(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ALTAR(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    STATUE(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SECRET_EXIT(EAreaAttributeSubcategory.FEATURE, Set.of(ELocationType.AREA)),

    /* =====================================================
       FIND
       ===================================================== */

    CLOTHING(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    LIGHT_SOURCE(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    AMMO(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    KEY(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CLUE(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    POTION(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CAPTIVE(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    SCROLL(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    JEWELRY(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ROLL_AGAIN(EAreaAttributeSubcategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       TRAP
       ===================================================== */

    ALARM(EAreaAttributeSubcategory.TRAP, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ENSNARING(EAreaAttributeSubcategory.TRAP, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PARALYZING(EAreaAttributeSubcategory.TRAP, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    GAS(EAreaAttributeSubcategory.TRAP, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    AMBUSH(EAreaAttributeSubcategory.TRAP, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    CREATURE_LEADER(EAreaAttributeSubcategory.CREATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    CREATURE_LORD(EAreaAttributeSubcategory.CREATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    BEAST_VERMIN(EAreaAttributeSubcategory.CREATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =====================================================
       CREATURE
       ===================================================== */
    CREATURE(EAreaAttributeSubcategory.CREATURE, Set.of(ELocationType.WORLD, ELocationType.AREA));


    private static final Map<EAreaAttributeSubcategory, List<EAreaAttributePrompt>> map = new HashMap<>();

    static {
        for (EAreaAttributeSubcategory s : EAreaAttributeSubcategory.values()) {
            map.put(s, getBySubcategoryInternal(s));
        }
    }

    private final EAreaAttributeSubcategory subcategory;

    private final Set<ELocationType> locationType;

    EAreaAttributePrompt(EAreaAttributeSubcategory subcategory,
            Set<ELocationType> locationType) {
        this.subcategory = subcategory;
        this.locationType = locationType;
    }

    public EAreaAttributeSubcategory getSubcategory() {
        return subcategory;
    }

    public Set<ELocationType> getLocationType() {
        return locationType;
    }

    public boolean isWorldBased() {
        return this.locationType.contains(ELocationType.WORLD);
    }

    public boolean isAreaBased() {
        return this.locationType.contains(ELocationType.AREA);
    }

    private static List<EAreaAttributePrompt> getBySubcategoryInternal(EAreaAttributeSubcategory s) {
        List<EAreaAttributePrompt> list = new ArrayList<>();

        for (EAreaAttributePrompt p : EAreaAttributePrompt.values()) {
            if (p.subcategory == s) {
                list.add(p);
            }
        }

        return list;
    }

    public static List<EAreaAttributePrompt> getBySubcategory(EAreaAttributeSubcategory c) {
        return map.get(c);
    }

}
