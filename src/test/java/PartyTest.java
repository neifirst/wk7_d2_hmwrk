import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    Hero fighter;
    Hero cleric;
    Hero mage;
    Hero thief;
    ArrayList<FighterSpecialTypes> fighterSpecials;
    ArrayList<ClericSpellTypes> clericSpells;
    ArrayList<MageSpellTypes> mageSpells;
    ArrayList<ThiefSpecialTypes> thiefSpecials;
    ArrayList<Hero> heroes;
    int gold;
    Party party;
    Enemy goblin;

    @Before
    public void setUp() throws Exception {
        fighter = new Fighter("Minsc", "Paladin", 60, 10, WeaponTypes.SWORD, fighterSpecials);
        cleric = new Cleric("Branwen", "Cleric", 50, 8, WeaponTypes.MACE, clericSpells);
        mage = new Mage("Xan", "Mage", 35, 4, WeaponTypes.STAFF, mageSpells);
        thief = new Thief("Ellie", "Thief", 45, 7, WeaponTypes.LONGBOW, thiefSpecials);
        mageSpells = new ArrayList<>();
        heroes = new ArrayList<>();
        gold = 100;
        party = new Party(heroes, gold);
        goblin = new Goblin("Goblin", 70, 15, 5, 10);


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

    @Test
    public void partyCanAttack() {
        party.addHero(fighter);
        party.addHero(cleric);
        party.addHero(mage);
        party.addHero(thief);

        party.attackRound(goblin);

        assertEquals(5, goblin.getHp());
    }

    @Test
    public void partyCanPrimaryAttackWithOneHero() {
        party.addHero(fighter);
        party.addHero(cleric);
        party.addHero(mage);
        party.addHero(thief);

        party.primaryAttack(fighter, goblin);

        assertEquals(48, goblin.getHp());
    }

    @Test
    public void partyCanSecondaryAttackWithOneHero() {
        party.addHero(fighter);
        party.addHero(cleric);
        party.addHero(mage);
        party.addHero(thief);

        for (Hero hero : heroes) {
            if (hero instanceof Mage) {
                Mage mage = (Mage) hero;
                mage.gainSpell(MageSpellTypes.MAGICMISSILE);
            }
        }

        party.secondaryAttack(mage, goblin);

        assertEquals(50, goblin.getHp());
    }
}
