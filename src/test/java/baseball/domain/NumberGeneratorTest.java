package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    @Test
    void 랜덤넘버생성테스트() {
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> randomNumbers = numberGenerator.createRandomNumbers();
        assertThat(randomNumbers.size()).isEqualTo(3);
        System.out.println("randomNumbers = " + randomNumbers);
    }
}