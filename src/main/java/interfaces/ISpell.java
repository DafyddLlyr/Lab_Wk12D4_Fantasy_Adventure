package interfaces;

import enemies.Enemy;
import players.mages.Mage;

public interface ISpell {

    void cast(Mage mage, Enemy enemy);

}
