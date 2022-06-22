package Dungeon;

import Inventory.Weapons;
import Player.Barbarian;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RoomTest {

    Monster monster1;
    Monster monster2;
    Barbarian barbarian;
    ArrayList<Monster> monsterList;
    ArrayList<Loot> lootList;
    Room room;
    ArrayList<Weapons> weaponList;

    @Before
    public void before(){
        monster1 = new Monster(MonsterType.BONE_DEVIL);
        monster2 = new Monster(MonsterType.GHOUL);

        monsterList = new ArrayList<>();
        monsterList.add(monster1);
        monsterList.add(monster2);

        lootList = new ArrayList<>();
        lootList.add(Loot.AMETHYST);
        lootList.add(Loot.DIAMONDS);

        weaponList = new ArrayList<>();
        weaponList.add(Weapons.SHORT_SWORD);
        weaponList.add(Weapons.MORNING_STAR);
        weaponList.add(Weapons.GLAVE);
        barbarian = new Barbarian(50, weaponList.get(0), weaponList);

        room = new Room(barbarian, monsterList, lootList);
    }


    @Test
    public void getPlayer() {
        assertEquals(barbarian, room.getPlayer());
    }

    @Test
    public void getMonsterList() {
        assertEquals(2, room.getMonsterList().size());
    }

    @Test
    public void getLootList() {
        assertEquals(2, room.getLootList().size());
    }

    @Test
    public void getCurrentMonster() {
        room.setMonster(monsterList.get(0));
        assertNotNull(room.getCurrentMonster());

    }

    @Test
    public void getCurrentLoot() {
        room.setLoot(lootList.get(0));
        assertNotNull(room.getCurrentLoot());
    }

    
}