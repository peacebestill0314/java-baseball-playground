package baseball2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballsTest {

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
