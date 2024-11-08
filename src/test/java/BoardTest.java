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

    @Test
    void testInitialSetup() {
        // Verificar que el tablero esté configurado correctamente
        assertNotNull(board.getPlayer(), "El jugador no debería ser nulo después de la inicialización.");
        assertNotNull(board.getAliens(), "La lista de alienígenas no debería ser nula.");
        assertFalse(board.getAliens().isEmpty(), "La lista de alienígenas no debería estar vacía después de la inicialización.");
        assertNotNull(board.getShot(), "El disparo inicial no debería ser nulo.");
    }

}