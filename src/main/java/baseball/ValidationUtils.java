package baseball;

import java.util.List;

public class ValidationUtils {

    public static final int MIN_INT = 1;
    public static final int MAX_INT = 9;

    public static boolean range(int i) {
        return i >= MIN_INT && i <= MAX_INT;
    }

    public static boolean duplicate(List<Integer> list) {
        return list.stream()
                .distinct()
                .count() != list.size();
    }
}
