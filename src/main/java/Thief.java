import java.util.ArrayList;

public class Thief extends Hero {

    private ArrayList<ThiefSpecialTypes> specials;
    private int secondaryHit;

    public Thief(String name, String classType, int hpMax, int baseAttack, WeaponTypes weapon, ArrayList<ThiefSpecialTypes> specials) {
        super(name, classType, hpMax, baseAttack, weapon);
        this.specials = new ArrayList<>();
        this.secondaryHit = 0;
    }

    public ArrayList<ThiefSpecialTypes> getSpecials() {
        return specials;
    }

    public void setSpecials(ArrayList<ThiefSpecialTypes> specials) {
        this.specials = specials;
    }

    public void gainSpecial(ThiefSpecialTypes special) {
        specials.add(special);
    }

    public int specialsCount() {
        return specials.size();
    }

    public int getSecondaryHit() {
        return secondaryHit;
    }

    public void setSecondaryHit(int secondaryHit) {
        this.secondaryHit = secondaryHit;
    }

    public int secondaryAttack(Enemy enemy) {
        this.secondaryHit = (this.specials.get(0)).getSpecial();
        enemy.setHp(enemy.getHp() - this.getSecondaryHit());
        return this.getSecondaryHit();
    }
}
