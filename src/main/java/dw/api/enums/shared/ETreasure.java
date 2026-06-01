package dw.api.enums.shared;

public enum ETreasure {
    T01(1, "A few coins, 2d8 or so"),
    T02(2, "A useful item"),
    T03(3, "Several coins, about 4d10"),
    T04(4, "A small valuable (gem, art), worth 2d10x10 coins, 0 weight"),
    T05(5, "Some minor magical trinket"),
    T06(6, "Useful clue (map, note, etc.)"),
    T07(7, "Bag of coins, 1d4x100, 1 weight per 100"),
    T08(8, "A small item (gem, art) of great value (2d6x100 coins, 0 weight)"),
    T09(9, "A chest of coins and other small valuables (worth 3d6x100 coins, 1 weight per 100)"),
    T10(10, "A magical item or magical effect"),
    T11(11, "Many bags of coins, 2d4x100 or so"),
    T12(12, "A sign of office (crown, banner) worth 3d4x100 coins (1 weight)"),
    T13(13, "A large art item worth 4d4x100 coins (1 weight)"),
    T14(14, "Unique item worth at least 5d4x100 coins"),
    T15(15, "Everything needed to learn a new spell, and roll again"),
    T16(16, "A portal or secret path (or directions to one), and roll again"),
    T17(17, "Something relating to one of the characters, and roll again"),
    T18(18, "A hoard: 1d10x1000 coins (1 weight per 100), and 1d10x10 gems worth 2d6x100 each");

    // ----------------------------------------

    private final int number;
    private final String label;

    ETreasure(int number, String label) {
        this.number = number;
        this.label = label;
    }

    public int getNumber() { return number; }
    public String getLabel() { return label; }
}
