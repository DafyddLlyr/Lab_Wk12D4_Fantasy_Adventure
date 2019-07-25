package players;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BarbarianTest {

    Barbarian barbarian;
    Orc orc;

    @Before
    public void setup() {
        barbarian = new Barbarian("Conan", 100, 25, 200);
        orc = new Orc(100);

    }

    @Test
    public void isAFighter() {
        assertTrue(barbarian instanceof Fighter);
    }

    @Test
    public void canBrawl() {
        barbarian.brawl(orc);
        assertEquals(75, orc.getHealth());
    }
}
