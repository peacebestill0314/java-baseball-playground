package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;


public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");

    }

    // "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인
    // "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지
    @Test
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");

        String[] actual1 = "1".split(",");
        assertThat(actual1).containsExactly("1");
    }

    // "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록
    @Test
    void substring() {
        String actual = "(1,2)".substring(1,4); // index 1부터시작하여 4전까지
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("\"abc\" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 테스트 구현")
    void chatAt() {

        int index = 0;
        char actual = "abc".charAt(index);
        assertThat(actual).isEqualTo('a');
    }

    @Test
    @DisplayName("String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현")
    void chatAtException() {

        assertThatThrownBy(() -> {
            "abc".charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class).isThrownBy(() -> {
            "abc".charAt(3);
        }).withMessageContaining("String index out of range: 3");
    }
}
