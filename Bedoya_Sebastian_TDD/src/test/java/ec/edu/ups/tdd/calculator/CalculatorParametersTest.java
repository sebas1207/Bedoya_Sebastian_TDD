package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value= Parameterized.class)
public class CalculatorParametersTest {
    private int a,b,expected;
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{1,8,8});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{7,3,10});
        objects.add(new Object[]{22,4,26});
        objects.add(new Object[]{12,14,26});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test
    public void given_two_integers_when_addition_then_ok(){
        Calculator calc = new Calculator();
        int actual = calc.addition(a,b);
        assertEquals(expected, actual);
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        Calculator calc = new Calculator();
        int actual = calc.subtraction(a,b);
        assertEquals(expected, actual);
    }

    @Test
    public void given_two_integers_when_multiplication_then_ok(){
        Calculator calc = new Calculator();
        int actual = calc.multiply(a,b);
        assertEquals(expected, actual);
    }

    @Test
    public void given_two_integers_when_division_then_ok(){
        Calculator calc = new Calculator();
        int actual = calc.divide(a,b);
        assertEquals(expected, actual);
    }
}