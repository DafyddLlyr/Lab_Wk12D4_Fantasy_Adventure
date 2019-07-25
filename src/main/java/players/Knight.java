package players;

import enemies.Enemy;

public class Knight extends Fighter {

    public Knight(String name, int health, int strength, int carryWeight) {
        super(name, health, strength, carryWeight);
    }

    public void charge(Enemy enemy) {
        this.attack(enemy, this.getEquippedWeapon());
        this.attack(enemy, this.getEquippedWeapon());
    }

}
