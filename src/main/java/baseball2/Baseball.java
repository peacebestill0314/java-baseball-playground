package baseball2;

import java.util.Objects;

public class Baseball {

    private final int p;
    private final int num;

    public Baseball(int p, int num) {
        this.p = p;
        this.num = num;

    }

    public BaseballStatus play(Baseball baseball) {
        if(this.equals(baseball)) {
            return BaseballStatus.STRIKE;
        }

        if(baseball.matchNum(this.num)){
            return BaseballStatus.BALL;
        }

        return BaseballStatus.NOTHING;
    }

    // 객체에 직접 접근하지 말고 객체에 메세지를 보낸다.
    private boolean matchNum(int num) {
        return this.num == num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baseball baseball = (Baseball) o;
        return p == baseball.p && num == baseball.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(p, num);
    }
}

