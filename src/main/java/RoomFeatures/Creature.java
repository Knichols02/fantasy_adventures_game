package RoomFeatures;

public abstract class Creature {

    private String species;
    private int health;
    private int value;

    public Creature(String species, int health, int value){
        this.species = species;
        this.health = health;
        this.value = value;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPointsValue() {
        return value;
    }

    public void setPointsValue(int value) {
        this.value = value;
    }
}
