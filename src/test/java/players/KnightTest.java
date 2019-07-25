package players;

import Weapons.Axe;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KnightTest {

    private Knight knight;

    @Before
    public void setup() {
        Axe axe = new Axe();
        knight = new Knight("Sir Percy", 200, 10, 200);
        knight.equipWeapon(axe);
    }

    @Test
    public void isAFighter() {
        assertTrue(knight instanceof Fighter);
    }

    @Test
    public void canCharge() {
        Orc orc = new Orc(500);
        knight.charge(orc);
        assertEquals(400, orc.getHealth());
    }
}
