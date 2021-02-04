package Players;

import java.util.ArrayList;

public class MagicDudes extends Player {

    private Weapon staff;

    public MagicDudes(String name, String race, int health, int pointsCollected, Weapon staff) {
        super(name, race, health, pointsCollected);
        this.staff = staff;
    }

    public Weapon getWeapons() {
        return staff;
    }

}
