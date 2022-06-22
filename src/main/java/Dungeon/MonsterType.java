package Dungeon;

public enum MonsterType {
    XORN("Xorn",20, 3 ),
    SKELETON("Skeleton", 18, 4),
    HYDRA("Hydra", 40, 1),
    DRIDER("Drider", 15, 4),
    CHIMERA("Chimera",18, 3),
    GHOUL("Ghoul", 10, 25),
    BONE_DEVIL("Bone Devil", 7, 100);


    private String name;
    private int hitPoints;
    private int attack;

    MonsterType(String name, int hitPoints, int attack) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attack = attack;
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
