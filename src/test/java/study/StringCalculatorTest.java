package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    String value = "2 + 3 * 4 / 2";

    @Test
    void getStrings(){
        assertThat(StringCalculator.getStrings(value)).containsExactly("2", "+", "3", "*", "4", "/", "2");
    }

    @Test
    void getInteger(){
        assertThatThrownBy(() -> {
            StringCalculator.getInteger("+");
        }).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void stringCalculator() {
        assertThat(StringCalculator.stringCalculator(value)).isEqualTo(10);
    }
}