public class Mage extends Hero {

    private MageSpellTypes spell;

    public Mage(String name, String classType, int hpMax, int mpMax, int baseAttack, WeaponTypes weapon, int baseAc) {
        super(name, classType, hpMax, mpMax, baseAttack, weapon, baseAc);
        this.spell = spell;
    }
}
