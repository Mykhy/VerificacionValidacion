import space_invaders.sprites.Alien;

import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {
    Alien alien;
    @org.junit.jupiter.api.Test
    void determinarTipoCaso1(){
        alien = new Alien(0,150);
        assertEquals(0,alien.getX());
        assertEquals(150,alien.getY());
    }
    void determinarTipoCaso2(){
        alien = new Alien(0,150);
        assertEquals(0,alien.getX());
        assertEquals(150,alien.getY());
    }
    void determinarTipoCaso3(){
        alien = new Alien(0,150);
        assertEquals(0,alien.getX());
        assertEquals(150,alien.getY());
    }

}
