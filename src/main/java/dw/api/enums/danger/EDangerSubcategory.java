package dw.api.enums.danger;

public enum EDangerSubcategory {

    /*====================
        WORLD DANGER → UNNATURAL ENTITY
     ====================*/

    PLANAR(EDangerCategory.UNNATURAL_ENTITY),
    DIVINE(EDangerCategory.UNNATURAL_ENTITY),
    UNDEAD(EDangerCategory.UNNATURAL_ENTITY),

    /*====================
        WORLD DANGER → HAZARD
     ====================*/

    NATURAL(EDangerCategory.HAZARD),
    UNNATURAL(EDangerCategory.HAZARD),

    /*====================
        WORLD DANGER AND AREA DANGER→ CREATURE
     ====================*/

    LEADER(EDangerCategory.CREATURE),
    CREATURE(EDangerCategory.CREATURE),
    VERMIN(EDangerCategory.CREATURE),

     /*====================
        AREA DANGER → TRAP
     ====================*/
    TRAP(EDangerCategory.TRAP);

    private final EDangerCategory category;
    EDangerSubcategory(EDangerCategory category) {this.category = category;};
    public EDangerCategory getCategory(){ return this.category; }





}
