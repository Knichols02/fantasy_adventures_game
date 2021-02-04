import Players.Spell;
import Players.Warlock;
import Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Spell spells;

    @Before
    public void before(){
        spells = new Spell("Bibbidi-Bobbidi-Boo");
        warlock = new Warlock("Abra-Merlin", "Warlock", 100, 20,
                "staff" );
    }

    @Test
    public void canGetName(){
        assertEquals("Abra-Merlin", warlock.getName());
    }

    @Test
    public void canGetRace(){
        assertEquals("Warlock", warlock.getRace());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, warlock.getHealth());
    }
    @Test
    public void canGetPointsCollection(){
        assertEquals(20, warlock.getPointsCollected());
    }
}
