import java.util.ArrayList;

public class Cleric extends Hero {

    private ArrayList<ClericSpellTypes> spells;
    private int secondaryHit;

    public Cleric(String name, String classType, int hpMax, int baseAttack, WeaponTypes weapon, ArrayList<ClericSpellTypes> spells) {
        super(name, classType, hpMax, baseAttack, weapon);
        this.spells = new ArrayList<>();
        this.secondaryHit = 0;
    }

    public ArrayList<ClericSpellTypes> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<ClericSpellTypes> spells) {
        this.spells = spells;
    }

    public void gainSpell(ClericSpellTypes spell) {
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
        this.secondaryHit = (this.spells.get(0)).getClericSpell();
        enemy.setHp(enemy.getHp() - this.getSecondaryHit());
        return this.getSecondaryHit();
    }
}
