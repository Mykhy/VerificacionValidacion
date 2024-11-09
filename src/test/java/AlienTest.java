import space_invaders.sprites.Alien;

import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {
    Alien alien;
    @org.junit.jupiter.api.Test
    void Constructor1(){
        alien = new Alien(0,150);
        assertEquals(0,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void Constructor2(){
        alien = new Alien(1,150);
        assertEquals(1,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void Constructor3(){
        alien = new Alien(150,150);
        assertEquals(150,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void Constructor4(){
        alien = new Alien(150,0);
        assertEquals(150,alien.getX());
        assertEquals(0,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void Constructor5(){
        alien = new Alien(150,1);
        assertEquals(150,alien.getX());
        assertEquals(1,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void Constructor6(){
        alien = new Alien(358,150);
        assertEquals(358,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void Constructor7(){
        alien = new Alien(357,150);
        assertEquals(357,alien.getX());
        assertEquals(150,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void Constructor8(){
        alien = new Alien(150,350);
        assertEquals(150,alien.getX());
        assertEquals(350,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void Constructor9(){
        alien = new Alien(150,349);
        assertEquals(150,alien.getX());
        assertEquals(349,alien.getY());
    }




}
