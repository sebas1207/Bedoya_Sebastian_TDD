package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void give_two_integer_when_addition_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(2,3)).thenReturn(5);
        assertEquals(5,c.addition(2,3));
    }

    @Test
    public void give_two_integer_when_subtraction_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.subtraction(7,2)).thenReturn(5);
        assertEquals(5,c.subtraction(7,2));
    }

    @Test
    public void give_two_integer_when_multiply_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.multiply(7,9)).thenReturn(63);
        assertEquals(63,c.multiply(7,9));
    }

    @Test
    public void give_two_integer_when_divide_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.divide(45,5)).thenReturn(9);
        assertEquals(9,c.divide(45,5));
    }
}