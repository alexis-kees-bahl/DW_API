package dw.api.enums.steading;

public enum ESteadingTag {

    SAFE(false),
    RELIGION(true),
    EXOTIC(true),
    RESOURCE(true),
    NEED(true),
    OATH(true),
    TRADE(true),
    MARKET(false),
    ENMITY(true),
    HISTORY(true),
    ARCANE(false),
    DIVINE(false),
    GUILD(true),
    PERSONAGE(true),
    DWARVEN(false),
    ELVEN(false),
    CRAFT(true),
    LAWLESS(false),
    BLIGHT(true),
    POWER(true),
    BARREN(false),
    BLIGHTED(false),
    CIVILIZED(false),
    CONTESTED(false),
    DEFENSIBLE(false),
    DIFFICULT(false),
    ENCHANTED(false),
    HOLY_UNHOLY(false),
    PROPERTY_OF(true),
    RELIGIOUS(false);

    // ----------------------------------------

    private final boolean requiresParameter;

    ESteadingTag(boolean requiresParameter) {
        this.requiresParameter = requiresParameter;
    }

    public boolean requiresParameter() { return requiresParameter; }
}
