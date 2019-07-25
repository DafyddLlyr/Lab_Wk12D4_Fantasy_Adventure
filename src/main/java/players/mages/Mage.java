package players.mages;

import interfaces.IDefend;
import interfaces.ISpell;
import players.Player;
import summons.Summon;

import java.util.ArrayList;

public abstract class Mage extends Player {

    private final ArrayList<ISpell> spells;
    private int magicStrength;
    private Summon summon;

    public Mage(String name, int health, int magicStrength, int carryWeight, Summon summon) {
        super(name, health, carryWeight);
        this.magicStrength = magicStrength;
        this.summon = summon;
        this.spells = new ArrayList<ISpell>();
    }

    public IDefend getSummon() {
        return this.summon;
    }

    public void setSummon(Summon summon) {
        this.summon = summon;
    }

    public int getMagicStrength() {
        return this.magicStrength;
    }

    public void setMagicStrength(int magicStrength) {
        this.magicStrength = magicStrength;
    }

    public ArrayList<ISpell> getSpells() {
        return spells;
    }

    public void addSpell(ISpell spell) {
        this.spells.add(spell);
    }
}
