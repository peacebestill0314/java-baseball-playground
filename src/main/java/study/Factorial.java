package study;

public class Factorial {

    public static long factorial(int n) {
        long result = 0;

        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }

        return result;
    }

    public Factorial() {
        Factorial f = new Factorial();
        int n = 5;
        System.out.println(n + "! = " + f.factorial(n));
    }
}
