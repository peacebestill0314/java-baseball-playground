package study;

public class Calculator {

    public int calculator(String input) {
        String[] values = input.split(" ");
        int result = Integer.parseInt(values[0]);
        for (int i = 1; i < values.length; i = i + 2) {
            result = operator(result, values[i], Integer.parseInt(values[i + 1]));
        }
        return result;
    }

    public int operator(int result, String operator, int num) {
        switch (operator) {
            case "+":
                return add(result, num);
            case "-":
                return subtract(result, num);
            case "*":
                return multiply(result, num);
            case "/":
                return divide(result, num);
            default:
                return 0;
        }
    }

    public int add (int result, int num) {
        return result + num;
    }

    public int subtract (int result, int num) {
        return result - num;
    }

    public int multiply (int result, int num) {
        return result * num;
    }

    public int divide (int result, int num) {
        return result / num;
    }
}