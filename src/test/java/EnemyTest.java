import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;
    Hero hero;
    private ArrayList<FighterSpecialTypes> fighterSpecials;

    @Before
    public void setUp() throws Exception {
        hero = new Fighter("Minsc", "Paladin", 60, 10, WeaponTypes.SWORD, fighterSpecials);
        enemy = new Goblin("Goblin", 30, 15, 5, 10);
    }

    @Test
    public void canAttack() {
        enemy.attack(hero);
        assertEquals(15, enemy.getHit());
        assertEquals(45, hero.getHp());

    }

    @Test
    public void canDie() {
        assertEquals("Goblin is dead!", enemy.die());
    }
}
