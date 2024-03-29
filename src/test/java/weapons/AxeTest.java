package weapons;

import org.junit.Before;
import org.junit.Test;
import players.fighters.Dwarf;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;
    Dwarf dwarf;

    @Before
    public void setup() {
        axe = new Axe();
        dwarf = new Dwarf("Gimili", 50, 10, 100);
    }

    @Test
    public void hasWeight() {
        assertEquals(10, axe.getWeight());
    }

    @Test
    public void hasDamage() {
        assertEquals(5, axe.getDamage());
    }
}
