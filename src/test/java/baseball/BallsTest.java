package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    @Test
    void 스트라이크() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = balls.play(new Ball(1, 1));
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void 볼() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = balls.play(new Ball(2, 1));
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void 낫싱() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = balls.play(new Ball(1, 4));
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }
}
