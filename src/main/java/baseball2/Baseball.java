package baseball2;

import java.util.Objects;

public class Baseball {

    private final int position;
    private final BaseballNumber num;

    public Baseball(int position, int num) {
        this.position = position;
        this.num = new BaseballNumber(num);

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
    private boolean matchNum(BaseballNumber num) {
        return this.num == num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baseball baseball = (Baseball) o;
        return position == baseball.position && num == baseball.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, num);
    }
}

