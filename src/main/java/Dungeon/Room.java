package Dungeon;

import Player.Player;

import java.util.ArrayList;

public class Room {

    private Player player;
    private ArrayList<Monster> monsterList;
    private ArrayList<Loot> lootList;
    private Monster currentMonster;
    private Loot currentLoot;


    public Room(Player player, ArrayList<Monster> monsterList, ArrayList<Loot> lootList) {
        this.player = player;
        this.monsterList = monsterList;
        this.lootList = lootList;
        this.currentLoot = currentLoot;
        this.currentMonster = currentMonster;
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public ArrayList<Loot> getLootList() {
        return lootList;
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }

    public Loot getCurrentLoot() {
        return currentLoot;
    }

    public void setMonster(Monster monster) {
        this.currentMonster = monster;
    }

    public void setLoot(Loot loot) {
        this.currentLoot = loot;
    }
}
