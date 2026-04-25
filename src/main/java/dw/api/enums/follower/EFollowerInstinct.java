package dw.api.enums.follower;

public enum EFollowerInstinct {

    LOOT_AND_PILLAGE("Loot, pillage, and burn"),
    HOLD_GRUDGE("Hold a grudge and seek payback"),
    QUESTION_AUTHORITY("Question leadership or authority"),
    LORD_OVER_OTHERS("Lord over others"),
    ACT_IMPULSIVELY("Act impulsively"),
    GIVE_IN_TO_TEMPTATION("Give in to temptation"),
    SLACK_OFF("Slack off"),
    AVOID_DANGER("Avoid danger or punishment");

    private final String description;

    EFollowerInstinct(String description) {
        this.description = description;
    }

    public String getDescription() { return description; }

}
