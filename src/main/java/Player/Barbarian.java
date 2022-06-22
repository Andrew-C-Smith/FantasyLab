package Player;

import Inventory.Weapons;

import java.util.ArrayList;

public class Barbarian extends Fighter{

    private boolean rage;

    public Barbarian(int healthPoints, Weapons currentWeapon, ArrayList<Weapons> weaponList) {
        super(healthPoints, currentWeapon, weaponList);
        this.rage = false;
    }

    public boolean getRage() {
        return this.rage;
    }

    public void engageRage() {
        this.rage = !rage;

    }
    @Override
    public int attack(){
        if(rage){
            return this.currentWeapon.getDamage()*2;
        }else {
            return this.currentWeapon.getDamage();
        }
    }
    @Override
    public void takeDamage(int damage) {
        if (rage) {
            this.healthPoints -= damage *2;
        } else {
            this.healthPoints -= damage;
        }
    }
}

