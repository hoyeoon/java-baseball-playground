package baseball.domain;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class RefereeTest {
    @Test
    void 볼_스트라이크_판별테스트(){
        Referee referee = new Referee();
        List<Integer> computer = Arrays.asList(4, 2, 5);
        String result1 = referee.compare(computer, Arrays.asList(1, 2, 3));
        String result2 = referee.compare(computer, Arrays.asList(4, 5, 6));
        String result3 = referee.compare(computer, Arrays.asList(7, 8, 9));

        assertThat("1스트라이크").isEqualTo(result1);
        assertThat("1볼 1스트라이크").isEqualTo(result2);
        assertThat("낫싱").isEqualTo(result3);
    }
}