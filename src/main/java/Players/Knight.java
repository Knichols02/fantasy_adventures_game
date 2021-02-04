package Players;

import java.util.ArrayList;

public class Knight extends Player  {

    private int armour;
    private String chivalry;

    public Knight(String name,  String race, int health,
                  int pointsCollected, int armour, String chivalry) {

        super(name, race, health, pointsCollected);
        this.armour = armour;
        this.chivalry = chivalry;
    }

    public int getArmour() {
        return armour;
    }

    public String getChivalry() {
        return chivalry;
    }


}
