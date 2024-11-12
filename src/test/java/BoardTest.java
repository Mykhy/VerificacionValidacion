import main.Board;
import main.Commons;
import space_invaders.sprites.Alien;
import space_invaders.sprites.Player;
import space_invaders.sprites.Shot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class BoardTest {

    private Board board;

    @BeforeEach
    public void setup() {
        board = new Board();
    }

    @org.junit.jupiter.api.Test
    void gameInitTest() {
        board.gameInit();
        assertEquals(Commons.NUMBER_OF_ALIENS_TO_DESTROY, board.getAliens().size());
        assertNotNull(board.getPlayer());
        assertNotNull(board.getShot());
        /*for(int i = 0; i < Commons.NUMBER_OF_ALIENS_TO_DESTROY;i++){
            se supone que no sabemos las filas y las columnas?
        }*/

    }
    //TEST UPDATE
    @org.junit.jupiter.api.Test
    void update1(){
        board.gameInit();
        board.setDeaths(Commons.NUMBER_OF_ALIENS_TO_DESTROY);
        board.update();
        assertEquals(false, board.isInGame());
    }
    @org.junit.jupiter.api.Test
    void update2(){
        board.gameInit();
        board.update();
        assertEquals(true, board.isInGame());
    }

}