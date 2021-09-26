package baseball2;

public class BaseballNumber {

    public static final int MIN_NO = 0;
    public static final int MAX_NO = 10;

    private int no;

    public BaseballNumber(int no) {
        if(no >= MIN_NO && no < MAX_NO){
            throw new IllegalArgumentException("복 숫자는 1부터 9까지만 허용");
        }
        this.no = no;
    }
}
