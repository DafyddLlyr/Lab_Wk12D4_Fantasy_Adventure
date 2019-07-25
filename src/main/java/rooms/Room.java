package rooms;

import enemies.Enemy;
import interfaces.ITreasure;
import players.Player;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Player> players;
    private ArrayList<Exits> exits;
    private ArrayList<ITreasure> treasures;
    private String name;

    public Room(String name) {
        this.name = name;
        this.treasures = new ArrayList<ITreasure>();
        this.enemies = new ArrayList<Enemy>();
        this.players = new ArrayList<Player>();
        this.exits = new ArrayList<Exits>();
//        this.createExits();
    }
//
//    public void createExits() {
//        for(Exits exit : Exits.values()) {
//
//        }
//    }

    public ArrayList<Enemy> getEnemies() {
        return this.enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Exits> getExits() {
        return this.exits;
    }

    public ArrayList<ITreasure> getTreasures() {
        return this.treasures;
    }

}
