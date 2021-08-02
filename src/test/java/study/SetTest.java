package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트")
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트")
    void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @DisplayName("JUnit의 ParameterizedTest를 활용해 중복 코드를 제거")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void containsRe(int number) {
        // assertTrue(numbers.contains(number));
        assertThat(numbers.contains(number)).isTrue();
    }

    @DisplayName("입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void containsRe2(int number, boolean result) {
        assertThat(numbers.contains(number)).isEqualTo(result);
    }

}