package players.mages;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import spells.Fire;
import summons.Dragon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WarlockTest {

    private Warlock warlock;
    private Dragon dragon;
    private Fire fire;
    private Orc orc;

    @Before
    public void setup() {
        warlock = new Warlock("Saruman", 200, 5, 100, dragon);
        fire = new Fire();
        orc = new Orc(100);
    }

    @Test
    public void isPlayer() {
        assertTrue(warlock instanceof Player);
    }

    @Test
    public void hasMagicStrength() {
        assertEquals(5, warlock.getMagicStrength());
    }

    @Test
    public void canSetMagicStrength() {
        warlock.setMagicStrength(10);
        assertEquals(10, warlock.getMagicStrength());
    }

    @Test
    public void hasSummon() {
        assertEquals(dragon, warlock.getSummon());
    }

    @Test
    public void canSetSummon() {
        Dragon dragon2 = new Dragon(100, 10);
        warlock.setSummon(dragon2);
        assertEquals(dragon2, warlock.getSummon());
    }

    @Test
    public void hasSpells() {
        assertEquals(0, warlock.getSpells().size());
    }

    @Test
    public void canAddSpell() {
        warlock.addSpell(fire);
        assertEquals(1, warlock.getSpells().size());
        assertTrue(warlock.getSpells().contains(fire));
    }

    @Test
    public void canCastSpell() {
        warlock.addSpell(fire);
        warlock.cast(fire, orc);
        assertEquals(75, orc.getHealth());
    }

    @Test
    public void canOnlyCastSpellIfTheyHaveIt() {
        warlock.cast(fire, orc);
        assertEquals(100, orc.getHealth());
    }
}
