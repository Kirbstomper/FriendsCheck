package tests.persona;

import org.junit.jupiter.api.Test;
import persona.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Christopher on 5/9/2017.
 */
public class PlayerTest {
    //Test that a player is created correctly
    @Test
    public void testCreatePlayer(){
        Player test = new Player("123456","Kirby");
        assertEquals(test.getFacebookID(),"123456");
        assertEquals(test.getDispName(),"Kirby");
        assertEquals(test.getLevel(),1);
        assertEquals(test.getHealth(),25);
        assertEquals(test.getMagic(),20);
    }
    //Tests levelUp method
    @Test
    public void testLevelUp(){
        Player test = new Player("123456","Kirby");
        test.levelUp();
        assertEquals(test.getLevel(),2);
        assertEquals(test.getHealth(),40);
        assertEquals(test.getMagic(),30);
    }
    //Tests setting new userName
    @Test
    public void testSetUsername(){
        Player test = new Player("123456","Kirby");
        test.setDispName("Kirbstomper");
        assertEquals(test.getDispName(),"Kirbstomper");
    }




}
