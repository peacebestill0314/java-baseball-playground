package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball(1, 1);
    }

    @Test
    void 스트라이크() {
        BallStatus ballStatus = ball.play(new Ball(1, 1));
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void 볼() {
        BallStatus ballStatus = ball.play(new Ball(2, 1));
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void 낫싱() {
        BallStatus ballStatus = ball.play(new Ball(2, 2));
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void 입력값_조건_1_9() {
        assertThat(ValidationUtils.range(0)).isFalse();
        assertThat(ValidationUtils.range(1)).isTrue();
        assertThat(ValidationUtils.range(9)).isTrue();
        assertThat(ValidationUtils.range(10)).isFalse();
    }

    @Test
    void 입력값_조건_중복없음() {
        assertThat(ValidationUtils.duplicate(Arrays.asList(1, 2, 3))).isFalse();
        assertThat(ValidationUtils.duplicate(Arrays.asList(1, 1, 1))).isTrue();
    }
}
