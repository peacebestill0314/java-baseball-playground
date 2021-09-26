package baseball2;

import java.util.ArrayList;
import java.util.List;

public class Baseballs {
    public final List<Baseball> combaseballs;

    public Baseballs(List<Integer> answers) {
        this.combaseballs = getBaseballs(answers);
    }

    // 세자리씩 받은 숫자 List<Baseball> 타입으로 변경
    private List<Baseball> getBaseballs(List<Integer> answers) {
        List<Baseball> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Baseball(i + 1, answers.get(i)));
        }
        return list;
    }

    public BaseballStatus play(Baseball userball) {


        return combaseballs.stream()
                .map(baseball -> baseball.play(userball))
                .filter(BaseballStatus::isNotNothing)
                .findFirst()
                .orElse(BaseballStatus.NOTHING);
    }

    // 세자리씩 받아서 플레이 시키기
    public PlayResult play(List<Integer> balls) {

        // 유저 볼도 balls에 똑같이 넣어서 만들어줌
        Baseballs baseballs = new Baseballs(balls);
        PlayResult result = new PlayResult();

        for (Baseball baseball : combaseballs) {
            BaseballStatus status = baseballs.play(baseball);
            result.repost(status);
        }

        return result;
    }
}

