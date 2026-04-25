package dw.api.enums.danger;

import java.util.*;

public enum EDangerPrompt {
    /*====================
    DANGER → TRAP → TRAP
    ====================*/

        ALARM(EDangerSubcategory.TRAP),
        PIT(EDangerSubcategory.TRAP),
        ENSNARING_TRAP(EDangerSubcategory.TRAP),
        PARALYZING(EDangerSubcategory.TRAP),
        CRUSHING(EDangerSubcategory.TRAP),
        SMASHING(EDangerSubcategory.TRAP),
        PIERCING(EDangerSubcategory.TRAP),
        PUNCTURING(EDangerSubcategory.TRAP),
        CHOPPING(EDangerSubcategory.TRAP),
        SLASHING(EDangerSubcategory.TRAP),
        SLICING(EDangerSubcategory.TRAP),
        CONFUSING(EDangerSubcategory.TRAP),
        GAS(EDangerSubcategory.TRAP),
        AMBUSH(EDangerSubcategory.TRAP),
        BASED_ON_ELEMENT(EDangerSubcategory.TRAP),
        BASED_ON_MAGIC_TYPE(EDangerSubcategory.TRAP),
        BASED_ON_ODDITY(EDangerSubcategory.TRAP),

    /*====================
    DANGER → CREATURE → LEADER
    ====================*/
        LEADER_WITH_MINIONS(EDangerSubcategory.TRAP),
        SOLITARY_BOSS(EDangerSubcategory.TRAP),

    /*====================
    DANGER → CREATURE → CREATURE
    ====================*/
        CREATURE(EDangerSubcategory.TRAP),

    /*====================
    DANGER → CREATURE → VERMIN
    ====================*/
        FLYING_VERMIN(EDangerSubcategory.TRAP),
        RODENTS_VERMIN(EDangerSubcategory.TRAP),
        INSECTS_VERMIN(EDangerSubcategory.TRAP),
        MAGIC_VERMIN(EDangerSubcategory.TRAP),
    /*====================
    DANGER → UNNATURAL ENTITY → PLANAR
    ====================*/

        IMP(EDangerSubcategory.PLANAR),
        SPRITE(EDangerSubcategory.PLANAR),
        LESSER_DEMON(EDangerSubcategory.PLANAR),
        LESSER_ELEMENTAL(EDangerSubcategory.PLANAR),
        DEMON(EDangerSubcategory.PLANAR),
        ELEMENTAL(EDangerSubcategory.PLANAR),
        GREATER_DEMON(EDangerSubcategory.PLANAR),
        GREATER_ELEMENTAL(EDangerSubcategory.PLANAR),
        DEVIL_LORD(EDangerSubcategory.PLANAR),
        ELEMENTAL_LORD(EDangerSubcategory.PLANAR),

    /*====================
    DANGER → UNNATURAL ENTITY → DIVINE
    ====================*/

        DIVINE_AGENT(EDangerSubcategory.DIVINE),
        DIVINE_CHAMPION(EDangerSubcategory.DIVINE),
        DIVINE_ARMY_OR_FORCE(EDangerSubcategory.DIVINE),
        DIVINE_AVATAR_EMBODIMENT(EDangerSubcategory.DIVINE),

    /*====================
    DANGER → UNNATURAL ENTITY → UNDEAD
    ====================*/
        HAUNT(EDangerSubcategory.UNDEAD),
        WISP(EDangerSubcategory.UNDEAD),
        PHANTOM(EDangerSubcategory.UNDEAD),
        SHADOW(EDangerSubcategory.UNDEAD),
        GHOST(EDangerSubcategory.UNDEAD),
        SPECTER(EDangerSubcategory.UNDEAD),
        WIGHT(EDangerSubcategory.UNDEAD),
        WRAITH(EDangerSubcategory.UNDEAD),
        REVENANT(EDangerSubcategory.UNDEAD),
        SPIRIT_LORD(EDangerSubcategory.UNDEAD),
        LICH(EDangerSubcategory.UNDEAD),

    /*====================
    DANGER → HAZARD → NATURAL
    ====================*/
        ODDITY_BASED(EDangerSubcategory.NATURAL),
        TECTONIC(EDangerSubcategory.NATURAL),
        VOLCANIC(EDangerSubcategory.NATURAL),
        UNSEEN_PITFALL(EDangerSubcategory.NATURAL),
        ENSNARING(EDangerSubcategory.NATURAL),
        DEFENSIVE(EDangerSubcategory.NATURAL),
        METEOROLOGICAL(EDangerSubcategory.NATURAL),
        SEASONAL(EDangerSubcategory.NATURAL),
        IMPAIRING(EDangerSubcategory.NATURAL),
    /*====================
    DANGER → HAZARD → UNNATURAL
    ====================*/
        TAINT(EDangerSubcategory.UNNATURAL),
        BLIGHT(EDangerSubcategory.UNNATURAL),
        CURSE(EDangerSubcategory.UNNATURAL),
        MAGICAL(EDangerSubcategory.UNNATURAL),
        PLANAR(EDangerSubcategory.UNNATURAL),
        DIVINE(EDangerSubcategory.UNNATURAL);


        /*CATEGORY ATTRIBUTE, CONSTRUCTOR AND GETTER*/
        private final EDangerSubcategory category;
        EDangerPrompt(EDangerSubcategory category) {this.category = category;}
        public EDangerSubcategory getCategory(){ return this.category; }

        /*A HASH MAP THAT CONTAINS A LIST OF PROMPTS FOR EACH CATEGORY*/
        private static final Map<EDangerSubcategory, List<EDangerPrompt>> map = new HashMap<>();

        /*STATIC FIELD TO INITIALIZE HASH MAP (REQUIRES FUNCTION DECLARED BELOW)*/
        static{
            for(EDangerSubcategory c : EDangerSubcategory.values()){
                map.put(c, getPromptListByCategoryInternal(c));
            }
        }

        /*A PRIVATE FUNCTION THAT RETURNS A LIST WITH ALL THE PROMPTS THAT CORRESPOND TO ONE GIVEN CATEGORY*/
        private static List<EDangerPrompt> getPromptListByCategoryInternal(EDangerSubcategory category){
            /*IMPORT PROMPTS AS ARRAY TO SCAN THEM*/
        EDangerPrompt[] values = EDangerPrompt.values();

        /*AN EMPTY LIST WHERE CORRESPONDING PROMPTS WILL BE ADDED*/
        List<EDangerPrompt> list = new ArrayList<>();

        /*FOR EACH VALUE IN THE PROMPTS ARRAY, THIS FUNCTION WILL CHECK THEIR CATEGORY
        ATTRIBUTE AND IF IT CORRESPONDS TO THE PARAMETER GIVEN, WILL ADD IT TO THE LIST*/
            for(EDangerPrompt p : values){
                if(p.getCategory() == category){
                    list.add(p);
                }
            }

            return Collections.unmodifiableList(list);
        };

        /*PUBLIC FUNCTION TO GET A LIST OF PROMPTS BY CATEGORY FROM THE HASH MAP*/
        public static List<EDangerPrompt> getPromptList(EDangerSubcategory category){return map.get(category);};

}
