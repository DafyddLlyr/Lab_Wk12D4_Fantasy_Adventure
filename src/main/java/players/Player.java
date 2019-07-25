package players;

public abstract class Player {

    private String name;
    private int health;
    private int carryWeight;

    public Player(String name, int health, int carryWeight) {
        this.name = name;
        this.health = health;
        this.carryWeight = carryWeight;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void increaseHealth(int health) {
        this.health += health;
    }

    public void decreaseHealth(int health) {
        this.health -= health;
    }

    public void setCarryWeight(int carryWeight) {
        this.carryWeight = carryWeight;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getCarryWeight() {
        return this.carryWeight;
    }
}
