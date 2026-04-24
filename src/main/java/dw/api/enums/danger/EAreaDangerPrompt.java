package dw.api.enums.danger;

import dw.api.enums.area.EAreaAttributeSubcategory;

import java.util.*;

public enum EAreaDangerPrompt {
    /*====================
    AREA DANGER → TRAP
    ====================*/

        ALARM(EAreaDangerCategory.TRAP),
        PIT(EAreaDangerCategory.TRAP),
        ENSNARING(EAreaDangerCategory.TRAP),
        PARALYZING(EAreaDangerCategory.TRAP),
        CRUSHING(EAreaDangerCategory.TRAP),
        SMASHING(EAreaDangerCategory.TRAP),
        PIERCING(EAreaDangerCategory.TRAP),
        PUNCTURING(EAreaDangerCategory.TRAP),
        CHOPPING(EAreaDangerCategory.TRAP),
        SLASHING(EAreaDangerCategory.TRAP),
        SLICING(EAreaDangerCategory.TRAP),
        CONFUSING(EAreaDangerCategory.TRAP),
        GAS(EAreaDangerCategory.TRAP),
        AMBUSH(EAreaDangerCategory.TRAP),
        BASED_ON_ELEMENT(EAreaDangerCategory.TRAP),
        BASED_ON_MAGIC_TYPE(EAreaDangerCategory.TRAP),
        BASED_ON_ODDITY(EAreaDangerCategory.TRAP),

    /*====================
    AREA DANGER → CREATURE
    ====================*/
        LEADER(EAreaDangerCategory.CREATURE),
        CREATURE(EAreaDangerCategory.CREATURE),
        VERMIN(EAreaDangerCategory.CREATURE);



        /*CATEGORY ATTRIBUTE, CONSTRUCTOR AND GETTER*/
        private final EAreaDangerCategory category;
        EAreaDangerPrompt(EAreaDangerCategory category) {this.category = category;}
        public EAreaDangerCategory getCategory(){ return this.category; }

        /*A HASH MAP THAT CONTAINS A LIST OF PROMPTS FOR EACH CATEGORY*/
        private static final Map<EAreaDangerCategory, List<EAreaDangerPrompt>> map = new HashMap<>();

        /*STATIC FIELD TO INITIALIZE HASH MAP (REQUIRES FUNCTION DECLARED BELOW)*/
        static{
            for(EAreaDangerCategory c : EAreaDangerCategory.values()){
                map.put(c, getPromptListByCategoryInternal(c));
            }
        }

        /*A PRIVATE FUNCTION THAT RETURNS A LIST WITH ALL THE PROMPTS THAT CORRESPOND TO ONE GIVEN CATEGORY*/
        private static List<EAreaDangerPrompt> getPromptListByCategoryInternal(EAreaDangerCategory category){
            /*IMPORT PROMPTS AS ARRAY TO SCAN THEM*/
        EAreaDangerPrompt[] values = EAreaDangerPrompt.values();

        /*AN EMPTY LIST WHERE CORRESPONDING PROMPTS WILL BE ADDED*/
        List<EAreaDangerPrompt> list = new ArrayList<>();

        /*FOR EACH VALUE IN THE PROMPTS ARRAY, THIS FUNCTION WILL CHECK THEIR CATEGORY
        ATTRIBUTE AND IF IT CORRESPONDS TO THE PARAMETER GIVEN, WILL ADD IT TO THE LIST*/
            for(EAreaDangerPrompt p : values){
                if(p.getCategory() == category){
                    list.add(p);
                }
            }

            return Collections.unmodifiableList(list);
        };

        /*PUBLIC FUNCTION TO GET A LIST OF PROMPTS BY CATEGORY FROM THE HASH MAP*/
        public static List<EAreaDangerPrompt> getPromptList(EAreaDangerCategory category){return map.get(category);};

}
