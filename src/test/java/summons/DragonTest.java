package summons;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.mages.Warlock;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void setup() {
        dragon = new Dragon(200, 5);
    }

    @Test
    public void hasHealth() {
        assertEquals(200, dragon.getHealth());
    }

    @Test
    public void hasStrength() {
        assertEquals(5, dragon.getStrength());
    }

    @Test
    public void canSetHealth() {
        dragon.setHealth(100);
        assertEquals(100, dragon.getHealth());
    }

    @Test
    public void canSetStrength() {
        dragon.setStrength(10);
        assertEquals(10, dragon.getStrength());
    }

    @Test
    public void canAttack() {
        Orc orc = new Orc(10);
        dragon.attack(orc);
        assertEquals(5, orc.getHealth());
    }

    @Test
    public void canDefendMage() {
        Warlock warlock = new Warlock("Saruman", 200, 5, 100, dragon);
        dragon.defend(warlock);
        assertEquals(10, warlock.getMagicStrength());
        assertEquals(400, warlock.getHealth());
    }
}
