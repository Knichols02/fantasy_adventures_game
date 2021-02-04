package RoomFeatures;

public class Dragon extends Creature{

    private String fire;

    public Dragon(String species, int health, int value, String fire) {
        super(species, health, value);
        this.fire = fire;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }
}
