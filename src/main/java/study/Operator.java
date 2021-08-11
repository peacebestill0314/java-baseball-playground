package study;

public class Operator {

    public int run(int result, String operator, int num) {

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
