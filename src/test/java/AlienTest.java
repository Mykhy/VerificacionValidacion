import space_invaders.sprites.Alien;

import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {
    Alien alien;

    //TEST CONSTRUCTORES
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

    //TEST INITALIEN
    @org.junit.jupiter.api.Test
    void initAlien1(){
        alien = new Alien(0,0);
        alien.initAlien(-1,175);
        assertEquals(0,alien.getX());
        assertEquals(175,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien2(){
        alien = new Alien(0,0);
        alien.initAlien(0,175);
        assertEquals(0,alien.getX());
        assertEquals(175,alien.getY());
    } @org.junit.jupiter.api.Test
    void initAlien3(){
        alien = new Alien(0,0);
        alien.initAlien(1,175);
        assertEquals(1,alien.getX());
        assertEquals(175,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien4(){
        alien = new Alien(0,0);
        alien.initAlien(175,-1);
        assertEquals(175,alien.getX());
        assertEquals(0,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien5(){
        alien = new Alien(0,0);
        alien.initAlien(175,0);
        assertEquals(175,alien.getX());
        assertEquals(0,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien6(){
        alien = new Alien(0,0);
        alien.initAlien(175,1);
        assertEquals(175,alien.getX());
        assertEquals(1,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien7(){
        alien = new Alien(0,0);
        alien.initAlien(175,175);
        assertEquals(175,alien.getX());
        assertEquals(175,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien8(){
        alien = new Alien(0,0);
        alien.initAlien(358,175);
        assertEquals(358,alien.getX());
        assertEquals(175,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien9(){
        alien = new Alien(0,0);
        alien.initAlien(357,175);
        assertEquals(357,alien.getX());
        assertEquals(175,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien10(){
        alien = new Alien(0,0);
        alien.initAlien(359,175);
        assertEquals(358,alien.getX());
        assertEquals(175,alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien11() {
        alien = new Alien(0,0);
        alien.initAlien(175, 350);
        assertEquals(175, alien.getX());
        assertEquals(350, alien.getY());
    }
    @org.junit.jupiter.api.Test
    void initAlien12() {
        alien = new Alien(0,0);
        alien.initAlien(175, 349);
        assertEquals(175, alien.getX());
        assertEquals(349, alien.getY());
    }@org.junit.jupiter.api.Test
    void initAlien13() {
        alien = new Alien(0,0);
        alien.initAlien(175, 351);
        assertEquals(175, alien.getX());
        assertEquals(350, alien.getY());
    }








}
