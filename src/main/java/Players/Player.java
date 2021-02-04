package Players;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private String race;
    private int health;
    private int pointsCollected;

    public Player (String name, String race, int health,
                   int pointsCollected){
        this.name = name;
        this.race = race;
        this.health = health;
        this.pointsCollected = pointsCollected;
    }

    public String getName() {
        return name;
    }


    public String getRace() {
        return race;
    }

    public int getHealth() {
        return health;
    }

    public int getPointsCollected() {
        return pointsCollected;
    }
}
