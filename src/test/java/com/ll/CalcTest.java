package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
// int rs = Calc.run("((3 + 5) * 5 + -10) * 10 / 5");
public class CalcTest {
    @Test
    @DisplayName("3 + 5")
    public void t1() {
        int rs = Calc.run("3 + 5");

        assertThat(rs).isEqualTo(8);
    }

    @Test
    @DisplayName("(3 + 5) * 5")
    public void t2() {
        int rs = Calc.run("8 * 5");

        assertThat(rs).isEqualTo(40);
    }

    @Test
    @DisplayName("(3 + 5) * 5 + -10")
    public void t3() {
        int rs = Calc.run("40 + -10");

        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("((3 + 5) * 5 + -10) * 10")
    public void t4() {
        int rs = Calc.run("30 * 10");

        assertThat(rs).isEqualTo(300);
    }

    @Test
    @DisplayName("((3 + 5) * 5 + -10) * 10 / 5")
    public void t5() {
        int rs = Calc.run("300 / 10");

        assertThat(rs).isEqualTo(30);
    }


}
