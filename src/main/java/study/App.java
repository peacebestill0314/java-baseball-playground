package study;

public class App {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.operator(c.converter(c.inputView()));
        System.out.printf("result : " + result);
    }
}
