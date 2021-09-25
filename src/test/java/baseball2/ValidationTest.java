package baseball2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationTest {

    @Test
    void 입력갑_범위_0_9() {
        assertThat(ValidationUtils.validate(9)).isTrue();
        assertThat(ValidationUtils.validate(0)).isTrue();
        assertThat(ValidationUtils.validate(1)).isTrue();
        assertThat(ValidationUtils.validate(10)).isFalse();
    }
}
