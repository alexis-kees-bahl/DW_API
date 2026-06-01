package dw.api.enums.steading;

public enum ESteadingFeature {

    NATURAL_DEFENSES(ESteadingSize.VILLAGE, "Natural defenses: safe, +defenses"),
    ABUNDANT_RESOURCES(ESteadingSize.VILLAGE, "Abundant resources: +prosperity, resource (GM choice), enmity (GM choice)"),
    PROTECTED_BY_STEADING(ESteadingSize.VILLAGE, "Protected by another steading: oath (that steading), +defenses"),
    ON_MAJOR_ROAD(ESteadingSize.VILLAGE, "On a major road: trade (GM choice), +prosperity"),
    WIZARDS_TOWER(ESteadingSize.VILLAGE, "Built around a wizard's tower: personage (the wizard), blight (arcane creatures)"),
    RELIGIOUS_SIGNIFICANCE(ESteadingSize.VILLAGE, "Built on a site of religious significance: divine, history (GM choice)"),

    BOOMING(ESteadingSize.TOWN, "Booming: +booming, lawless"),
    AT_CROSSROADS(ESteadingSize.TOWN, "At a crossroads: market, +prosperity"),
    DEFENDED_BY_STEADING(ESteadingSize.TOWN, "Defended by another steading: oath (that steading), +defenses"),
    BUILT_AROUND_CHURCH(ESteadingSize.TOWN, "Built around a church: power (divine)"),
    CENTER_OF_CRAFT(ESteadingSize.TOWN, "Center of craft: craft (your choice), resource (something required for that craft)"),
    MILITARY_POST(ESteadingSize.TOWN, "Stands around a military post: +defenses"),

    NOBLE_FAMILY(ESteadingSize.KEEP, "Belongs to a noble family: +prosperity, power (political)"),
    SKILLED_COMMANDER(ESteadingSize.KEEP, "Run by a skilled commander: personage (the commander), +defenses"),
    TRADE_ROAD_WATCH(ESteadingSize.KEEP, "Stands watch over a trade road: +prosperity, guild (trade)"),
    SPECIAL_TROOPS(ESteadingSize.KEEP, "Used to train special troops: arcane, +population"),
    FERTILE_LAND(ESteadingSize.KEEP, "Surrounded by fertile land: remove need (Supplies)"),
    BORDER_WATCH(ESteadingSize.KEEP, "Stands on a border: +defenses, enmity (steading on the other side of the border)"),

    PERMANENT_DEFENSES(ESteadingSize.CITY, "Permanent defenses, such as walls: +defenses, oath (GM's choice)"),
    SINGLE_RULER(ESteadingSize.CITY, "Ruled by a single individual: personage (the ruler), power (political)"),
    DIVERSE(ESteadingSize.CITY, "Diverse: dwarven or elven or both"),
    TRADE_HUB(ESteadingSize.CITY, "Trade hub: trade (every nearby steading), +prosperity"),
    ANCIENT_RUINS(ESteadingSize.CITY, "Ancient, built on top of its own ruins: history (your choice), divine"),
    CENTER_OF_LEARNING(ESteadingSize.CITY, "Center of learning: arcane, craft (your choice), power (arcane)");

    // ----------------------------------------

    private final ESteadingSize size;
    private final String label;

    ESteadingFeature(ESteadingSize size, String label) {
        this.size = size;
        this.label = label;
    }

    public ESteadingSize getSize() { return size; }
    public String getLabel() { return label; }
}
