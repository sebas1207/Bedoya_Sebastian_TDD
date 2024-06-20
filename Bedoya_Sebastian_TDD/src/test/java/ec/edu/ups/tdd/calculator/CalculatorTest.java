package ec.edu.ups.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        c = new Calculator();
        System.out.println("setUp()");

    }
    //Suma
    @Test
    public void given_two_integers_when_addition_then_ok(){
        assertEquals(6,c.addition(4,2));
        System.out.println("method1");
    }
    @Test(expected = AssertionError.class)
    public void given_two_integers_when_addition_then_exception(){
        assertEquals(6,c.addition(-4,2));
        System.out.println("methodException1");
    }
    @Test(timeout = 150)
    public void given_two_integers_when_addition_then_timeout(){
        System.out.println("methodtimeout1");
        assertEquals(6,c.additionTime(4,2));
    }



    //Resta

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
       assertEquals(7,c.subtraction(9,2));
        System.out.println("method2");
    }
    @Test(expected = AssertionError.class)
    public void given_two_integers_when_subtraction_then_exception(){
        assertEquals(7,c.subtraction(-9,2));
        System.out.println("methodException2");
    }
    @Test(timeout = 150)
    public void given_two_integers_when_subtraction_then_timeout(){
        System.out.println("methodtimeout1");
        assertEquals(7,c.subtractionTime(9,2));
    }

    //Multiplicacion

    @Test
    public void given_two_integers_when_multiply_then_ok(){
        assertEquals(27,c.multiply(3,9));
        System.out.println("method3");
    }

    @Test(expected = AssertionError.class)
    public void given_two_integers_when_multiply_then_exception(){
        assertEquals(27,c.multiply(-3,9));
        System.out.println("methodException3");
    }
    @Test(timeout = 150)
    public void given_two_integers_when_multiply_then_timeout(){
       System.out.println("methodTimeOut3");
       assertEquals(27,c.multiplyTime(9,3));
    }

    //Division
    @Test
    public void given_two_integers_when_divide_then_ok(){
        assertEquals(7,c.divide(63,9));
        System.out.println("methodd4");
    }
    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_divide_then_exception(){
        assertEquals(3,c.divide(6,0));
        System.out.println("testException4");
    }
    @Test(timeout = 150)
    public void given_two_integers_when_divide_then_timeout(){
        System.out.println("methodTimeOut3");
        assertEquals(7,c.divideTime(63,9));
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAns(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }

}