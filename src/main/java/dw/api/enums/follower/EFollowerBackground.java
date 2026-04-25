package dw.api.enums.follower;

public enum EFollowerBackground {
    SERVITUDE("Life of servitude/oppression: +meek"),
    PAST_PRIME("Past prime: -1 to Quality, +1 wise"),
    LIFE_OF_DANGER("Has lived a life of danger: +2 tags"),
    UNREMARKABLE("Unremarkable"),
    PRIVILEGED("Has lived a life of privilege: +1 tag"),
    SPECIALIST("Specialist: +1 to Quality, -2 tags");

    private final String description;

    EFollowerBackground(String description) {
        this.description = description;
    }

    public String getDescription() { return description; }

}
