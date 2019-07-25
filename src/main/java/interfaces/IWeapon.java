package interfaces;

import enemies.Enemy;
import players.Fighter;

public interface IWeapon {

    void attack(Fighter fighter, Enemy enemy);

    int getWeight();

    int getDamage();
}
