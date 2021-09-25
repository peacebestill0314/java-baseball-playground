package baseball2;

import java.util.ArrayList;
import java.util.List;

public class Baseballs {
    private final List<Baseball> baseballs;

    public Baseballs(List<Integer> answers) {
        this.baseballs = getBaseballs(answers);
    }

    private List<Baseball> getBaseballs(List<Integer> answers) {
        List<Baseball> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Baseball(i + 1, answers.get(i)));
        }
        return list;
    }

    public BaseballStatus play(Baseball userball) {
        return baseballs.stream()
                .map(baseball -> baseball.play(userball))
                .filter(BaseballStatus::isNotNothing)
                .findFirst()
                .orElse(BaseballStatus.NOTHING);
    }
}

