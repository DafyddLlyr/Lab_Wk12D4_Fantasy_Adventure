package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void setup() {
        orc = new Orc(10);
    }

    @Test
    public void hadHealth() {
        assertEquals(10, orc.getHealth());
    }

    @Test
    public void canTakeDamage() {
        orc.takeDamage(5);
        assertEquals(5, orc.getHealth());
    }

    @Test
    public void cannotBeDamagedBeyondHealth() {
        orc.takeDamage(20);
        assertEquals(0, orc.getHealth());
    }
}
