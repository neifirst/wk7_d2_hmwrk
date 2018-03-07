import java.util.ArrayList;

public class Party implements IRest {

    private ArrayList<Hero> heroes;
    private int gold;

    public Party(ArrayList<Hero> heroes, int gold) {
        this.heroes = heroes;
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    public void changeGold(int gold) {
        this.gold = this.gold + gold;
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

    public void attackRound(Enemy enemy) {
        for (Hero member : heroes) {
            member.primaryAttack(enemy);
        }
    }

    public void primaryAttack(Hero hero, Enemy enemy) {
        hero.primaryAttack(enemy);
    }

    public void secondaryAttack(Hero hero, Enemy enemy) {
            if (hero instanceof Mage) {
                Mage mage = (Mage) hero;
                mage.secondaryAttack(enemy);
            }else if(hero instanceof Fighter){
                Fighter fighter = (Fighter) hero;
                fighter.secondaryAttack(enemy);
            }else if(hero instanceof Cleric) {
                Cleric cleric = (Cleric) hero;
                cleric.secondaryAttack(enemy);
            }else if(hero instanceof Thief) {
                Thief thief = (Thief) hero;
                thief.secondaryAttack(enemy);
            }

    }

    public void getGoldAndXp(Enemy enemy) {
        this.changeGold(enemy.getTreasure());

        for (Hero hero : heroes) {
            hero.setXp(hero.getXp() + enemy.getExpWorth());
        }
    }

    @Override
    public String rest() {
        return "You have disturbing dreams of code from the abyss...";
    }
}
