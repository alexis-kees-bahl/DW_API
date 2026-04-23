package dw.api.enums.area;


import java.util.*;

public enum EAreaAttributeSubcategory {

    /* =======================
       CATEGORÍAS SIN SUBLISTA
       ======================= */

    TRAP(EAreaAttributeCategory.TRAP),
    FEATURE(EAreaAttributeCategory.FEATURE),
    FIND(EAreaAttributeCategory.FIND),

    /* =======================
       UNNATURAL ENTITY
       ======================= */

    DIVINE_ENTITY(EAreaAttributeCategory.UNNATURAL_ENTITY),
    PLANAR_ENTITY(EAreaAttributeCategory.UNNATURAL_ENTITY),
    UNDEAD(EAreaAttributeCategory.UNNATURAL_ENTITY),

    /* =======================
       HAZARD
       ======================= */

    UNNATURAL_HAZARD(EAreaAttributeCategory.HAZARD),
    NATURAL_HAZARD(EAreaAttributeCategory.HAZARD),

    /* =======================
       CREATURE
       ======================= */

    CREATURE(EAreaAttributeCategory.CREATURE),

    /* =======================
       UNNATURAL FEATURE
       ======================= */

    DIVINE_FEATURE(EAreaAttributeCategory.UNNATURAL_FEATURE),
    PLANAR_FEATURE(EAreaAttributeCategory.UNNATURAL_FEATURE),
    ARCANE_FEATURE(EAreaAttributeCategory.UNNATURAL_FEATURE),

    /* =======================
       NATURAL FEATURE
       ======================= */

    LAIR(EAreaAttributeCategory.NATURAL_FEATURE),
    TERRAIN_CHANGE(EAreaAttributeCategory.NATURAL_FEATURE),
    WATER_FEATURE(EAreaAttributeCategory.NATURAL_FEATURE),
    LANDMARK(EAreaAttributeCategory.NATURAL_FEATURE),
    FLORA(EAreaAttributeCategory.NATURAL_FEATURE),
    FAUNA(EAreaAttributeCategory.NATURAL_FEATURE),
    RESOURCE(EAreaAttributeCategory.NATURAL_FEATURE),

    /* =======================
       EVIDENCE
       ======================= */

    TRACKS(EAreaAttributeCategory.EVIDENCE),
    REMAINS(EAreaAttributeCategory.EVIDENCE),
    DEBRIS(EAreaAttributeCategory.EVIDENCE),
    STASH(EAreaAttributeCategory.EVIDENCE),

    /* =======================
       STRUCTURE
       ======================= */

    ENIGMATIC(EAreaAttributeCategory.STRUCTURE),
    INFRASTRUCTURE(EAreaAttributeCategory.STRUCTURE),
    DWELLING(EAreaAttributeCategory.STRUCTURE),
    RELIGIOUS(EAreaAttributeCategory.STRUCTURE),
    RUIN(EAreaAttributeCategory.STRUCTURE),
    STEADING(EAreaAttributeCategory.STRUCTURE);

    /* =======================
       CAMPO Y CONSTRUCTOR
       ======================= */

    private final EAreaAttributeCategory category;
    private static final Map<EAreaAttributeCategory, List<EAreaAttributeSubcategory>> map = new HashMap<>();

    static {
        for(EAreaAttributeCategory c : EAreaAttributeCategory.values()) {
            map.put(c, getByCategoryInternal(c));
        }
    }

    EAreaAttributeSubcategory(EAreaAttributeCategory category) {
        this.category = category;
    }

    public EAreaAttributeCategory getCategory() {
        return category;
    }

    private static List<EAreaAttributeSubcategory> getByCategoryInternal(EAreaAttributeCategory category) {
        EAreaAttributeSubcategory[] values = EAreaAttributeSubcategory.values();
        List<EAreaAttributeSubcategory> list = new ArrayList<>();

        for (EAreaAttributeSubcategory value : values) {
            if (value.getCategory().equals(category)) {
                list.add(value);
            }
        }

        return Collections.unmodifiableList(list);
    }

    public static List<EAreaAttributeSubcategory> getByCategory(EAreaAttributeCategory category) {
        return map.get(category);
    }
}
