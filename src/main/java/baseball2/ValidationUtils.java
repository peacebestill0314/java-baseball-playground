package baseball2;

public class ValidationUtils {

    public static final int MIN_NO = 0;
    public static final int MAX_NO = 10;

    public static boolean validate(int i) {
        return i >= MIN_NO && i < MAX_NO;
    }
}
