package baseball;

import java.util.Scanner;

public class BaseBall {

    char[] computer;

    public BaseBall() {
        this.computer = "425".toCharArray();
    }

    public char[] inputView() {

        System.out.println("숫자를 입력해 주세요 :");
        Scanner sc = new Scanner(System.in);
        return String.valueOf(sc.nextInt()).toCharArray();
    }

    public int strike(char[] num) {

        int result = 0;
        if (num[0] == this.computer[0]) {
            result = result + 1;
        }
        if (num[1] == this.computer[1]) {
            result = result + 1;
        }
        if (num[2] == this.computer[2]) {
            result = result + 1;
        }
        return result;
    }

    public int ball(char[] num) {

        int result = 0;
        if (this.computer[0] == num[1] || computer[0] == num[2]) {
            result = result + 1;
        }
        if (this.computer[1] == num[0] || computer[1] == num[2]) {
            result = result + 1;
        }
        if (this.computer[2] == num[0] || computer[2] == num[1]) {
            result = result + 1;
        }
        return result;
    }

    public int run() {

        boolean go = true;
        int strike = 0;
        while (go) {
            char[] input = inputView();
            strike = strike(input);
            int ball = ball(input);
            if (strike > 0) {
                System.out.println(strike + " 스트라이크 ");
            }
            if (ball > 0) {
                System.out.println(ball + " 볼 ");
            }
            if (strike == 3) {
                go = false;
            }
        }
        return strike;
    }
}
