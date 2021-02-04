import Players.Knight;
import Players.Weapon;
import RoomFeatures.Dragon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KnightTest {

    Knight knight;
    Weapon sword;
    Dragon dragon;

    @Before
    public void before(){
        sword = new Weapon("Sword");
        knight = new Knight("Sir Lancelot", "Knight", 100, 10,
                40, "Tis the mission of each Knight to dream the impossible dream!");
        dragon = new Dragon("Dragon", 50, 50, "Mega flames!!");
    }

    @Test
    public void canGetName(){
        assertEquals("Sir Lancelot", knight.getName());
    }

    @Test
    public void canGetRace(){
        assertEquals("Knight", knight.getRace());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, knight.getHealth());
    }
    @Test
    public void canGetPointsCollection(){
        assertEquals(10, knight.getPointsCollected());
    }

    @Test
    public void canGetArmour(){
        assertEquals(40, knight.getArmour());
    }

    @Test
    public void canGetChivarly(){
        assertEquals("Tis the mission of each Knight to dream the impossible dream!", knight.getChivalry());
    }

    @Test
    public void canFight(){
        assertEquals("Yay Dragon slayed! Total points value is now 60", knight.fight(dragon));
        assertEquals(0, dragon.getHealth());
    }

}
