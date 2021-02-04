import Players.Spell;
import Players.Wizard;
import org.junit.Before;

import java.util.ArrayList;

public class WizardTest {

    Wizard wizard;
    Spell spells;

    @Before
    public void before(){
        spells = new Spell("Toadify");
        wizard = new Wizard("Merlin", "Wizard", 100, 20, "staff", "Toadify" );
    }
}
