package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Ball> ballList;

    public Balls(List<Integer> list) {
        // 여기서 list를 Ball 타입으로 만들 수 있다는 생각
        // 여기서 ball을 list 만큼 생성했을 때 Balls의 어떤 타임으로 들어가야 하는가
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ballList.add(new Ball(i + 1, list.get(i)));
        }
        this.ballList = ballList;
    }

    public BallStatus play(Ball ball) {
        // 여기서 list로 갖고있는 ball들을 비교해야 함

        // 멤버인 1,1 2,2 3,3 이 3번 돌거임
        // for문의 for문이 필요한 상황 아닌가?
        // 잘 보면 한개씩 변형했음, Balls가 아닌 Ball이 매개변수로 온 상태
        return ballList.stream()
                .map(b -> b.play(ball))
                .filter(r -> r != BallStatus.NOTHING)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
