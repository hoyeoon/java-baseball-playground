package study.chapter1.section3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGameClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomNumberGenerator randomNumberGenerators = new RandomNumberGenerator();
        NumberCompare numberCompare = new NumberCompare();
        int[] computer, player;
        int strikeCount, ballCount;
        int flag = 1;

        computer = randomNumberGenerators.generate();

        while (flag != 2) {
            System.out.println("computer = " + Arrays.toString(computer));
            System.out.print("숫자를 입력해 주세요 : ");
            player = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
            ballCount = numberCompare.getBallCount(computer, player);
            strikeCount = numberCompare.getStrikeCount(computer, player);
            String message = "";
            if (ballCount > 0) {
                message += ballCount + "볼 ";
            }
            if (strikeCount > 0) {
                message += strikeCount + "스트라이크";
            }
            if (message.equals("")) {
                message = "낫싱";
            }
            System.out.println(message);

            if (strikeCount == 3) {
                message = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
                message += "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
                System.out.println(message);
                computer = randomNumberGenerators.generate();
                flag = sc.nextInt();
            }
        }
    }
}
