package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class PlayerTestMoveLeft {
    @Test
    void moveLeft() {
        Direction left = Direction.valueOf("WEST");
        assertThat(left.getDeltaX()).isEqualTo(1);
    }
}
