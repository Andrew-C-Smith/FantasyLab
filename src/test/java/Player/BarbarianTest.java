package Player;

import Inventory.Weapons;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BarbarianTest {

    Barbarian barbarian;
    ArrayList<Weapons> weaponList;


    @Before
    public void before(){
    weaponList = new ArrayList<>();
    weaponList.add(Weapons.SHORT_SWORD);
    weaponList.add(Weapons.MORNING_STAR);
    weaponList.add(Weapons.GLAVE);
    barbarian = new Barbarian(50, weaponList.get(0), weaponList);
    }

    @Test
    public void hasStartingWeapon(){
        assertEquals(Weapons.SHORT_SWORD, barbarian.getCurrentWeapon());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeaponsList(){
        assertEquals(3, barbarian.getWeaponList().size());
    }

    @Test
    public void hasRage(){
        assertEquals(false, barbarian.getRage());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.changeWeapon(Weapons.GLAVE);
        assertEquals(Weapons.GLAVE, barbarian.getCurrentWeapon());
    }

    @Test
    public void canAttack(){
        assertEquals(5, barbarian.attack());
    }

    @Test
    public void rageAttackIsDouble(){
        barbarian.engageRage();
        assertEquals(10, barbarian.attack());
    }

    @Test
    public void canTakeDamage(){
        barbarian.takeDamage(5);
        assertEquals(45, barbarian.getHealthPoints());
    }

    @Test
    public void takesDoubleDamageWhenRaging(){
        barbarian.engageRage();
        barbarian.takeDamage(5);
        assertEquals(40, barbarian.getHealthPoints());
    }

    @Test
    public void hasLoot(){
        assertEquals(0, barbarian.getLoot());
    }

    @Test
    public void canAddLoot(){
        barbarian.setLoot(10);
        assertEquals(10,barbarian.getLoot());
    }


}