package baseball2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest {

    private Baseball baseball;

    @BeforeEach
    void setUp() {
        baseball = new Baseball(1, 4);
    }

    @Test
    void 스트라이크() {
        BaseballStatus status = baseball.play(new Baseball(1, 4));
        assertThat(status).isEqualTo(BaseballStatus.STRIKE);
    }

    @Test
    void 볼() {
        BaseballStatus status = baseball.play(new Baseball(2, 4));
        assertThat(status).isEqualTo(BaseballStatus.BALL);
    }

    @Test
    void 낫띵() {
        BaseballStatus status = baseball.play(new Baseball(2, 5));
        assertThat(status).isEqualTo(BaseballStatus.NOTHING);
    }
}
