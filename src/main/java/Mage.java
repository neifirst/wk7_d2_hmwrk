import java.util.ArrayList;

public class Mage extends Hero {

    private ArrayList<MageSpellTypes> spells;
    private int secondaryHit;

    public Mage(String name, String classType, int hpMax, int baseAttack, WeaponTypes weapon, ArrayList<MageSpellTypes> spells) {
        super(name, classType, hpMax, baseAttack, weapon);
        this.spells = new ArrayList<>();
        this.secondaryHit = 0;
    }

    public ArrayList<MageSpellTypes> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<MageSpellTypes> spells) {
        this.spells = spells;
    }

    public void gainSpell(MageSpellTypes spell) {
        spells.add(spell);
    }

    public int spellCount() {
        return spells.size();
    }

    public int getSecondaryHit() {
        return secondaryHit;
    }

    public void setSecondaryHit(int secondaryHit) {
        this.secondaryHit = secondaryHit;
    }

    public int secondaryAttack(Enemy enemy) {
        this.secondaryHit = (this.spells.get(0)).getMageSpell();
        enemy.setHp(enemy.getHp() - this.getSecondaryHit());
        return this.getSecondaryHit();
    }
}
