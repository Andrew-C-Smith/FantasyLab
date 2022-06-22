package Dungeon;

public class Monster {

    private String name;
    private int hitPoints;
    private int attack;

    public Monster(MonsterType monsterType) {
        this.name = monsterType.getName();
        this.hitPoints = monsterType.getHitPoints();
        this.attack = monsterType.getAttack();
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttack() {
        return attack;
    }
}
