package dw.api.enums.discovery;

import dw.api.enums.discovery.EAreaDiscoveryCategory;
import dw.api.enums.discovery.EAreaDiscoveryPrompt;

import java.util.*;

public enum EAreaDiscoveryPrompt {
    /*====================
AREA DISCOVERY → FEATURE
====================*/
    CAVE_IN(EAreaDiscoveryCategory.FEATURE),
    COLLAPSE(EAreaDiscoveryCategory.FEATURE),
    OBSTACLE(EAreaDiscoveryCategory.FEATURE),
    BLOCKED(EAreaDiscoveryCategory.FEATURE),
    LOCKED_EXIT(EAreaDiscoveryCategory.FEATURE),
    PIT(EAreaDiscoveryCategory.FEATURE),
    SHAFT(EAreaDiscoveryCategory.FEATURE),
    CHASM(EAreaDiscoveryCategory.FEATURE),
    PILLARS(EAreaDiscoveryCategory.FEATURE),
    COLUMNS(EAreaDiscoveryCategory.FEATURE),
    ALCOVES(EAreaDiscoveryCategory.FEATURE),
    NICHES(EAreaDiscoveryCategory.FEATURE),
    BRIDGE(EAreaDiscoveryCategory.FEATURE),
    STAIRS(EAreaDiscoveryCategory.FEATURE),
    RAMP(EAreaDiscoveryCategory.FEATURE),
    WELL(EAreaDiscoveryCategory.FEATURE),
    POOL(EAreaDiscoveryCategory.FEATURE),
    FOUNTAIN(EAreaDiscoveryCategory.FEATURE),
    PUZZLE(EAreaDiscoveryCategory.FEATURE),
    ALTAR(EAreaDiscoveryCategory.FEATURE),
    DAIS(EAreaDiscoveryCategory.FEATURE),
    PLATFORM(EAreaDiscoveryCategory.FEATURE),
    STATUE(EAreaDiscoveryCategory.FEATURE),
    IDOL(EAreaDiscoveryCategory.FEATURE),
    MULTI_LEVEL(EAreaDiscoveryCategory.FEATURE),
    LEDGES(EAreaDiscoveryCategory.FEATURE),
    TIERS(EAreaDiscoveryCategory.FEATURE),
    HIDDEN(EAreaDiscoveryCategory.FEATURE),
    SECRET_EXIT(EAreaDiscoveryCategory.FEATURE),


    /*====================
    AREA DISCOVERY → FIND
    ====================*/

    TRINKETS(EAreaDiscoveryCategory.FIND),
    CLOTHING(EAreaDiscoveryCategory.FIND),
    SUPPLIES(EAreaDiscoveryCategory.FIND),
    TOOLS(EAreaDiscoveryCategory.FIND),
    GEAR(EAreaDiscoveryCategory.FIND),
    LIGHT_SOURCE(EAreaDiscoveryCategory.FIND),
    FUEL(EAreaDiscoveryCategory.FIND),
    AMMO(EAreaDiscoveryCategory.FIND),
    KEY(EAreaDiscoveryCategory.FIND),
    CLUE(EAreaDiscoveryCategory.FIND),
    MAP(EAreaDiscoveryCategory.FIND),
    WEAPONS(EAreaDiscoveryCategory.FIND),
    ARMOR(EAreaDiscoveryCategory.FIND),
    POISON(EAreaDiscoveryCategory.FIND),
    ANTIDOTE(EAreaDiscoveryCategory.FIND),
    POTION(EAreaDiscoveryCategory.FIND),
    ADVENTURER(EAreaDiscoveryCategory.FIND),
    CAPTIVE(EAreaDiscoveryCategory.FIND),
    BOOKS(EAreaDiscoveryCategory.FIND),
    SCROLLS(EAreaDiscoveryCategory.FIND),
    COINS(EAreaDiscoveryCategory.FIND),
    GEMS(EAreaDiscoveryCategory.FIND),
    JEWELRY(EAreaDiscoveryCategory.FIND),
    ROLL_AGAIN_ADD_MAGIC_TYPE(EAreaDiscoveryCategory.FIND),
    ROLL_FEATURE_ADD_MAGIC_TYPE(EAreaDiscoveryCategory.FIND),
    ROLL_TWICE(EAreaDiscoveryCategory.FIND);

    /*CATEGORY ATTRIBUTE, CONSTRUCTOR AND GETTER*/

    private final EAreaDiscoveryCategory category;
    EAreaDiscoveryPrompt(EAreaDiscoveryCategory category){this.category=category;};
    public EAreaDiscoveryCategory getCategory(EAreaDiscoveryPrompt p){return p.category;}

    /*A HASH MAP THAT CONTAINS A LIST OF PROMPTS FOR EACH CATEGORY*/
    private static final Map<EAreaDiscoveryCategory, List<EAreaDiscoveryPrompt>> map = new HashMap<>();

    /*STATIC FIELD TO INITIALIZE HASH MAP (REQUIRES FUNCTION DECLARED BELOW)*/
    static{
        for(EAreaDiscoveryCategory c : EAreaDiscoveryCategory.values()){
            map.put(c, getPromptListByCategory(c));
        }
    }

    /*PRIVATE FUNCTION TO INITIALIZE THE MAP*/

    private static List<EAreaDiscoveryPrompt> getPromptListByCategoryInternal(EAreaDiscoveryCategory c) {
        EAreaDiscoveryPrompt[] allPrompts = EAreaDiscoveryPrompt.values();
        List<EAreaDiscoveryPrompt> FilteredList = new ArrayList<>();
        for(EAreaDiscoveryPrompt p : allPrompts){
            if(p.category == c){
                FilteredList.add(p);
            }
        }

        return Collections.unmodifiableList(FilteredList);
    }

    /*PUBLIC FUNCTION TO GET ALL PROMPTS FROM ONE CATEGORY*/
    public static List<EAreaDiscoveryPrompt> getPromptListByCategory(EAreaDiscoveryCategory c){return map.get(c);}

}
