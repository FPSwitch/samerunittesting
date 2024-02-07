package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Test Case PlayerTest
 * By Samer Youssouf Group 6
 */
public class PlayerTestMoveRight {
    @Test
    void moveRight() {
        Direction right = Direction.valueOf("EAST");
        assertThat(right.getDeltaX()).isEqualTo(-1);
    }
}
