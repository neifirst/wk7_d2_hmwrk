import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FighterTest {

    Fighter fighter;
    ArrayList<FighterSpecialTypes> special;
    Enemy enemy;

    @Before
    public void setUp() throws Exception {
        fighter = new Fighter("Minsc", "Paladin", 60, 10, WeaponTypes.SWORD);
        special = new ArrayList<>();
        enemy = new Goblin("Goblin", 30, 15);
    }

    @Test
    public void canGetSpecialsCount() {
        assertEquals(0, fighter.specialsCount());
    }

    @Test
    public void canGainSpecial() {
        fighter.gainSpecial(FighterSpecialTypes.CLEAVE);
        assertEquals(1, fighter.specialsCount());
    }

    @Test
    public void canSecondaryAttack() {
        fighter.gainSpecial(FighterSpecialTypes.CLEAVE);
        fighter.secondaryAttack(enemy);
        assertEquals(30, fighter.getSecondaryHit());
        assertEquals(0, enemy.getHp());

    }

}
