package players.fighters;

import enemies.Enemy;

public class Barbarian extends Fighter {

    public Barbarian(String name, int health, int strength, int carryWeight) {
        super(name, health, strength, carryWeight);
    }

    public void brawl(Enemy enemy) {
        enemy.takeDamage(this.getStrength());
    }

}
