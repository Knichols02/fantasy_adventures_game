package Players;

import java.util.ArrayList;

public class MagicDudes extends Player {

    private ArrayList<Weapon> spells;

    public MagicDudes(String name, String race, int health, int pointsCollected) {
        super(name, race, health, pointsCollected);
        this.spells = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return spells;
    }

    public void addWeapon(Weapon weapon){
        this.spells.add(weapon);
    }

}
