package Dungeon;

public enum Loot {
    RUBIES("Ruby", 1000),
    DIAMONDS( "Diamond", 2000),
    SAPPHIRES("Sapphire", 1200),
    EMERALDS("Emerald", 1800),
    AMETHYST("Amethyst", 800),
    OPAL("Opal", 1600);



    private String name;
    private int value;

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    Loot(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
