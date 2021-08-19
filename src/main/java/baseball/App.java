package baseball;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        BaseBall baseBall = new BaseBall();
        boolean start = true;
        while (start) {
            baseBall.run();
            if(!output()) {
                start = false;
            }
        }
    }

    public static boolean output() {

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == 2) {
            return false;
        }
        return true;
    }
}
