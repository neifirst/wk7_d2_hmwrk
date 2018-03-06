import java.util.ArrayList;

public class Fighter extends Hero {

    private ArrayList<FighterSpecialTypes> specials;


    public Fighter(String name, String classType, int hpMax, int mpMax, int baseAttack, WeaponTypes weapon, int baseAc) {
        super(name, classType, hpMax, mpMax, baseAttack, weapon, baseAc);
        this.specials = new ArrayList<>();
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
}
