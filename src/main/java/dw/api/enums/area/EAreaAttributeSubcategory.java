package dw.api.enums.area;


import dw.api.enums.shared.ELocationType;

import java.util.*;

public enum EAreaAttributeSubcategory {

    /* =======================
       CATEGORÍAS SIN SUBLISTA
       ======================= */

    TRAP(EAreaAttributeCategory.TRAP, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    FEATURE(EAreaAttributeCategory.FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    FIND(EAreaAttributeCategory.FIND, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =======================
       UNNATURAL ENTITY
       ======================= */

    DIVINE_ENTITY(EAreaAttributeCategory.UNNATURAL_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PLANAR_ENTITY(EAreaAttributeCategory.UNNATURAL_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    UNDEAD(EAreaAttributeCategory.UNNATURAL_ENTITY, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =======================
       HAZARD
       ======================= */

    UNNATURAL_HAZARD(EAreaAttributeCategory.HAZARD, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    NATURAL_HAZARD(EAreaAttributeCategory.HAZARD, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =======================
       CREATURE
       ======================= */

    CREATURE(EAreaAttributeCategory.CREATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =======================
       UNNATURAL FEATURE
       ======================= */

    DIVINE_FEATURE(EAreaAttributeCategory.UNNATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    PLANAR_FEATURE(EAreaAttributeCategory.UNNATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    ARCANE_FEATURE(EAreaAttributeCategory.UNNATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =======================
       NATURAL FEATURE
       ======================= */

    LAIR(EAreaAttributeCategory.NATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    TERRAIN_CHANGE(EAreaAttributeCategory.NATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    WATER_FEATURE(EAreaAttributeCategory.NATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    LANDMARK(EAreaAttributeCategory.NATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    FLORA(EAreaAttributeCategory.NATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    FAUNA(EAreaAttributeCategory.NATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    RESOURCE(EAreaAttributeCategory.NATURAL_FEATURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =======================
       EVIDENCE
       ======================= */

    TRACKS(EAreaAttributeCategory.EVIDENCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    REMAINS(EAreaAttributeCategory.EVIDENCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DEBRIS(EAreaAttributeCategory.EVIDENCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    STASH(EAreaAttributeCategory.EVIDENCE, Set.of(ELocationType.WORLD, ELocationType.AREA)),

    /* =======================
       STRUCTURE
       ======================= */

    ENIGMATIC(EAreaAttributeCategory.STRUCTURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    INFRASTRUCTURE(EAreaAttributeCategory.STRUCTURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    DWELLING(EAreaAttributeCategory.STRUCTURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    RELIGIOUS(EAreaAttributeCategory.STRUCTURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    RUIN(EAreaAttributeCategory.STRUCTURE, Set.of(ELocationType.WORLD, ELocationType.AREA)),
    STEADING(EAreaAttributeCategory.STRUCTURE, Set.of(ELocationType.WORLD)),;

    /* =======================
       CAMPO Y CONSTRUCTOR
       ======================= */

    private final EAreaAttributeCategory category;
    private final Set<ELocationType> locationTypes;
    private static final Map<EAreaAttributeCategory, List<EAreaAttributeSubcategory>> map = new HashMap<>();
    private static final Map<ELocationType, List<EAreaAttributeSubcategory>> locationMap = new HashMap<>();

    static {
        for(EAreaAttributeCategory c : EAreaAttributeCategory.values()) {
            map.put(c, getByCategoryInternal(c));
        }
            List<EAreaAttributeSubcategory> areaList = new ArrayList<>();
            List<EAreaAttributeSubcategory> worldList = new ArrayList<>();

            for (EAreaAttributeSubcategory c : EAreaAttributeSubcategory.values()) {
                if (c.locationTypes.contains(ELocationType.AREA))  areaList.add(c);
                if (c.locationTypes.contains(ELocationType.WORLD)) worldList.add(c);
            }

            locationMap.put(ELocationType.AREA,  Collections.unmodifiableList(areaList));
            locationMap.put(ELocationType.WORLD, Collections.unmodifiableList(worldList));
    }

    EAreaAttributeSubcategory(EAreaAttributeCategory category, Set<ELocationType> locationTypes) {
        this.category = category;
        this.locationTypes = locationTypes;
    }

    public EAreaAttributeCategory getCategory() {
        return category;
    }
    public Set<ELocationType> getLocationTypes() {return locationTypes;}

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

    public static List<EAreaAttributeSubcategory> getByLocationType(ELocationType locationType) {
        return locationMap.get(locationType);
    }
}
