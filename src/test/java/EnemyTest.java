import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;
    Hero hero;

    @Before
    public void setUp() throws Exception {
        hero = new Fighter("Minsc", "Paladin", 60, 10, WeaponTypes.SWORD);
        enemy = new Goblin("Goblin", 30, 15);
    }

    @Test
    public void canAttack() {
        enemy.attack(hero);
        assertEquals(15, enemy.getHit());
        assertEquals(45, hero.getHp());

    }
}
