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
    @org.junit.jupiter.api.Test
    void determinarTipoCaso2(){
        alien = new Alien(1,150);
        assertEquals(1,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void determinarTipoCaso3(){
        alien = new Alien(150,150);
        assertEquals(150,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void determinarTipoCaso4(){
        alien = new Alien(150,0);
        assertEquals(150,alien.getX());
        assertEquals(0,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void determinarTipoCaso5(){
        alien = new Alien(150,1);
        assertEquals(150,alien.getX());
        assertEquals(1,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void determinarTipoCaso6(){
        alien = new Alien(358,150);
        assertEquals(358,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void determinarTipoCaso7(){
        alien = new Alien(357,150);
        assertEquals(357,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void determinarTipoCaso8(){
        alien = new Alien(150,350);
        assertEquals(150,alien.getX());
        assertEquals(350,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void determinarTipoCaso9(){
        alien = new Alien(150,349);
        assertEquals(150,alien.getX());
        assertEquals(349,alien.getY());
    }




}
