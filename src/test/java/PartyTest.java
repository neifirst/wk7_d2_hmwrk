import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    Hero fighter;
    Hero cleric;
    Hero mage;
    Hero thief;
    ArrayList<Hero> heroes;
    int gold;
    Party party;

    @Before
    public void setUp() throws Exception {
        fighter = new Fighter("Minsc", "Paladin", 60, 10, WeaponTypes.SWORD);
        cleric = new Cleric("Branwen", "Cleric", 50, 8, WeaponTypes.MACE);
        mage = new Mage("Xan", "Mage", 35, 4, WeaponTypes.STAFF);
        thief = new Thief("Ellie", "Thief", 45, 7, WeaponTypes.LONGBOW);

        heroes = new ArrayList<>();
        gold = 100;

        party = new Party(heroes, gold);

    }

    @Test
    public void canGetGold() {
        assertEquals(100, party.getGold());
    }

    @Test
    public void canSetGold() {
        party.setGold(120);
        assertEquals(120, party.getGold());
    }

    @Test
    public void canGetNoOfPartyMembers() {
        assertEquals(0, party.getNoOfPartyMembers());
    }

    @Test
    public void canAddHeroes() {
        party.addHero(fighter);
        assertEquals(1, party.getNoOfPartyMembers());
    }

    @Test
    public void canRemoveHeroes() {
        party.addHero(fighter);
        assertEquals(1, party.getNoOfPartyMembers());
        party.removeHeroes(fighter);
        assertEquals(0, party.getNoOfPartyMembers());
    }

//    @Test
//    public void canRest() {
//        party.rest();
//        assertEquals(, stereo.getVolume());
//    }
}
