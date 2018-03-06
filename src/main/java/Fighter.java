import java.util.ArrayList;

public class Fighter extends Hero {

    private ArrayList<FighterSpecialTypes> specials;
    private int secondaryHit;


    public Fighter(String name, String classType, int hpMax, int baseAttack, WeaponTypes weapon) {
        super(name, classType, hpMax, baseAttack, weapon);
        this.specials = new ArrayList<>();
        this.secondaryHit = 0;
    }



    public ArrayList<FighterSpecialTypes> getSpecials() {
        return specials;
    }

    public void setSpecials(ArrayList<FighterSpecialTypes> specials) {
        this.specials = specials;
    }

    public void gainSpecial(FighterSpecialTypes special) {
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
