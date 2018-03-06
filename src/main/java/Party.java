import java.util.ArrayList;

public class Party {

    private ArrayList<Hero> heroes;
    private int gold;

    public Party(ArrayList<Hero> heroes, int gold) {
        this.heroes = heroes;
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getNoOfPartyMembers() {
        return heroes.size();
    }

    public void addHero(Hero hero) {
        heroes.add(hero);

    }

    public void removeHeroes(Hero hero) {
        heroes.remove(hero);
    }
}
