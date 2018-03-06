import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    Hero hero;
    Enemy enemy;


    @Before
    public void setUp() throws Exception {
        hero = new Fighter("Minsc", "Paladin", 60, 10, WeaponTypes.SWORD);
        enemy = new Goblin("Goblin", 30, 15);
    }

    @Test
    public void canPrimaryAttack() {
        hero.primaryAttack(enemy);
        assertEquals(22, hero.getHit());
        assertEquals(8, enemy.getHp());

    }
}
