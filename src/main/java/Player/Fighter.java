package Player;

import Inventory.Weapons;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Fighter extends Player{

    protected Weapons currentWeapon;
    private ArrayList<Weapons> weaponList;

    public Fighter(int healthPoints, Weapons currentWeapon, ArrayList<Weapons> weaponList) {
        super(healthPoints);
        this.currentWeapon = currentWeapon;
        this.weaponList = weaponList;
    }


    public Weapons getCurrentWeapon() {
        return this.currentWeapon;
    }

    public ArrayList<Weapons> getWeaponList() {
        return this.weaponList;
    }

    public void changeWeapon(Weapons weapon) {
        this.currentWeapon = weapon;
    }

    public int attack() {
       return this.currentWeapon.getDamage();
    }

    public abstract void takeDamage(int Damage);
}
