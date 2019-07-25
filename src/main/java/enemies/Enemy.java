package enemies;

public abstract class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (damage < this.health) {
            this.health -= damage;
        } else {
            this.health = 0;
        }
    }

    public int getHealth() {
        return this.health;
    }
}
