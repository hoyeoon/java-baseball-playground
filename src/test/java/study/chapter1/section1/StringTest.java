package study.chapter1.section1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual1 = "1,2".split(",");
        assertThat(actual1).containsExactly("1", "2");

        String[] actual2 = "1".split(",");
        assertThat(actual2).contains("1");
    }

    @Test
    void substring(){
        String str = "(1,2)";
        String actual = str.substring(1, str.length() - 1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt() 문자를 가져올 때 index 값을 벗어났을 경우 에러")
    void charAt(){
        char actual = "abc".charAt(0);
        assertThat(actual).isEqualTo('a');

        assertThatThrownBy(() -> {
            "abc".charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    "abc".charAt(4);
                }).withMessageMatching("String index out of range: 4");
    }
}
