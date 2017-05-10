package tests.persona;

import org.junit.jupiter.api.Test;
import persona.Species;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Christopher on 5/9/2017.
 */
public class SpeciesTest {

    @Test
    public void testCreateSpecies(){
        int testRes [] = {1,1,1,1,1,1,1,1,1,1};
        Species test = new Species("TEST",1,1,1,1,1,"TEST",testRes);
        assertEquals(test.getName(),"TEST");
        assertEquals(test.getAGI(),1);
        assertEquals(test.getEND(),1);
        assertEquals(test.getLUC(),1);
        assertEquals(test.getMAG(),1);
        assertEquals(test.getSTR(),1);
        assertEquals(test.getArcana(),"TEST");
        assertEquals(test.getResistances(),testRes);

    }

}
