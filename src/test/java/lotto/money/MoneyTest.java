package lotto.money;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void 숫자로_돈_객체_생성(){
        Money money = new Money(1000);
        assertThat(money.amount()).isEqualTo(1000);
    }

    @Test
    void 문자열로_돈_객체_생성(){
        Money money = new Money("1000");
        assertThat(money.amount()).isEqualTo(1000);
    }

    @Test
    void 음수_금액_입력_예외_테스트(){
        assertThatThrownBy(() -> new Money(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 문자입력_숫자_포멧_예외_테스트(){
        assertThatThrownBy(() -> new Money("1000ㅁㄴ"))
                .isInstanceOf(NumberFormatException.class);
    }

    @Test
    void 문자입력_음수_예외_테스트(){
        assertThatThrownBy(() -> new Money("-100"))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    void 숫자입력_음수_예외_테스트(){
        assertThatThrownBy(() -> new Money(-100))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
