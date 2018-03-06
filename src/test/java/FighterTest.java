import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FighterTest {

    Fighter fighter;
    ArrayList<FighterSpecialTypes> special;

    @Before
    public void setUp() throws Exception {
        fighter = new Fighter("Minsc", "Paladin", 60, 0, 10, WeaponTypes.SWORD, 10);
        special = new ArrayList<>();
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

}
