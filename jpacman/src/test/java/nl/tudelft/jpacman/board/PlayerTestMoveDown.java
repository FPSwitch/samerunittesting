package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTestMoveDown {
    @Test
    void moveRight() {
        Direction down = Direction.valueOf("SOUTH");
        assertThat(down.getDeltaY()).isEqualTo(1);
    }
}
