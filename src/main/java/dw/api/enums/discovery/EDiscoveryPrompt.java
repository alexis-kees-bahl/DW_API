package dw.api.enums.discovery;

import java.util.*;

public enum EDiscoveryPrompt {
    /*====================
    AREA DISCOVERY → FEATURE
    ====================*/
        CAVE_IN(EDiscoverySubcategory.FEATURE),
        COLLAPSE(EDiscoverySubcategory.FEATURE),
        OBSTACLE(EDiscoverySubcategory.FEATURE),
        BLOCKED(EDiscoverySubcategory.FEATURE),
        LOCKED_EXIT(EDiscoverySubcategory.FEATURE),
        PIT(EDiscoverySubcategory.FEATURE),
        SHAFT(EDiscoverySubcategory.FEATURE),
        CHASM(EDiscoverySubcategory.FEATURE),
        PILLARS(EDiscoverySubcategory.FEATURE),
        COLUMNS(EDiscoverySubcategory.FEATURE),
        ALCOVES(EDiscoverySubcategory.FEATURE),
        NICHES(EDiscoverySubcategory.FEATURE),
        SMALL_BRIDGE(EDiscoverySubcategory.FEATURE),
        STAIRS(EDiscoverySubcategory.FEATURE),
        RAMP(EDiscoverySubcategory.FEATURE),
        WELL(EDiscoverySubcategory.FEATURE),
        POOL(EDiscoverySubcategory.FEATURE),
        FOUNTAIN(EDiscoverySubcategory.FEATURE),
        PUZZLE(EDiscoverySubcategory.FEATURE),
        ALTAR(EDiscoverySubcategory.FEATURE),
        DAIS(EDiscoverySubcategory.FEATURE),
        PLATFORM(EDiscoverySubcategory.FEATURE),
        STATUE(EDiscoverySubcategory.FEATURE),
        IDOL(EDiscoverySubcategory.FEATURE),
        MULTI_LEVEL(EDiscoverySubcategory.FEATURE),
        LEDGES(EDiscoverySubcategory.FEATURE),
        TIERS(EDiscoverySubcategory.FEATURE),
        HIDDEN(EDiscoverySubcategory.FEATURE),
        SECRET_EXIT(EDiscoverySubcategory.FEATURE),


    /*====================
    AREA DISCOVERY → FIND
    ====================*/

        TRINKETS(EDiscoverySubcategory.FIND),
        CLOTHING(EDiscoverySubcategory.FIND),
        SUPPLIES(EDiscoverySubcategory.FIND),
        TOOLS(EDiscoverySubcategory.FIND),
        GEAR(EDiscoverySubcategory.FIND),
        LIGHT_SOURCE(EDiscoverySubcategory.FIND),
        FUEL(EDiscoverySubcategory.FIND),
        AMMO(EDiscoverySubcategory.FIND),
        KEY(EDiscoverySubcategory.FIND),
        CLUE(EDiscoverySubcategory.FIND),
        MAP(EDiscoverySubcategory.FIND),
        WEAPONS(EDiscoverySubcategory.FIND),
        ARMOR(EDiscoverySubcategory.FIND),
        POISON(EDiscoverySubcategory.FIND),
        ANTIDOTE(EDiscoverySubcategory.FIND),
        POTION(EDiscoverySubcategory.FIND),
        ADVENTURER(EDiscoverySubcategory.FIND),
        CAPTIVE(EDiscoverySubcategory.FIND),
        BOOKS(EDiscoverySubcategory.FIND),
        SCROLLS(EDiscoverySubcategory.FIND),
        COINS(EDiscoverySubcategory.FIND),
        GEMS(EDiscoverySubcategory.FIND),
        JEWELRY(EDiscoverySubcategory.FIND),
        ROLL_AGAIN_ADD_MAGIC_TYPE(EDiscoverySubcategory.FIND),
        ROLL_FEATURE_ADD_MAGIC_TYPE(EDiscoverySubcategory.FIND),
        ROLL_TWICE(EDiscoverySubcategory.FIND),
    
    
    /*====================
    WORLD DISCOVERY → UNNATURAL FEATURE → DIVINE
    ====================*/
   
        PRESENCE(EDiscoverySubcategory.DIVINE),
        MANIFESTATION(EDiscoverySubcategory.DIVINE),
        PROTECTED_PLACE(EDiscoverySubcategory.DIVINE),
        CURSED_PLACE(EDiscoverySubcategory.DIVINE),
        DEFILED_PLACE(EDiscoverySubcategory.DIVINE),
        BLESSED_PLACE(EDiscoverySubcategory.DIVINE),
        SACRED_PLACE(EDiscoverySubcategory.DIVINE),
    /*====================
    WORLD DISCOVERY → UNNATURAL FEATURE → PLANAR
    ====================*/

        OUTPOST(EDiscoverySubcategory.PLANAR),
        PORTAL(EDiscoverySubcategory.PLANAR),
        GATE(EDiscoverySubcategory.PLANAR),
        RIFT(EDiscoverySubcategory.PLANAR),
        TEAR(EDiscoverySubcategory.PLANAR),
        DISTORTION(EDiscoverySubcategory.PLANAR),
        WARP(EDiscoverySubcategory.PLANAR),

    /*====================
    WORLD DISCOVERY → UNNATURAL FEATURE → ARCANE
    ====================*/

        BLIGHT(EDiscoverySubcategory.ARCANE),
        MUTATION(EDiscoverySubcategory.ARCANE),
        ENCHANTMENT(EDiscoverySubcategory.ARCANE),
        TAINT(EDiscoverySubcategory.ARCANE),
        RESIDUE(EDiscoverySubcategory.ARCANE),
        SOURCE(EDiscoverySubcategory.ARCANE),
        RESOURCE(EDiscoverySubcategory.ARCANE),

    /*====================
    WORLD DISCOVERY → NATURAL FEATURE → LAIR
    ====================*/

        LAIR_RUIN(EDiscoverySubcategory.LAIR),
        CAVE(EDiscoverySubcategory.LAIR),
        TUNNEL(EDiscoverySubcategory.LAIR),
        NEST(EDiscoverySubcategory.LAIR),
        HIVE(EDiscoverySubcategory.LAIR),
        AERIE(EDiscoverySubcategory.LAIR),
        DEN(EDiscoverySubcategory.LAIR),
        BURROW(EDiscoverySubcategory.LAIR),
        WARREN(EDiscoverySubcategory.LAIR),

    /*====================
    WORLD DISCOVERY → NATURAL FEATURE → TERRAIN CHANGE
    ====================*/

        HOLLOW(EDiscoverySubcategory.TERRAIN_CHANGE),
        CLEFT(EDiscoverySubcategory.TERRAIN_CHANGE),
        DEFILE(EDiscoverySubcategory.TERRAIN_CHANGE),
        CANYON(EDiscoverySubcategory.TERRAIN_CHANGE),
        VALLEY(EDiscoverySubcategory.TERRAIN_CHANGE),
        VALE(EDiscoverySubcategory.TERRAIN_CHANGE),
        DALE(EDiscoverySubcategory.TERRAIN_CHANGE),
        MULTILEVEL(EDiscoverySubcategory.TERRAIN_CHANGE),
        TIERED(EDiscoverySubcategory.TERRAIN_CHANGE),
        POCKET_OF_TERRAIN(EDiscoverySubcategory.TERRAIN_CHANGE),
        SLOPE_UP(EDiscoverySubcategory.TERRAIN_CHANGE),
        SLOPE_DOWN(EDiscoverySubcategory.TERRAIN_CHANGE),

    /*====================
    WORLD DISCOVERY → NATURAL FEATURE → WATER FEATURE
    ====================*/

        SEA(EDiscoverySubcategory.WATER_FEATURE),
        OCEAN(EDiscoverySubcategory.WATER_FEATURE),
        RIVER(EDiscoverySubcategory.WATER_FEATURE),
        LAKE(EDiscoverySubcategory.WATER_FEATURE),
        POND(EDiscoverySubcategory.WATER_FEATURE),
        MERE(EDiscoverySubcategory.WATER_FEATURE),
        TARN(EDiscoverySubcategory.WATER_FEATURE),
        BROOK(EDiscoverySubcategory.WATER_FEATURE),
        STREAM(EDiscoverySubcategory.WATER_FEATURE),
        RILL(EDiscoverySubcategory.WATER_FEATURE),
        SPRING(EDiscoverySubcategory.WATER_FEATURE),
        HOT_SPRING(EDiscoverySubcategory.WATER_FEATURE),

    /*====================
    WORLD DISCOVERY → NATURAL FEATURE → LANDMARK
    ====================*/

        LANDMARK_ODDITY(EDiscoverySubcategory.LANDMARK),
        STRIKING_LANDSCAPE(EDiscoverySubcategory.LANDMARK),
        EARTH_BASED(EDiscoverySubcategory.LANDMARK),
        PLANT_BASED(EDiscoverySubcategory.LANDMARK),
        WATER_BASED(EDiscoverySubcategory.LANDMARK),

    /*====================
    WORLD DISCOVERY → NATURAL FEATURE → FLORA
    ====================*/

        NOTABLE_PLANT(EDiscoverySubcategory.FLORA),
        NOTABLE_FLOWER(EDiscoverySubcategory.FLORA),
        NOTABLE_TREE(EDiscoverySubcategory.FLORA),
        NOTABLE_BRUSH(EDiscoverySubcategory.FLORA),
        USEFUL_PLANT(EDiscoverySubcategory.FLORA),
        USEFUL_HERB(EDiscoverySubcategory.FLORA),
        USEFUL_ROOT(EDiscoverySubcategory.FLORA),

    /*====================
    WORLD DISCOVERY → NATURAL FEATURE → FAUNA
    ====================*/

        NOTABLE_BEAST(EDiscoverySubcategory.FAUNA),
        USEFUL_BEAST(EDiscoverySubcategory.FAUNA),

    /*====================
    WORLD DISCOVERY → NATURAL FEATURE → RESOURCE
    ====================*/

        GAME(EDiscoverySubcategory.RESOURCE),
        FRUIT(EDiscoverySubcategory.RESOURCE),
        VEGETABLE(EDiscoverySubcategory.RESOURCE),
        TIMBER(EDiscoverySubcategory.RESOURCE),
        STONE(EDiscoverySubcategory.RESOURCE),
        HERBS_SOURCE(EDiscoverySubcategory.RESOURCE),
        SPICE_SOURCE(EDiscoverySubcategory.RESOURCE),
        DYE_SOURCE(EDiscoverySubcategory.RESOURCE),
        COPPER(EDiscoverySubcategory.RESOURCE),
        TIN(EDiscoverySubcategory.RESOURCE),
        IRON(EDiscoverySubcategory.RESOURCE),
        GOLD(EDiscoverySubcategory.RESOURCE),
        SILVER(EDiscoverySubcategory.RESOURCE),
        GEM_MINE(EDiscoverySubcategory.RESOURCE),

    /*====================
    WORLD DISCOVERY → EVIDENCE → TRACKS
    ====================*/

        TRAIL_OF_BLOOD(EDiscoverySubcategory.TRACKS),
        TRAIL_OF_FLUID(EDiscoverySubcategory.TRACKS),
        SIGNS_OF_VIOLENCE(EDiscoverySubcategory.TRACKS),
        MANY_SIGNS(EDiscoverySubcategory.TRACKS),
        DEFINITE(EDiscoverySubcategory.TRACKS),
        RECENT(EDiscoverySubcategory.TRACKS),
        CLEAR(EDiscoverySubcategory.TRACKS),
        FAINT(EDiscoverySubcategory.TRACKS),
        OLD(EDiscoverySubcategory.TRACKS),
        UNCLEAR(EDiscoverySubcategory.TRACKS),

    /*====================
    WORLD DISCOVERY → EVIDENCE → REMAINS
    ====================*/

        BONES_OF_CREATURE(EDiscoverySubcategory.REMAINS),
        CREATURE_CARCASS(EDiscoverySubcategory.REMAINS),

    /*====================
    WORLD DISCOVERY → EVIDENCE → DEBRIS
    ====================*/

        JUNK(EDiscoverySubcategory.DEBRIS),
        REFUSE(EDiscoverySubcategory.DEBRIS),
        LOST_SUPPLIES(EDiscoverySubcategory.DEBRIS),
        BROKEN_GEAR(EDiscoverySubcategory.DEBRIS),
        DISCARDED_TOOLS(EDiscoverySubcategory.DEBRIS),
        BROKEN_WEAPONS(EDiscoverySubcategory.DEBRIS),
        UNUSABLE_ARMOR(EDiscoverySubcategory.DEBRIS),

    /*====================
    WORLD DISCOVERY → EVIDENCE → STASH/CACHE
    ====================*/

        STASHED_TRINKETS(EDiscoverySubcategory.STASH),
        SACK_OF_COINS(EDiscoverySubcategory.STASH),
        PRESERVED_MAP(EDiscoverySubcategory.STASH),
        NOTE(EDiscoverySubcategory.STASH),
        FOOD(EDiscoverySubcategory.STASH),
        FRESH_SUPPLIES(EDiscoverySubcategory.STASH),
        TREASURE(EDiscoverySubcategory.STASH),

    /*====================
    WORLD DISCOVERY → STRUCTURE → ENIGMATIC
    ====================*/

        ENIGMATIC_ODDITY(EDiscoverySubcategory.ENIGMATIC),
        MOUND(EDiscoverySubcategory.ENIGMATIC),
        EARTHWORKS(EDiscoverySubcategory.ENIGMATIC),
        MONUMENT(EDiscoverySubcategory.ENIGMATIC),
        MEGALITH(EDiscoverySubcategory.ENIGMATIC),
        ENIGMATIC_STATUE(EDiscoverySubcategory.ENIGMATIC),
        ENIGMATIC_IDOL(EDiscoverySubcategory.ENIGMATIC),
        TOTEM(EDiscoverySubcategory.ENIGMATIC),

    /*====================
    WORLD DISCOVERY → STRUCTURE → INFRASTRUCTURE
    ====================*/

        SIGNPOST(EDiscoverySubcategory.INFRASTRUCTURE),
        MARKER(EDiscoverySubcategory.INFRASTRUCTURE),
        BRIDGE(EDiscoverySubcategory.INFRASTRUCTURE),
        AQUEDUCT(EDiscoverySubcategory.INFRASTRUCTURE),
        TRACK(EDiscoverySubcategory.INFRASTRUCTURE),
        PATH(EDiscoverySubcategory.INFRASTRUCTURE),
        TRAIL(EDiscoverySubcategory.INFRASTRUCTURE),
        ROAD(EDiscoverySubcategory.INFRASTRUCTURE),
        MINE(EDiscoverySubcategory.INFRASTRUCTURE),
        QUARRY(EDiscoverySubcategory.INFRASTRUCTURE),

    /*====================
    WORLD DISCOVERY → STRUCTURE → DWELLING
    ====================*/

        CAMPSITE(EDiscoverySubcategory.DWELLING),
        HOVEL(EDiscoverySubcategory.DWELLING),
        HUT(EDiscoverySubcategory.DWELLING),
        HOMESTEAD(EDiscoverySubcategory.DWELLING),
        FARMSTEAD(EDiscoverySubcategory.DWELLING),
        INN(EDiscoverySubcategory.DWELLING),
        TOLL_HOUSE(EDiscoverySubcategory.DWELLING),
        MILL(EDiscoverySubcategory.DWELLING),
        TOWER(EDiscoverySubcategory.DWELLING),
        KEEP(EDiscoverySubcategory.DWELLING),
        CASTLE(EDiscoverySubcategory.DWELLING),

    /*====================
    WORLD DISCOVERY → STRUCTURE → RELIGIOUS
    ====================*/

        GRAVE_MARKER(EDiscoverySubcategory.RELIGIOUS),
        GRAVEYARD(EDiscoverySubcategory.RELIGIOUS),
        BURIAL_GROUND(EDiscoverySubcategory.RELIGIOUS),
        TOMB(EDiscoverySubcategory.RELIGIOUS),
        CRYPT(EDiscoverySubcategory.RELIGIOUS),
        BARROW(EDiscoverySubcategory.RELIGIOUS),
        TEMPLE(EDiscoverySubcategory.RELIGIOUS),
        MONASTERY(EDiscoverySubcategory.RELIGIOUS),
        GREAT_TEMPLE(EDiscoverySubcategory.RELIGIOUS),
        GREAT_SANCTUARY(EDiscoverySubcategory.RELIGIOUS),

    /*====================
    WORLD DISCOVERY → STRUCTURE → RUIN
    ====================*/

        DUNGEON_RUIN(EDiscoverySubcategory.RUIN),
        STEADING_RUIN(EDiscoverySubcategory.RUIN),
        RELIGIOUS_RUIN(EDiscoverySubcategory.RUIN),
        DWELLING_RUIN(EDiscoverySubcategory.RUIN),
        INFRASTRUCTURE_RUIN(EDiscoverySubcategory.RUIN),

    /*====================
    WORLD DISCOVERY → STRUCTURE → STEADING
    ====================*/

        VILLAGE(EDiscoverySubcategory.STEADING),
        TOWN(EDiscoverySubcategory.STEADING),
        CITY(EDiscoverySubcategory.STEADING);

    /*SUBCATEGORY ATTRIBUTE, CONSTRUCTOR AND GETTER*/

    private final EDiscoverySubcategory subcategory;
    EDiscoveryPrompt(EDiscoverySubcategory category){this.subcategory=category;}
    public EDiscoverySubcategory getSubcategory(EDiscoveryPrompt p){return p.subcategory;}

    /*A HASH MAP THAT CONTAINS A LIST OF PROMPTS FOR EACH SUBCATEGORY*/
    private static final Map<EDiscoverySubcategory, List<EDiscoveryPrompt>> map = new HashMap<>();

    /*STATIC FIELD TO INITIALIZE HASH MAP (REQUIRES FUNCTION DECLARED BELOW)*/
    static{
        for(EDiscoverySubcategory c : EDiscoverySubcategory.values()){
            map.put(c, getPromptListByCategory(c));
        }
    }

    /*PRIVATE FUNCTION TO INITIALIZE THE MAP*/

    private static List<EDiscoveryPrompt> getPromptListByCategoryInternal(EDiscoverySubcategory c) {
        EDiscoveryPrompt[] allPrompts = EDiscoveryPrompt.values();
        List<EDiscoveryPrompt> FilteredList = new ArrayList<>();
        for(EDiscoveryPrompt p : allPrompts){
            if(p.subcategory == c){
                FilteredList.add(p);
            }
        }

        return Collections.unmodifiableList(FilteredList);
    }

    /*PUBLIC FUNCTION TO GET ALL PROMPTS FROM ONE CATEGORY*/
    public static List<EDiscoveryPrompt> getPromptListByCategory(EDiscoverySubcategory c){return map.get(c);}

}
