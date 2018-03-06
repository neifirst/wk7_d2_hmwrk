import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Mage mage;
    ArrayList<MageSpellTypes> spells;
    Enemy enemy;

    @Before
    public void setUp() throws Exception {
        mage = new Mage("Xan", "Mage", 40, 4, WeaponTypes.STAFF);
        spells = new ArrayList<>();
        enemy = new Goblin("Goblin", 30, 15);
    }

    @Test
    public void canGetSpecialsCount() {
        assertEquals(0, mage.spellCount());
    }

    @Test
    public void canGainSpecial() {
        mage.gainSpell(MageSpellTypes.MAGICMISSILE);
        assertEquals(1, mage.spellCount());
    }

    @Test
    public void canSecondaryAttack() {
        mage.gainSpell(MageSpellTypes.MAGICMISSILE);
        mage.secondaryAttack(enemy);
        assertEquals(20, mage.getSecondaryHit());
        assertEquals(10, enemy.getHp());

    }

}
