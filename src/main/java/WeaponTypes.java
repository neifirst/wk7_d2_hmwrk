public enum WeaponTypes {

    FISTS(2),
    DAGGER(4),
    STAFF(4),
    AXE(10),
    MACE(10),
    SWORD(12),
    SLING(4),
    SHORTBOW(8),
    LONGBOW(10),
    CROSSBOW(12);


    private int damage;

    WeaponTypes(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
