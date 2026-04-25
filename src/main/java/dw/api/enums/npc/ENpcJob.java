package dw.api.enums.npc;

import java.util.Set;

public enum ENpcJob {
    /*====================
NPC → OUTSIDER
====================*/

    HERMIT(Set.of(ENpcCategory.OUTSIDER)),
    PROPHET(Set.of(ENpcCategory.OUTSIDER, ENpcCategory.RELIGIOUS)),
    FUGITIVE(Set.of(ENpcCategory.OUTSIDER)),
    OUTLAW(Set.of(ENpcCategory.OUTSIDER)),
    EXILE(Set.of(ENpcCategory.OUTSIDER)),
    BARBARIAN(Set.of(ENpcCategory.OUTSIDER)),
    BEGGAR(Set.of(ENpcCategory.OUTSIDER, ENpcCategory.COMMONER)),
    VAGRANT(Set.of(ENpcCategory.OUTSIDER)),
    REFUGEE(Set.of(ENpcCategory.OUTSIDER)),
    HERDER(Set.of(ENpcCategory.OUTSIDER, ENpcCategory.COMMONER)),
    HUNTER(Set.of(ENpcCategory.OUTSIDER, ENpcCategory.COMMONER)),
    TRAPPER(Set.of(ENpcCategory.OUTSIDER)),
    DIPLOMAT(Set.of(ENpcCategory.OUTSIDER, ENpcCategory.SPECIALIST)),
    ENVOY(Set.of(ENpcCategory.OUTSIDER)),
    RARE_HUMANOID(Set.of(ENpcCategory.OUTSIDER)),
    OTHERWORLDLY(Set.of(ENpcCategory.OUTSIDER)),
    ARCANE(Set.of(ENpcCategory.OUTSIDER)),

/*====================
NPC → CRIMINAL
====================*/

    BANDIT(Set.of(ENpcCategory.CRIMINAL)),
    BRIGAND(Set.of(ENpcCategory.CRIMINAL)),
    THUG(Set.of(ENpcCategory.CRIMINAL)),
    CUTPURSE(Set.of(ENpcCategory.CRIMINAL)),
    THIEF(Set.of(ENpcCategory.CRIMINAL)),
    BODYGUARD(Set.of(ENpcCategory.CRIMINAL)),
    TOUGH(Set.of(ENpcCategory.CRIMINAL)),
    BURGLAR(Set.of(ENpcCategory.CRIMINAL)),
    CON_ARTIST(Set.of(ENpcCategory.CRIMINAL)),
    SWINDLER(Set.of(ENpcCategory.CRIMINAL)),
    DEALER(Set.of(ENpcCategory.CRIMINAL)),
    FENCE(Set.of(ENpcCategory.CRIMINAL)),
    RACKETEER(Set.of(ENpcCategory.CRIMINAL)),
    LIEUTENANT(Set.of(ENpcCategory.CRIMINAL)),
    CRIMINAL_BOSS(Set.of(ENpcCategory.CRIMINAL)),
    KINGPIN(Set.of(ENpcCategory.CRIMINAL)),

/*====================
NPC → COMMONER
====================*/

    LAYABOUT(Set.of(ENpcCategory.COMMONER)),
    SIMPLETON(Set.of(ENpcCategory.COMMONER)),
    URCHIN(Set.of(ENpcCategory.COMMONER)),
    LABORER(Set.of(ENpcCategory.COMMONER)),
    GRAVEDIGGER(Set.of(ENpcCategory.COMMONER)),
    FISHER(Set.of(ENpcCategory.COMMONER)),
    FARMER(Set.of(ENpcCategory.COMMONER)),
    MINER(Set.of(ENpcCategory.COMMONER)),
    QUARRIER(Set.of(ENpcCategory.COMMONER)),
    SERVANT(Set.of(ENpcCategory.COMMONER)),
    PAGE(Set.of(ENpcCategory.COMMONER)),
    DRIVER(Set.of(ENpcCategory.COMMONER)),
    PORTER(Set.of(ENpcCategory.COMMONER)),
    SAILOR(Set.of(ENpcCategory.COMMONER)),
    SENTRY(Set.of(ENpcCategory.COMMONER, ENpcCategory.SECURITY)),
    GUARD(Set.of(ENpcCategory.COMMONER, ENpcCategory.SECURITY)),
    APPRENTICE(Set.of(ENpcCategory.COMMONER)),
    ADVENTURER(Set.of(ENpcCategory.COMMONER)),

/*====================
NPC → TRADESPERSON
====================*/

    MUSICIAN(Set.of(ENpcCategory.TRADESPERSON)),
    TROUBADOUR(Set.of(ENpcCategory.TRADESPERSON)),
    ARTIST(Set.of(ENpcCategory.TRADESPERSON)),
    ACTOR(Set.of(ENpcCategory.TRADESPERSON)),
    ACROBAT(Set.of(ENpcCategory.TRADESPERSON)),
    COBBLER(Set.of(ENpcCategory.TRADESPERSON)),
    FURRIER(Set.of(ENpcCategory.TRADESPERSON)),
    TAILOR(Set.of(ENpcCategory.TRADESPERSON)),
    WEAVER(Set.of(ENpcCategory.TRADESPERSON)),
    BASKETMAKER(Set.of(ENpcCategory.TRADESPERSON)),
    POTTER(Set.of(ENpcCategory.TRADESPERSON)),
    CARPENTER(Set.of(ENpcCategory.TRADESPERSON)),
    MASON(Set.of(ENpcCategory.TRADESPERSON)),
    BAKER(Set.of(ENpcCategory.TRADESPERSON)),
    CHANDLER(Set.of(ENpcCategory.TRADESPERSON)),
    COOPER(Set.of(ENpcCategory.TRADESPERSON)),
    WHEELWRIGHT(Set.of(ENpcCategory.TRADESPERSON)),
    TANNER(Set.of(ENpcCategory.TRADESPERSON)),
    ROPEMAKER(Set.of(ENpcCategory.TRADESPERSON)),
    STABLEKEEPER(Set.of(ENpcCategory.TRADESPERSON)),
    HERBALIST(Set.of(ENpcCategory.TRADESPERSON)),
    VINTNER(Set.of(ENpcCategory.TRADESPERSON)),
    BREWER(Set.of(ENpcCategory.TRADESPERSON)),
    INNKEEP(Set.of(ENpcCategory.TRADESPERSON)),
    TAVERNKEEP(Set.of(ENpcCategory.TRADESPERSON)),
    SMITH(Set.of(ENpcCategory.TRADESPERSON)),
    ARMORER(Set.of(ENpcCategory.TRADESPERSON)),

/*====================
NPC → MERCHANT
====================*/

    RAW_MATERIALS(Set.of(ENpcCategory.MERCHANT)),
    SUPPLIES(Set.of(ENpcCategory.MERCHANT)),
    GENERAL_GOODS(Set.of(ENpcCategory.MERCHANT)),
    OUTFITTER(Set.of(ENpcCategory.MERCHANT)),
    GRAIN(Set.of(ENpcCategory.MERCHANT)),
    LIVESTOCK(Set.of(ENpcCategory.MERCHANT)),
    ALE(Set.of(ENpcCategory.MERCHANT)),
    WINE(Set.of(ENpcCategory.MERCHANT)),
    SPIRITS(Set.of(ENpcCategory.MERCHANT)),
    CLOTHING(Set.of(ENpcCategory.MERCHANT)),
    JEWELRY(Set.of(ENpcCategory.MERCHANT)),
    WEAPONS_MERCHANT(Set.of(ENpcCategory.MERCHANT)),
    ARMOR_MERCHANT(Set.of(ENpcCategory.MERCHANT)),
    SPICES(Set.of(ENpcCategory.MERCHANT)),
    TOBACCO(Set.of(ENpcCategory.MERCHANT)),
    LABOR(Set.of(ENpcCategory.MERCHANT)),
    SLAVES(Set.of(ENpcCategory.MERCHANT)),
    BOOKS(Set.of(ENpcCategory.MERCHANT)),
    SCROLLS(Set.of(ENpcCategory.MERCHANT)),
    MAGIC_SUPPLIES(Set.of(ENpcCategory.MERCHANT)),
    MAGIC_ITEMS(Set.of(ENpcCategory.MERCHANT)),

/*====================
NPC → SPECIALIST
====================*/

    CLERK(Set.of(ENpcCategory.SPECIALIST, ENpcCategory.AUTHORITY)),
    SCRIBE(Set.of(ENpcCategory.SPECIALIST)),
    UNDERTAKER(Set.of(ENpcCategory.SPECIALIST)),
    PERFUMER(Set.of(ENpcCategory.SPECIALIST)),
    NAVIGATOR(Set.of(ENpcCategory.SPECIALIST)),
    GUIDE(Set.of(ENpcCategory.SPECIALIST)),
    SPY(Set.of(ENpcCategory.SPECIALIST)),
    CARTOGRAPHER(Set.of(ENpcCategory.SPECIALIST)),
    LOCKSMITH(Set.of(ENpcCategory.SPECIALIST)),
    TINKER(Set.of(ENpcCategory.SPECIALIST)),
    ARCHITECT(Set.of(ENpcCategory.SPECIALIST)),
    ENGINEER(Set.of(ENpcCategory.SPECIALIST)),
    PHYSICIAN(Set.of(ENpcCategory.SPECIALIST)),
    APOTHECARY(Set.of(ENpcCategory.SPECIALIST)),
    SAGE(Set.of(ENpcCategory.SPECIALIST)),
    SCHOLAR(Set.of(ENpcCategory.SPECIALIST)),
    ALCHEMIST(Set.of(ENpcCategory.SPECIALIST)),
    ASTROLOGER(Set.of(ENpcCategory.SPECIALIST)),
    ILLUSIONIST(Set.of(ENpcCategory.SPECIALIST)),
    SORCERER(Set.of(ENpcCategory.SPECIALIST)),

/*====================
NPC → RELIGIOUS
====================*/

    HERETIC(Set.of(ENpcCategory.RELIGIOUS)),
    APOSTATE(Set.of(ENpcCategory.RELIGIOUS)),
    ZEALOT(Set.of(ENpcCategory.RELIGIOUS)),
    MENDICANT(Set.of(ENpcCategory.RELIGIOUS)),
    PILGRIM(Set.of(ENpcCategory.RELIGIOUS)),
    ACOLYTE(Set.of(ENpcCategory.RELIGIOUS)),
    NOVICE(Set.of(ENpcCategory.RELIGIOUS)),
    MONK(Set.of(ENpcCategory.RELIGIOUS)),
    NUN(Set.of(ENpcCategory.RELIGIOUS)),
    CULTIST(Set.of(ENpcCategory.RELIGIOUS)),
    PREACHER(Set.of(ENpcCategory.RELIGIOUS)),
    MISSIONARY(Set.of(ENpcCategory.RELIGIOUS)),
    TEMPLAR(Set.of(ENpcCategory.RELIGIOUS)),
    PROTECTOR(Set.of(ENpcCategory.RELIGIOUS)),
    PRIEST(Set.of(ENpcCategory.RELIGIOUS)),
    CLERIC(Set.of(ENpcCategory.RELIGIOUS)),
    HIGH_PRIEST(Set.of(ENpcCategory.RELIGIOUS)),

/*====================
NPC → SECURITY
====================*/

    MILITIA(Set.of(ENpcCategory.SECURITY)),
    SCOUT(Set.of(ENpcCategory.SECURITY)),
    WARDEN(Set.of(ENpcCategory.SECURITY)),
    WATCH(Set.of(ENpcCategory.SECURITY)),
    PATROL(Set.of(ENpcCategory.SECURITY)),
    FOOT_SOLDIER(Set.of(ENpcCategory.SECURITY)),
    ARCHER(Set.of(ENpcCategory.SECURITY)),
    OFFICER(Set.of(ENpcCategory.SECURITY)),
    CONSTABLE(Set.of(ENpcCategory.SECURITY)),
    CAVALRY(Set.of(ENpcCategory.SECURITY)),
    KNIGHT(Set.of(ENpcCategory.SECURITY)),
    HERO(Set.of(ENpcCategory.SECURITY)),
    GENERAL(Set.of(ENpcCategory.SECURITY)),

/*====================
NPC → AUTHORITY
====================*/

    MONEYMASTER(Set.of(ENpcCategory.AUTHORITY)),
    TOWN_CRIER(Set.of(ENpcCategory.AUTHORITY)),
    TAX_COLLECTOR(Set.of(ENpcCategory.AUTHORITY)),
    ADMINISTRATOR(Set.of(ENpcCategory.AUTHORITY)),
    ARMIGER(Set.of(ENpcCategory.AUTHORITY)),
    GENTRY(Set.of(ENpcCategory.AUTHORITY)),
    MAGISTRATE(Set.of(ENpcCategory.AUTHORITY)),
    JUDGE(Set.of(ENpcCategory.AUTHORITY)),
    GUILDMASTER(Set.of(ENpcCategory.AUTHORITY)),
    NOBLE(Set.of(ENpcCategory.AUTHORITY)),
    GREATER_NOBILITY(Set.of(ENpcCategory.AUTHORITY)),
    RULER(Set.of(ENpcCategory.AUTHORITY)),
    WARLORD(Set.of(ENpcCategory.AUTHORITY));

    // ----------------------------------------

    private final Set<ENpcCategory> categories;

    ENpcJob(Set<ENpcCategory> categories) {
        this.categories = categories;
    }

    public Set<ENpcCategory> getCategories() {
        return categories;
    }
}
