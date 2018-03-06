public class Cleric extends Hero {

    private ClericSpellTypes spell;

    public Cleric(String name, String classType, int hpMax, int mpMax, int baseAttack, WeaponTypes weapon, int baseAc) {
        super(name, classType, hpMax, mpMax, baseAttack, weapon, baseAc);
        this.spell = spell;
    }
}
