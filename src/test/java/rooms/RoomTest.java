package rooms;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.fighters.Dwarf;
import players.mages.Warlock;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private ArrayList<Enemy> enemyGang;
    private ArrayList<Player> heroes;

    @Before
    public void setup() {
        room = new Room("Castle Dungeon");

        enemyGang = new ArrayList<Enemy>();
        Orc orc1 = new Orc(100);
        Orc orc2 = new Orc(150);
        Orc orc3 = new Orc(200);
        enemyGang.add(orc1);
        enemyGang.add(orc2);
        enemyGang.add(orc3);

        heroes = new ArrayList<Player>();
        Dwarf dwarf = new Dwarf("Gimli", 100, 10, 100);
        Warlock warlock = new Warlock("Saruman", 100, 10, 100, null);
        heroes.add(dwarf);
        heroes.add(warlock);
    }

    @Test
    public void hasName() {
        assertEquals("Castle Dungeon", room.getName());
    }

    @Test
    public void canGetEnemies() {
        assertEquals(0, room.getEnemies().size());
    }

    @Test
    public void canSetEnemies() {
        room.setEnemies(enemyGang);
        assertEquals(3, room.getEnemies().size());
    }

    @Test
    public void canGetPlayers() {
        assertEquals(0, room.getPlayers().size());
    }

    @Test
    public void canSetPlayers() {
        room.setPlayers(heroes);
        assertEquals(2, room.getPlayers().size());
    }
}
