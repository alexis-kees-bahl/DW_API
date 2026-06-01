package dw.api.enums.follower;

public enum EFollowerTag {

    WISE(true, "Knows all about ____ and can roll +Quality to Spout Lore about it on your behalf"),
    ARCHER(false, "Uses ranged attacks effectively and can roll +Quality to Volley on your behalf"),
    ATHLETIC(false, "Good at running, jumping, climbing and the like"),
    BEAUTIFUL(false, "Makes an impression, drawing admiration and attention"),
    CAUTIOUS(false, "Careful and methodical; avoids acting rashly"),
    CONNECTED(true, "Has friends or contacts in ____, a steading or group"),
    CUNNING(false, "Clever and observant; can roll +Quality to Discern Realities on your behalf"),
    DEVIOUS(false, "Deceitful, treacherous, tricky"),
    GROUP(false, "A team, gang, or mob, with all the strengths and disadvantages of greater numbers"),
    GUIDE(true, "Knows a particular steading or region and can roll +Quality to Spout Lore, Scout Ahead, or Navigate therein"),
    HARDY(false, "Tough, hard-working, and willing to put up with discomfort; gets +2 Load"),
    HEALER(false, "When tending wounds with bandages or herbs & poultice, adds Quality to the damage healed"),
    MEEK(false, "Accepts their lowly lot and will do degrading or unreasonable things without needing to Follow Orders"),
    MAGICAL(false, "Magical by nature or training and sensitive to the workings of magic"),
    ORGANIZED(false, "Makes and follows plans well; once they agree to a plan, no need to Order Followers as long as the plan doesn't go south"),
    SELF_SUFFICIENT(false, "Can live off the land and roll +Quality to Forage"),
    STEALTHY(false, "Can avoid detection and often get the drop on foes"),
    WARRIOR(false, "Takes +1 to their damage die roll; no need to Order Follower to get them to fight unless opposition is terrifying or overwhelming");

    // ----------------------------------------

    private final boolean requiresParameter;
    private final String description;

    EFollowerTag(boolean requiresParameter, String description) {
        this.requiresParameter = requiresParameter;
        this.description = description;
    }

    public boolean requiresParameter() { return requiresParameter; }
    public String getDescription() { return description; }
}
