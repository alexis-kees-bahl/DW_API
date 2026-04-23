package dw.api.enums.creature;

public enum ECreaturePrompt {

    /* =========================
       MONSTER → EXTRAPLANAR
       ========================= */

    DIVINE_DEMONIC_LORD(ECreatureSubcategory.EXTRAPLANAR),
    ANGEL_DEMON(ECreatureSubcategory.EXTRAPLANAR),
    CHERUB_IMP(ECreatureSubcategory.EXTRAPLANAR),
    ELEMENTAL(ECreatureSubcategory.EXTRAPLANAR),

    /* =========================
       MONSTER → LEGENDARY
       ========================= */

    HUGE_ODDITY(ECreatureSubcategory.LEGENDARY),
    DRAGON_BEAST(ECreatureSubcategory.LEGENDARY),
    GIANT_BEAST(ECreatureSubcategory.LEGENDARY),
    DRAGON(ECreatureSubcategory.LEGENDARY),
    GIANT(ECreatureSubcategory.LEGENDARY),
    HUGE_BEAST(ECreatureSubcategory.LEGENDARY),

    /* =========================
       MONSTER → UNDEAD
       ========================= */

    LICH(ECreatureSubcategory.UNDEAD),
    VAMPIRE(ECreatureSubcategory.UNDEAD),
    MUMMY(ECreatureSubcategory.UNDEAD),
    WIGHT(ECreatureSubcategory.UNDEAD),
    WRAITH(ECreatureSubcategory.UNDEAD),
    WISP(ECreatureSubcategory.UNDEAD),
    GHOST(ECreatureSubcategory.UNDEAD),
    SPECTER(ECreatureSubcategory.UNDEAD),
    SKELETON(ECreatureSubcategory.UNDEAD),
    ZOMBIE(ECreatureSubcategory.UNDEAD),
    GHOUL(ECreatureSubcategory.UNDEAD),

    /* =========================
       MONSTER → UNUSUAL
       ========================= */

    SLIME(ECreatureSubcategory.UNUSUAL),
    OOZE(ECreatureSubcategory.UNUSUAL),
    JELLY(ECreatureSubcategory.UNUSUAL),
    PLANT_MONSTER(ECreatureSubcategory.UNUSUAL),
    FUNGUS(ECreatureSubcategory.UNUSUAL),
    PARASITE(ECreatureSubcategory.UNUSUAL),
    GOLEM(ECreatureSubcategory.UNUSUAL),
    HOMUNCULUS(ECreatureSubcategory.UNUSUAL),
    FEY(ECreatureSubcategory.UNUSUAL),
    FAIRY(ECreatureSubcategory.UNUSUAL),

    /* =========================
       MONSTER → BEASTLY
       ========================= */

    BEAST_ABERRANCE(ECreatureSubcategory.BEASTLY),
    BEAST_ELEMENT(ECreatureSubcategory.BEASTLY),
    BEAST_ODDITY(ECreatureSubcategory.BEASTLY),
    BEAST_ABILITY(ECreatureSubcategory.BEASTLY),
    BEAST_PLUS_BEAST(ECreatureSubcategory.BEASTLY),

    /* =========================
       MONSTER → WILD HUMANOID
       ========================= */

    OGRE(ECreatureSubcategory.WILD_HUMANOID),
    TROLL(ECreatureSubcategory.WILD_HUMANOID),
    ORC(ECreatureSubcategory.WILD_HUMANOID),
    HOBGOBLIN(ECreatureSubcategory.WILD_HUMANOID),
    GNOLL(ECreatureSubcategory.WILD_HUMANOID),
    GOBLIN(ECreatureSubcategory.WILD_HUMANOID),
    KOBOLD(ECreatureSubcategory.WILD_HUMANOID),
    HUMANOID_ODDITY(ECreatureSubcategory.WILD_HUMANOID),
    HUMANOID_BEAST(ECreatureSubcategory.WILD_HUMANOID),

    /* =========================
       BEAST → WATER-GOING
       ========================= */

    WHALE(ECreatureSubcategory.WATER_GOING),
    SQUID(ECreatureSubcategory.WATER_GOING),
    OCTOPUS(ECreatureSubcategory.WATER_GOING),
    DOLPHIN(ECreatureSubcategory.WATER_GOING),
    SHARK(ECreatureSubcategory.WATER_GOING),
    ALLIGATOR(ECreatureSubcategory.WATER_GOING),
    CROCODILE(ECreatureSubcategory.WATER_GOING),
    TURTLE(ECreatureSubcategory.WATER_GOING),
    FISH(ECreatureSubcategory.WATER_GOING),
    CRAB(ECreatureSubcategory.WATER_GOING),
    LOBSTER(ECreatureSubcategory.WATER_GOING),
    FROG(ECreatureSubcategory.WATER_GOING),
    TOAD(ECreatureSubcategory.WATER_GOING),
    EEL(ECreatureSubcategory.WATER_GOING),
    SNAKE(ECreatureSubcategory.WATER_GOING),
    CLAM(ECreatureSubcategory.WATER_GOING),
    OYSTER(ECreatureSubcategory.WATER_GOING),
    SNAIL(ECreatureSubcategory.WATER_GOING),
    ANEMONE(ECreatureSubcategory.WATER_GOING),
    INSECT(ECreatureSubcategory.WATER_GOING),

    /* =========================
       BEAST → AIRBORNE
       ========================= */

    PTERANODON(ECreatureSubcategory.AIRBORNE),
    CONDOR(ECreatureSubcategory.AIRBORNE),
    EAGLE(ECreatureSubcategory.AIRBORNE),
    OWL(ECreatureSubcategory.AIRBORNE),
    HAWK(ECreatureSubcategory.AIRBORNE),
    FALCON(ECreatureSubcategory.AIRBORNE),
    HERON(ECreatureSubcategory.AIRBORNE),
    CRANE(ECreatureSubcategory.AIRBORNE),
    STORK(ECreatureSubcategory.AIRBORNE),
    CROW(ECreatureSubcategory.AIRBORNE),
    RAVEN(ECreatureSubcategory.AIRBORNE),
    GULL(ECreatureSubcategory.AIRBORNE),
    ALBATROSS(ECreatureSubcategory.AIRBORNE),
    WATERBIRD(ECreatureSubcategory.AIRBORNE),
    SONGBIRD(ECreatureSubcategory.AIRBORNE),
    PARROT(ECreatureSubcategory.AIRBORNE),
    CHICKEN(ECreatureSubcategory.AIRBORNE),
    DUCK(ECreatureSubcategory.AIRBORNE),
    GOOSE(ECreatureSubcategory.AIRBORNE),
    BEE(ECreatureSubcategory.AIRBORNE),
    WASP(ECreatureSubcategory.AIRBORNE),
    LOCUST(ECreatureSubcategory.AIRBORNE),
    DRAGONFLY(ECreatureSubcategory.AIRBORNE),
    MOTH(ECreatureSubcategory.AIRBORNE),
    MOSQUITO(ECreatureSubcategory.AIRBORNE),
    GNAT(ECreatureSubcategory.AIRBORNE),
    FIREFLY(ECreatureSubcategory.AIRBORNE),

    /* =========================
       BEAST → EARTHBOUND
       ========================= */

    MAMMOTH(ECreatureSubcategory.EARTHBOUND),
    DINOSAUR(ECreatureSubcategory.EARTHBOUND),
    OX(ECreatureSubcategory.EARTHBOUND),
    RHINO(ECreatureSubcategory.EARTHBOUND),
    BEAR(ECreatureSubcategory.EARTHBOUND),
    APE(ECreatureSubcategory.EARTHBOUND),
    GORILLA(ECreatureSubcategory.EARTHBOUND),
    DEER(ECreatureSubcategory.EARTHBOUND),
    HORSE(ECreatureSubcategory.EARTHBOUND),
    CAMEL(ECreatureSubcategory.EARTHBOUND),
    CAT(ECreatureSubcategory.EARTHBOUND),
    LION(ECreatureSubcategory.EARTHBOUND),
    PANTHER(ECreatureSubcategory.EARTHBOUND),
    BOAR(ECreatureSubcategory.EARTHBOUND),
    PIG(ECreatureSubcategory.EARTHBOUND),
    DOG(ECreatureSubcategory.EARTHBOUND),
    FOX(ECreatureSubcategory.EARTHBOUND),
    WOLF(ECreatureSubcategory.EARTHBOUND),
    VOLE(ECreatureSubcategory.EARTHBOUND),
    RAT(ECreatureSubcategory.EARTHBOUND),
    WEASEL(ECreatureSubcategory.EARTHBOUND),
    LIZARD(ECreatureSubcategory.EARTHBOUND),
    ANT(ECreatureSubcategory.EARTHBOUND),
    CENTIPEDE(ECreatureSubcategory.EARTHBOUND),
    SCORPION(ECreatureSubcategory.EARTHBOUND),
    SLUG(ECreatureSubcategory.EARTHBOUND),
    WORM(ECreatureSubcategory.EARTHBOUND),
    TERMITE(ECreatureSubcategory.EARTHBOUND),
    TICK(ECreatureSubcategory.EARTHBOUND),
    LOUSE(ECreatureSubcategory.EARTHBOUND),

    /* =========================
       HUMANOID → RARE
       ========================= */

    CLANK(ECreatureSubcategory.RARE),
    DRAKONA(ECreatureSubcategory.RARE),
    INFERNIS(ECreatureSubcategory.RARE),
    HUMAN_BEAST(ECreatureSubcategory.RARE),

    /* =========================
       HUMANOID → UNCOMMON
       ========================= */

    DWARF(ECreatureSubcategory.UNCOMMON),
    HALFLING(ECreatureSubcategory.UNCOMMON),
    ELF(ECreatureSubcategory.UNCOMMON),
    FAERIE(ECreatureSubcategory.UNCOMMON),
    FUNGRIL(ECreatureSubcategory.UNCOMMON),
    GIANT_HUMANOID(ECreatureSubcategory.UNCOMMON),
    KATARI(ECreatureSubcategory.UNCOMMON),
    RIBBET(ECreatureSubcategory.UNCOMMON),

    /* =========================
       HUMANOID → COMMON
       ========================= */

    MIXED_RACE_HUMANOID(ECreatureSubcategory.COMMON),
    HUMAN(ECreatureSubcategory.COMMON),
    FAUN(ECreatureSubcategory.COMMON),
    FIRBOLG(ECreatureSubcategory.COMMON),
    GALAPA(ECreatureSubcategory.COMMON),
    ORC_COMMON(ECreatureSubcategory.COMMON),
    SIMIAH(ECreatureSubcategory.COMMON);


    private final ECreatureSubcategory subcategory;

    ECreaturePrompt(ECreatureSubcategory subcategory) {
        this.subcategory = subcategory;
    }

    public ECreatureSubcategory getSubcategory() {
        return subcategory;
    }

}

