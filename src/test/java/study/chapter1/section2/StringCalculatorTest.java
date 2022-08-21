package study.chapter1.section2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringCalculatorTest {
    String value = "2 + 3 * 4 / 2";

    @Test
    void getStrings() {
        assertThat(StringCalculator.getStrings(value)).containsExactly("2", "+", "3", "*", "4", "/", "2");
    }

    @Test
    void getInteger() {
        assertThatThrownBy(() -> {
            StringCalculator.getInteger("+");
        }).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void stringCalculator() {
        assertThat(StringCalculator.stringCalculator(value)).isEqualTo(10);
    }
}