package Players;

import Behaviours.ISpell;
import RoomFeatures.Creature;

public class Wizard extends MagicDudes implements ISpell {

    private String incantation;

    public Wizard(String name, String race, int health, int pointsCollected, String staff,
                  String incantation) {
        super(name, race, health, pointsCollected, staff);
        this.incantation = incantation;
    }

    public String getIncantation() {
        return incantation;
    }

    public void setIncantation(String incantation) {
        this.incantation = incantation;
    }
}
