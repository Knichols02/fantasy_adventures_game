package Players;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

public class Warlock extends  MagicDudes{

    private String incantation;

    public Warlock(String name, String race, int health, int pointsCollected, String staff,
                   String incantation) {
        super(name, race, health, pointsCollected, staff);
        this.incantation = incantation;
    }
    public String getIncantation() {
        return incantation;
    }
}
