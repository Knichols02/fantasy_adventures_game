import Players.Cleric;
import Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Knight knight;
    private Cleric cleric;

    @Before
    public void before(){
        knight = new Knight("Sir Lancelot", "Knight", 20, 10,
                40, "Tis the mission of each Knight to dream the impossible dream!");
        cleric = new Cleric("Evan", "Cleric", 100, 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Evan", cleric.getName());
    }

    @Test
    public void canGetRace(){
        assertEquals("Cleric", cleric.getRace());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void canGetPointsCollection(){
        assertEquals(20, cleric.getPointsCollected());
    }

    @Test
    public void canHealPlayers(){
        cleric.heal(knight);
        assertEquals(100, knight.getHealth());
    }
}


