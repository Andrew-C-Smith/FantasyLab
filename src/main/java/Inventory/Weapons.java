package Inventory;

public enum Weapons {

    SHORT_SWORD (5, "Short Sword"),
    LONG_SWORD(7, "Long Sword"),
    GLAVE(6, "Glave"),
    SPEAR(4, "Spear"),
    MORNING_STAR(8, "Morning Star");

    private final int damage;
    private String name;
    Weapons(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }
}
