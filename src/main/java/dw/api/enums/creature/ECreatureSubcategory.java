package dw.api.enums.creature;

public enum ECreatureSubcategory {

    /* ---- MONSTER ---- */
    EXTRAPLANAR(ECreatureCategory.MONSTER),
    LEGENDARY(ECreatureCategory.MONSTER),
    UNDEAD(ECreatureCategory.MONSTER),
    UNUSUAL(ECreatureCategory.MONSTER),
    BEASTLY(ECreatureCategory.MONSTER),
    WILD_HUMANOID(ECreatureCategory.MONSTER),

    /* ---- BEAST ---- */
    WATER_GOING(ECreatureCategory.BEAST),
    AIRBORNE(ECreatureCategory.BEAST),
    EARTHBOUND(ECreatureCategory.BEAST),

    /* ---- HUMANOID ---- */
    RARE(ECreatureCategory.HUMANOID),
    UNCOMMON(ECreatureCategory.HUMANOID),
    COMMON(ECreatureCategory.HUMANOID);

    private final ECreatureCategory category;

    ECreatureSubcategory(ECreatureCategory category) {
        this.category = category;
    }

    public ECreatureCategory getCategory() {
        return category;
    }
}

