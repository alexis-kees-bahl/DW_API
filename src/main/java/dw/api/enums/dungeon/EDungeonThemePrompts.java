package dw.api.enums.dungeon;

public enum EDungeonThemePrompts {

    /*====================
    DUNGEON THEME → HOPEFUL
    ====================*/

        NATURE(EDungeonThemeCategory.HOPEFUL),
        GROWTH(EDungeonThemeCategory.HOPEFUL),
        LAW(EDungeonThemeCategory.HOPEFUL),
        ORDER(EDungeonThemeCategory.HOPEFUL),
        BEAUTY(EDungeonThemeCategory.HOPEFUL),
        WONDER(EDungeonThemeCategory.HOPEFUL),
        HEALING(EDungeonThemeCategory.HOPEFUL),
        RECOVERY(EDungeonThemeCategory.HOPEFUL),
        PROTECTION(EDungeonThemeCategory.HOPEFUL),
        DEFENSE(EDungeonThemeCategory.HOPEFUL),
        COMPLETION(EDungeonThemeCategory.HOPEFUL),
        INHERITANCE(EDungeonThemeCategory.HOPEFUL),
        LEGACY(EDungeonThemeCategory.HOPEFUL),
        BALANCE(EDungeonThemeCategory.HOPEFUL),
        HARMONY(EDungeonThemeCategory.HOPEFUL),
        LIGHT(EDungeonThemeCategory.HOPEFUL),
        LIFE(EDungeonThemeCategory.HOPEFUL),
        PROPHECY(EDungeonThemeCategory.HOPEFUL),
        DIVINE_INFLUENCE(EDungeonThemeCategory.HOPEFUL),
        TRANSCENDENCE(EDungeonThemeCategory.HOPEFUL),

    /*====================
    DUNGEON THEME → MYSTERIOUS
    ====================*/

        BURGLARY(EDungeonThemeCategory.MYSTERIOUS),
        THEFT(EDungeonThemeCategory.MYSTERIOUS),
        DESIRE(EDungeonThemeCategory.MYSTERIOUS),
        OBSESSION(EDungeonThemeCategory.MYSTERIOUS),
        SECRETS(EDungeonThemeCategory.MYSTERIOUS),
        DECEPTION(EDungeonThemeCategory.MYSTERIOUS),
        IMITATION(EDungeonThemeCategory.MYSTERIOUS),
        MIMICRY(EDungeonThemeCategory.MYSTERIOUS),
        INVERSION(EDungeonThemeCategory.MYSTERIOUS),
        REVERSAL(EDungeonThemeCategory.MYSTERIOUS),
        ELEMENT(EDungeonThemeCategory.MYSTERIOUS),
        TRANSFORMATION(EDungeonThemeCategory.MYSTERIOUS),
        SHADOW(EDungeonThemeCategory.MYSTERIOUS),
        SPIRITS(EDungeonThemeCategory.MYSTERIOUS),
        CRYPTIC_KNOWLEDGE(EDungeonThemeCategory.MYSTERIOUS),
        DIVINATION(EDungeonThemeCategory.MYSTERIOUS),
        SCRYING(EDungeonThemeCategory.MYSTERIOUS),
        MADNESS(EDungeonThemeCategory.MYSTERIOUS),
        MAGIC_TYPE(EDungeonThemeCategory.MYSTERIOUS),

    /*====================
    DUNGEON THEME → GRIM
    ====================*/

        PRIDE(EDungeonThemeCategory.GRIM),
        HUBRIS(EDungeonThemeCategory.GRIM),
        HUNGER(EDungeonThemeCategory.GRIM),
        GLUTTONY(EDungeonThemeCategory.GRIM),
        GREED(EDungeonThemeCategory.GRIM),
        AVARICE(EDungeonThemeCategory.GRIM),
        WILDNESS(EDungeonThemeCategory.GRIM),
        SAVAGERY(EDungeonThemeCategory.GRIM),
        DEVOTION(EDungeonThemeCategory.GRIM),
        SACRIFICE(EDungeonThemeCategory.GRIM),
        FORBIDDEN_KNOWLEDGE(EDungeonThemeCategory.GRIM),
        CONTROL(EDungeonThemeCategory.GRIM),
        DOMINANCE(EDungeonThemeCategory.GRIM),
        PAIN(EDungeonThemeCategory.GRIM),
        TORTURE(EDungeonThemeCategory.GRIM),
        WRATH(EDungeonThemeCategory.GRIM),
        WAR(EDungeonThemeCategory.GRIM),
        TRAGEDY(EDungeonThemeCategory.GRIM),
        LOSS(EDungeonThemeCategory.GRIM),
        CHAOS(EDungeonThemeCategory.GRIM),
        CORRUPTION(EDungeonThemeCategory.GRIM),
        DARKNESS(EDungeonThemeCategory.GRIM),
        DEATH(EDungeonThemeCategory.GRIM),

    /*====================
    DUNGEON THEME → GONZO
    ====================*/

        CONSTRUCTS(EDungeonThemeCategory.GONZO),
        ROBOTS(EDungeonThemeCategory.GONZO),
        UNEXPECTED_SENTIENCE(EDungeonThemeCategory.GONZO),
        SPACE_TIME_TRAVEL(EDungeonThemeCategory.GONZO),
        ADVANCED_TECHNOLOGY(EDungeonThemeCategory.GONZO),
        UTTER_INSANITY(EDungeonThemeCategory.GONZO),
        ALIEN_LIFE(EDungeonThemeCategory.GONZO),
        COSMIC_ALIGNMENT(EDungeonThemeCategory.GONZO),
        OTHER_PLANES(EDungeonThemeCategory.GONZO),
        DEMONS(EDungeonThemeCategory.GONZO),
        DEVILS(EDungeonThemeCategory.GONZO),
        UNSPEAKABLE_HORRORS(EDungeonThemeCategory.GONZO),
        ELDER_GODS(EDungeonThemeCategory.GONZO),
        ROLL_TWICE(EDungeonThemeCategory.GONZO);

        private final EDungeonThemeCategory category;
        EDungeonThemePrompts(EDungeonThemeCategory category) {this.category=category;}
        public EDungeonThemeCategory getCategory() {return category;}

}
