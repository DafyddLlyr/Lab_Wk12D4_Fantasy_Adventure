package spells;

import enemies.Enemy;
import interfaces.ISpell;
import players.mages.Mage;

public class Fire implements ISpell {

    private int power;

    public Fire() {
        this.power = 5;
    }

    public int getPower() {
        return this.power;
    }

    public void cast(Mage mage, Enemy enemy) {
        int totalDamage = mage.getMagicStrength() * this.power;
        enemy.takeDamage(totalDamage);
    }

}
