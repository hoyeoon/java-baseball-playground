package study.chapter1.section3;

public class RandomNumberGenerator {

    public int[] generate() {
        int[] randomNums = new int[3];

        outer:
        for (int i = 0; i < 3; i++) {
            int randomNum = (int) (Math.random() * 10);
            if (randomNum == 0) {
                i--;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (randomNums[j] == randomNum) {
                    i--;
                    continue outer;
                }
            }
            randomNums[i] = randomNum;
        }
        return randomNums;
    }
}
