import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    Hero hero;
    Enemy enemy;


    @Before
    public void setUp() throws Exception {
        hero = new Fighter("Minsc", "Paladin", 60, 0, 10, WeaponTypes.SWORD, 10);
        enemy = new Enemy("Goblin", 30, 0, 15, 9);
    }

    @Test
    public void canPrimaryAttack() {
        hero.attack(1, enemy);
        assertEquals(22, hero.getHit());
        assertEquals(8, enemy.getHp());

    }
}
