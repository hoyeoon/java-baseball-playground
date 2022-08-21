package study.chapter1.section3;

public class NumberCompare {
    public int getStrikeCount(int[] com, int[] player) {
        int count = 0;

        for (int i = 0; i < com.length; i++) {
            if (com[i] == player[i]) count++;
        }
        return count;
    }

    public int getBallCount(int[] com, int[] player) {
        int count = 0;

        for (int i = 0; i < com.length; i++) {
            for (int j = 0; j < player.length; j++) {
                if (i == j) continue;
                if (com[i] == player[j]) count++;
            }
        }
        return count;
    }
}
