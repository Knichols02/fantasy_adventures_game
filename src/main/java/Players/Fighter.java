package Players;

import java.util.ArrayList;

public class Fighter extends Player {

    private ArrayList<Weapon> weapons;

    public Fighter(String name, String race, int health, int pointsCollected) {
        super(name, race, health, pointsCollected);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }


}
