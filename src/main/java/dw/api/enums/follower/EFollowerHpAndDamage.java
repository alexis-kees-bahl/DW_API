package dw.api.enums.follower;

public enum EFollowerHpAndDamage {

    WEAK(3, 4),
    STANDARD(6, 6),
    TOUGH(9, 8);

    private final int hp;
    private final int damageDie;

    EFollowerHpDamage(int hp, int damageDie) {
        this.hp = hp;
        this.damageDie = damageDie;
    }

    public int getHp() { return hp; }
    public int getDamageDie() { return damageDie; }


}
