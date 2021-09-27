package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    private Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void 낫싱() {
        // 이렇게 받는 구조. balls에서 구현해야할 구조라는걸 어떻게 생각하지?
        // 결론적으로 나와야 할 형태.
        PlayResult playResult = balls.play(Arrays.asList(4, 5, 6));
        assertThat(playResult.getStrike()).isEqualTo(0);
        assertThat(playResult.getBall()).isEqualTo(0);
        assertThat(playResult.isThreeStrike()).isFalse();
    }

    @Test
    void 스트라이크() {
        // 이렇게 받는 구조. balls에서 구현해야할 구조라는걸 어떻게 생각하지?
        // 결론적으로 나와야 할 형태.
        PlayResult playResult = balls.play(Arrays.asList(1, 2, 3));
        assertThat(playResult.getStrike()).isEqualTo(3);
        assertThat(playResult.getBall()).isEqualTo(0);
        assertThat(playResult.isThreeStrike()).isTrue();
    }

    @Test
    void 볼() {
        // 이렇게 받는 구조. balls에서 구현해야할 구조라는걸 어떻게 생각하지?
        // 결론적으로 나와야 할 형태.
        PlayResult playResult = balls.play(Arrays.asList(4, 1, 5));
        assertThat(playResult.getStrike()).isEqualTo(0);
        assertThat(playResult.getBall()).isEqualTo(1);
        assertThat(playResult.isThreeStrike()).isFalse();
    }
}
