import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addition() {
        assertEquals(2, calculator.addition(1, 1),0 );
    }

    @Test
    public void substraction() {
        assertEquals(0, calculator.difference(1, 1), 0);
    }

    @Test
    public void multiplication() {
        assertEquals(2, calculator.multiplication(1, 2 ), 0);
    }

    @Test
    public void division() {
        assertEquals(2, calculator.division(4,2),0);
    }
}