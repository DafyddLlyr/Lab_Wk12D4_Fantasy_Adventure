package summons;

import interfaces.IDefend;
import players.mages.Mage;

public abstract class Summon implements IDefend {

    private int health;

    public Summon(int health) {
        this.health = health;
    }

    public void defend(Mage mage) {
        mage.increaseHealth(this.health);
        mage.setMagicStrength(2 * mage.getMagicStrength());
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
