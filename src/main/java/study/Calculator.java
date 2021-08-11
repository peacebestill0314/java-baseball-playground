package study;

import java.util.Scanner;

public class Calculator {

    public String inputView() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String[] converter(String input) {
        return input.split(" ");
    }

    public int operator(String[] inputArray) {
        int result = Integer.parseInt(inputArray[0]);
        Operator operator = new Operator();
        for(int i = 1; i < inputArray.length; i = i + 2) {
            result = operator.run(result, inputArray[i], Integer.parseInt(inputArray[i + 1]));
        }
        return result;
    }
}