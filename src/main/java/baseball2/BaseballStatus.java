package baseball2;

public enum BaseballStatus {
    STRIKE, NOTHING, BALL;

    public boolean isNotNothing() {
        return this != NOTHING;
    }
}
