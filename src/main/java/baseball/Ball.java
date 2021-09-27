package baseball;

import java.util.Objects;

public class Ball {

    private final int position;
    private final BallNumber number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = new BallNumber(number);
    }

    public BallStatus play(Ball ball) {
        if (isMatchAll(ball)) {
            return BallStatus.STRIKE;
        }
        // this.isMatch가 핵심.
        // 호출한 객체의 play가 호출 되어야 멤버의 number와 비교함.
        if (this.isMatch(ball.number)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isMatchAll(Ball ball) {
        return this.position == ball.position && isMatch(ball.number);
    }

    private boolean isMatch(BallNumber number) {
        return this.number.no == number.no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }
}
