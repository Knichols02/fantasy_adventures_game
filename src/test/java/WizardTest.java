import Players.Spell;
import Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell spells;

    @Before
    public void before(){
        spells = new Spell("Toadify");
        wizard = new Wizard("Merlin", "Wizard", 100, 20,
                "staff", "Toadify" );
    }

    @Test
    public void canGetName(){
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void canGetRace(){
        assertEquals("Wizard", wizard.getRace());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, wizard.getHealth());
    }
    @Test
    public void canGetPointsCollection(){
        assertEquals(20, wizard.getPointsCollected());
    }
}
