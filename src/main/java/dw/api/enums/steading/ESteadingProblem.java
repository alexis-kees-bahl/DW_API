package dw.api.enums.steading;

public enum ESteadingProblem {
    ARID_LAND(ESteadingSize.VILLAGE, "Surrounded by arid or uncultivable land: need (food)"),
    DEDICATED_TO_DEITY(ESteadingSize.VILLAGE, "Dedicated to a deity: religious (that deity), enmity (steading of opposing deity)"),
    RECENTLY_AT_WAR(ESteadingSize.VILLAGE, "Recently at war: -population, -prosperity if fought to the end, -defenses if lost"),
    MONSTER_PROBLEM(ESteadingSize.VILLAGE, "Monster problem: blight (that monster), need (adventurers)"),
    ABSORBED_VILLAGE(ESteadingSize.VILLAGE, "Absorbed another village: +population, lawless"),
    REMOTE_UNWELCOMING(ESteadingSize.VILLAGE, "Remote or unwelcoming: -prosperity, dwarven or elven or other non-human"),

    OUTGROWING_RESOURCE(ESteadingSize.TOWN, "Outgrowing a vital resource: need (that resource), trade (a steading with that resource)"),
    OFFERS_DEFENSE(ESteadingSize.TOWN, "Offers defense to others: oath (GM choice), -defenses"),
    OUTLAW_RUMOR(ESteadingSize.TOWN, "Outlaw rumored to live there: personage (the outlaw), enmity (steading preyed upon)"),
    CONTROLS_GOOD_OR_SERVICE(ESteadingSize.TOWN, "Controls a good/service: exotic (that good/service), enmity (steading with ambition)"),
    DISEASE_TOWN(ESteadingSize.TOWN, "Suffers from disease: -population"),
    POPULAR_MEETING_PLACE_TOWN(ESteadingSize.TOWN, "Popular meeting place: +population, lawless"),

    DEFENSIBLE_POSITION(ESteadingSize.KEEP, "Built on a naturally defensible position: safe, -population"),
    FORMERLY_OCCUPIED(ESteadingSize.KEEP, "Formerly occupied by another power: enmity (steadings of that power)"),
    BRIGAND_HAVEN(ESteadingSize.KEEP, "Safe haven for brigands: lawless"),
    SPECIFIC_THREAT(ESteadingSize.KEEP, "Built to defend from a specific threat: blight (that threat)"),
    BLOODY_WAR(ESteadingSize.KEEP, "Has seen horrible bloody war: history (battle), blight (restless spirits)"),
    WORST_RECRUITS(ESteadingSize.KEEP, "Is given the worst of the worst: need (skilled recruits)"),
    DISEASE_KEEP(ESteadingSize.KEEP, "Suffers from disease: -population"),
    POPULAR_MEETING_PLACE_KEEP(ESteadingSize.KEEP, "Popular meeting place: +population, -law"),

    OUTGROWN_RESOURCES(ESteadingSize.CITY, "Outgrown its resources: +population, need (food)"),
    DESIGNS_ON_TERRITORY(ESteadingSize.CITY, "Designs on nearby territory: enmity (nearby steadings), +defenses"),
    THEOCRACY(ESteadingSize.CITY, "Ruled by a theocracy: -defenses, power (divine)"),
    RULED_BY_PEOPLE(ESteadingSize.CITY, "Ruled by the people: -defenses, +population"),
    SUPERNATURAL_DEFENSES(ESteadingSize.CITY, "Supernatural defenses: +defenses, blight (related supernatural creatures)"),
    PLACE_OF_POWER(ESteadingSize.CITY, "Occupies a place of power: arcane, personage (watcher of the place of power), blight (arcane creatures)");

    // ----------------------------------------

    private final ESteadingSize size;
    private final String label;

    ESteadingProblem(ESteadingSize size, String label) {
        this.size = size;
        this.label = label;
    }

    public ESteadingSize getSize() { return size; }
    public String getLabel() { return label; }
}
