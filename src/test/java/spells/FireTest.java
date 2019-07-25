package spells;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.mages.Warlock;

import static org.junit.Assert.assertEquals;

public class FireTest {

    Fire fire;
    Warlock warlock;
    Orc orc;

    @Before
    public void setup() {
        fire = new Fire();
        warlock = new Warlock("Saruman", 200, 2,100, null);
        orc = new Orc(100);
    }

    @Test
    public void hasPower() {
        assertEquals(5, fire.getPower());
    }

    @Test
    public void canBeCast() {
        fire.cast(warlock, orc);
        assertEquals(90, orc.getHealth());
    }
}
