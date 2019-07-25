package players.fighters;

import Weapons.Axe;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;
    Orc orc;

    @Before
    public void setup() {
        axe = new Axe();
        orc = new Orc(100);
        dwarf = new Dwarf("Gimili", 50, 10, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Gimili", dwarf.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(50, dwarf.getHealth());
    }

    @Test
    public void hasStrength() {
        assertEquals(10, dwarf.getStrength());
    }

    @Test
    public void hasCarryWeight() {
        assertEquals(100, dwarf.getCarryWeight());
    }

    @Test
    public void canSetHealth() {
        dwarf.setHealth(100);
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canIncreaseHealth() {
        dwarf.increaseHealth(1);
        assertEquals(51, dwarf.getHealth());
    }

    @Test
    public void canDecreaseHealth() {
        dwarf.decreaseHealth(1);
        assertEquals(49, dwarf.getHealth());
    }

    @Test
    public void canSetCarryWeight() {
        dwarf.setCarryWeight(10);
        assertEquals(10, dwarf.getCarryWeight());
    }

    @Test
    public void hasArrayListOfWeapons() {
        assertEquals(0, dwarf.getWeapons().size());
    }

    @Test
    public void canAddWeaponToInventory() {
        dwarf.pickUpWeapon(axe);
        assertEquals(1, dwarf.getWeapons().size());
    }

    @Test
    public void addingWeaponLowersCarryWeight() {
        dwarf.pickUpWeapon(axe);
        assertEquals(90, dwarf.getCarryWeight());
    }

    @Test
    public void canEqipWeapon() {
        dwarf.equipWeapon(axe);
        assertEquals(axe, dwarf.getEquippedWeapon());
    }

    @Test
    public void canDiscardWeapon() {
        dwarf.pickUpWeapon(axe);
        dwarf.discardWeapon(axe);
        assertEquals(0, dwarf.getWeapons().size());
    }

    @Test
    public void canAttack() {
        dwarf.attack(orc, axe);
        assertEquals(50, orc.getHealth());
    }

}

