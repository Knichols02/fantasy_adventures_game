package Players;

import java.util.ArrayList;

public class MagicDudes extends Player {

    private String staff;
    private ArrayList<Spell> spells;

    public MagicDudes(String name, String race, int health, int pointsCollected, String staff) {
        super(name, race, health, pointsCollected);
        this.staff = staff;
        this.spells = new ArrayList<Spell>();
    }

    public String getWeapons() {
        return this.staff;
    }



}
