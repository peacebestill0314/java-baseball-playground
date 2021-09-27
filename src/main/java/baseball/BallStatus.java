package baseball;

public enum BallStatus {
    NOTHING, BALL, STRIKE;

    boolean isStrike() {
        return this == STRIKE;
    }

    boolean isBall() {
        return this == BALL;
    }
}
