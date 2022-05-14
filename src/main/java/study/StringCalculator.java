package study;

import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        System.out.println(stringCalculator(value));
    }

    static int stringCalculator(String value) {
        String[] values = getStrings(value);
        int answer = getInteger(values[0]);

        for(int i = 1; i < values.length; i++){
            // 숫자인 경우
            if(!(values[i].equals("+") || values[i].equals("-") || values[i].equals("*") || values[i].equals("/"))){
                if(values[i - 1].equals("+")){
                    answer += Integer.parseInt(values[i]);
                }
                else if(values[i - 1].equals("-")){
                    answer -= Integer.parseInt(values[i]);
                }
                else if(values[i - 1].equals("*")){
                    answer *= Integer.parseInt(values[i]);
                }
                else{
                    answer /= Integer.parseInt(values[i]);
                }
            }
        }
        return answer;
    }

    static int getInteger(String value) {
        int answer = Integer.parseInt(value);
        return answer;
    }

    static String[] getStrings(String value) {
        String[] values = value.split(" ");
        return values;
    }
}
