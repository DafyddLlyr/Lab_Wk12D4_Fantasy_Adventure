package players.fighters;

import enemies.Enemy;
import interfaces.IWeapon;
import players.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private ArrayList<IWeapon> weapons;
    private IWeapon equippedWeapon;
    private int strength;

    public Fighter(String name, int health, int strength, int carryWeight) {
        super(name, health, carryWeight);
        this.strength = strength;
        this.weapons = new ArrayList<IWeapon>();
        this.equippedWeapon = null;
    }

    public void equipWeapon(IWeapon weapon) {
        this.equippedWeapon = weapon;
    }

    public void pickUpWeapon(IWeapon weapon) {
        int newCarryWeight = this.getCarryWeight() - weapon.getWeight();
        this.setCarryWeight(newCarryWeight);
        this.weapons.add(weapon);
    }

    public void discardWeapon(IWeapon weapon) {
        this.weapons.remove(weapon);
    }

    public ArrayList<IWeapon> getWeapons() {
        return this.weapons;
    }

    public IWeapon getEquippedWeapon() {
        return this.equippedWeapon;
    }

    public int getStrength() {
        return this.strength;
    }

    public void attack(Enemy enemy, IWeapon weapon) {
        weapon.attack(this, enemy);
    }

}
