package baseball2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballsTest {

    @Test
    void play_nothing() {
        Baseballs baseballs = new Baseballs(Arrays.asList(1, 2, 3));
        PlayResult result = baseballs.play(Arrays.asList(4, 5, 6));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void play_1strike_1ball() {
        Baseballs baseballs = new Baseballs(Arrays.asList(1, 2, 3));
        PlayResult result = baseballs.play(Arrays.asList(1, 4, 2));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void play_3strike() {
        Baseballs baseballs = new Baseballs(Arrays.asList(1, 2, 3));
        PlayResult result = baseballs.play(Arrays.asList(1, 2, 3));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.isEnd()).isTrue();

    }

    @Test
    void strike() {
        Baseballs baseballs = new Baseballs(Arrays.asList(1, 2, 3));
        BaseballStatus status = baseballs.play(new Baseball(1, 1));
        assertThat(status).isEqualTo(BaseballStatus.STRIKE);
    }

    @Test
    void ball() {
        Baseballs baseballs = new Baseballs(Arrays.asList(1, 2, 3));
        BaseballStatus status = baseballs.play(new Baseball(1, 2));
        assertThat(status).isEqualTo(BaseballStatus.BALL);
    }

    @Test
    void nothing() {
        Baseballs baseballs = new Baseballs(Arrays.asList(1, 2, 3));
        BaseballStatus status = baseballs.play(new Baseball(1, 4));
        assertThat(status).isEqualTo(BaseballStatus.NOTHING);
    }
}
