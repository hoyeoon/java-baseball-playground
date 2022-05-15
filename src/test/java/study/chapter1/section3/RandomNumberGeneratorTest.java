package study.chapter1.section3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberGeneratorTest {

    @DisplayName("랜덤 번호 범위 테스트")
    @Test
    void randomNumberRangeTest() {
        // given
        final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        // when
        final int[] randomNum = randomNumberGenerator.generate();

        // then
        assertThat(IntStream.of(randomNum).allMatch(value -> value >= 1 && value <= 9)).isTrue();
    }
}