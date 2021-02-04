package Players;

import Behaviours.IFight;
import RoomFeatures.Creature;

import java.util.ArrayList;

public class Knight extends Fighter implements IFight {

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


    public String fight(Creature creature) {
        //dragons health points decrease to 0
        creature.setHealth(0);
        //knights points collected increase by dragon points value
        this.addFightingPoints(creature);
        //return string + knights point total
        return "Yay Dragon slayed! " + "Total points value is now " + this.getPointsCollected();
    }
}
