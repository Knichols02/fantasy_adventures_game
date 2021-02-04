package CreatureTests;
import RoomFeatures.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {


    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Dragon", 50, 50, "Mega flames!!");
    }

    @Test
    public void hasName(){
        assertEquals("Dragon", dragon.getSpecies());
    }

    @Test
    public void hasHealth(){
        assertEquals(50, dragon.getHealth());
    }

    @Test
    public void hasPointsValue(){
        assertEquals(50, dragon.getPointsValue());
    }


}
