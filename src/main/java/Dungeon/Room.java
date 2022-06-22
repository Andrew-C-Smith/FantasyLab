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
        this.currentLoot = chooseRandomLoot();
        this.currentMonster = chooseRandomMonster();
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

    public Monster chooseRandomMonster(){
        int min = 0;
        int max = monsterList.size()-1;

        int newMonsterIndex = (int)Math.floor(Math.random()*(max-min+1)+min);
        return monsterList.get(newMonsterIndex);
    }

    public Loot chooseRandomLoot(){
        int min = 0;
        int max = lootList.size()-1;

        int newLootIndex = (int)Math.floor(Math.random()*(max-min+1)+min);
        return lootList.get(newLootIndex);
    }

    public void attackHappens(){
        // What type of player is this?
        if(this.player){

        }
    }
}
