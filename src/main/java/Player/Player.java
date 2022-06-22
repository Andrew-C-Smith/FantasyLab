package Player;

public abstract class Player {

    protected int healthPoints;
    private int loot;

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public int getLoot() {
        return loot;
    }

    public Player(int healthPoints) {
        this.healthPoints = healthPoints;
        this.loot = 0;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }
}

