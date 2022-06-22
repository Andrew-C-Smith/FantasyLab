package Dungeon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonsterTest {

    Monster monster;

    @Before
    public void before(){
        monster = new Monster(MonsterType.XORN);
    }

    @Test
    public void monsterHasName(){
        assertEquals("Xorn", monster.getName());
    }

    @Test
    public void monsterHAsHitPoints(){
        assertEquals(20, monster.getHitPoints());
    }

    @Test
    public void monsterHasAttack(){
        assertEquals(3, monster.getAttack());
    }

}