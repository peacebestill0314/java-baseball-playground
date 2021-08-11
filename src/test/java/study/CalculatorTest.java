package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator cal;

    @BeforeEach
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void converter() {
        for(String s : cal.converter("2 + 3 * 4 / 2")){
            System.out.println(s);

        }
        // String[] result = {"2","+","3","*","4","/","2"};
        // assertEquals(result, cal.converter("2 + 3 * 4 / 2"));
    }

    @Test
    public void operator() {
        cal.operator(cal.converter("2 + 3 * 4 / 2"));
    }
}