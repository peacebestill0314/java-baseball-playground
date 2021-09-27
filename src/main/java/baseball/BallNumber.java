package baseball;

public class BallNumber {

    public static final int MIN_INT = 1;
    public static final int MAX_INT = 9;

    public int no;

    public BallNumber(int no) {
        if(no < MIN_INT || no > MAX_INT) {
            throw new IllegalArgumentException("1~9까지만 허용");
        }
        this.no = no;
    }
}
