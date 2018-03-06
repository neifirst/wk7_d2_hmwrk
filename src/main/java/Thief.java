public class Thief extends Hero {

    private ThiefSpecialTypes special;

    public Thief(String name, String classType, int hpMax, int mpMax, int baseAttack, WeaponTypes weapon, int baseAc) {
        super(name, classType, hpMax, mpMax, baseAttack, weapon, baseAc);
        this.special = special;
    }
}
