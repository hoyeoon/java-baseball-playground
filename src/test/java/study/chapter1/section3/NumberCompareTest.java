package study.chapter1.section3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NumberCompareTest {
    private int[] com, player1, player2, player3, player4, player5;

    @BeforeEach
    void setUp() {
        com = new int[]{1, 2, 3};
        player1 = new int[]{1, 3, 2};
        player2 = new int[]{1, 2, 5};
        player3 = new int[]{1, 2, 3};
        player4 = new int[]{3, 1, 2};
        player5 = new int[]{2, 4, 5};
    }

    @DisplayName("스트라이크 테스트")
    @Test
    void strikeTest() {

        // given
        final NumberCompare numberCompare = new NumberCompare();

        // when
        final int count1 = numberCompare.getStrikeCount(com, player1);
        final int count2 = numberCompare.getStrikeCount(com, player2);
        final int count3 = numberCompare.getStrikeCount(com, player3);
        final int count4 = numberCompare.getStrikeCount(com, player4);
        final int count5 = numberCompare.getStrikeCount(com, player5);

        // then
        Assertions.assertThat(count1).isEqualTo(1);
        Assertions.assertThat(count2).isEqualTo(2);
        Assertions.assertThat(count3).isEqualTo(3);
        Assertions.assertThat(count4).isEqualTo(0);
        Assertions.assertThat(count5).isEqualTo(0);
    }

    @DisplayName("볼 테스트")
    @Test
    void ballTest() {

        // given
        final NumberCompare numberCompare = new NumberCompare();

        // when
        final int count1 = numberCompare.getBallCount(com, player1);
        final int count2 = numberCompare.getBallCount(com, player2);
        final int count3 = numberCompare.getBallCount(com, player3);
        final int count4 = numberCompare.getBallCount(com, player4);
        final int count5 = numberCompare.getBallCount(com, player5);

        // then
        Assertions.assertThat(count1).isEqualTo(2);
        Assertions.assertThat(count2).isEqualTo(0);
        Assertions.assertThat(count3).isEqualTo(0);
        Assertions.assertThat(count4).isEqualTo(3);
        Assertions.assertThat(count5).isEqualTo(1);
    }
}

