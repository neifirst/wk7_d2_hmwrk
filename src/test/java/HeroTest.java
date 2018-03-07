import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    Hero hero;
    Enemy enemy;
    private ArrayList<FighterSpecialTypes> fighterSpecials;


    @Before
    public void setUp() throws Exception {
        hero = new Fighter("Minsc", "Paladin", 60, 10, WeaponTypes.SWORD, fighterSpecials);
        enemy = new Goblin("Goblin", 30, 15, 5, 10);
    }

    @Test
    public void canPrimaryAttack() {
        hero.primaryAttack(enemy);
        assertEquals(22, hero.getHit());
        assertEquals(8, enemy.getHp());

    }

    @Test
    public void canLevelUp() {
        assertEquals("Minsc has levelled up!", hero.levelUp(hero));
    }
}
