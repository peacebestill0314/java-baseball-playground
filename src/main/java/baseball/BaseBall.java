package baseball;

import java.util.Scanner;

public class BaseBall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        while (check){
            System.out.println("");
            System.out.print("숫자를 입력해 주세요 :");
            char[] input = String.valueOf(sc.nextInt()).toCharArray();
            char[] computer = "425".toCharArray();

            // 볼(같은수다른자리) 스트라이크(같은수같은자리), 낫싱(같은수전혀없음) 체크
            int[] result = new int[2];

            if(input[0] == computer[0]) {
                result[0] = result[0] + 1;
            }
            if(input[1] == computer[1]) {
                result[0] = result[0] + 1;
            }
            if(input[2] == computer[2]) {
                result[0] = result[0] + 1;
            }

            if(computer[0] == input[1] || computer[0] == input[2]) {
                result[1] = result[1] + 1;
            }
            if(computer[1] == input[0] || computer[1] == input[2]) {
                result[1] = result[1] + 1;
            }
            if(computer[2] == input[0] || computer[2] == input[1]) {
                result[1] = result[1] + 1;
            }

            if(result[0] > 0) {
                System.out.print(result[0]+" 스트라이크 ");
            }
            if(result[1] > 0) {
                System.out.println(result[1]+" 볼 ");
            }
            if(result[0] == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                if(sc.nextInt() == 2) {
                    check = false;
                }
            }
        }
    }
}
