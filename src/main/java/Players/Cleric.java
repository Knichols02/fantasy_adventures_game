package Players;

import Behaviours.IHeal;

public class Cleric extends Player implements IHeal {

    private IHeal healthBoost;

    public Cleric(String name, String race, int health, int pointsCollected) {
        super(name, race, health, pointsCollected);

    }

    public void heal(Player player) {
        //if players health <100 then method will increase the players health to 100
        //if >= 100 cannot heal
        if(player.getHealth() <100){
        player.setHealth(100);
        }
    }
}
