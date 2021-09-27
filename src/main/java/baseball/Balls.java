package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    // 1, 2, 3
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

    public PlayResult play(List<Integer> list) {
        Balls balls = new Balls(list);

        PlayResult playResult = new PlayResult();

        for (int i = 0; i < 3; i++) {
            BallStatus ballStatus = play(balls.ballList.get(i));
            playResult.report(ballStatus);
        }

        // 여기서 낫싱을 주려면 어떠한 카운트도 올리지 않을 경우 또는 줘야 할 경우 어떻게 처리해야 하지
        // 플레이 result는 어떠한 멤버를 갖고 있어야 할지
        // 어떻게 값을 넣어야 할지
        return playResult;
    }

    public BallStatus play(Ball ball) {
        // 여기서 list로 갖고있는 ball들을 비교해야 함

        // 멤버인 1,1 2,2 3,3 이 3번 돌거임
        // for문의 for문이 필요한 상황 아닌가?
        // 잘 보면 한개씩 변형했음, 매개변수로 Balls가 아닌 Ball이 온 상태
        return ballList.stream()
                .map(b -> b.play(ball))
                .filter(r -> r != BallStatus.NOTHING)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
