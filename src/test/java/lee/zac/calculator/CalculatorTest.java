package lee.zac.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zaclee on 9/11/16.
 */
public class CalculatorTest {


    @Test
    public void addTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = Double.valueOf(0);
        calc.userInputDouble= Double.valueOf(5);
        assertEquals("I want to add 0 + 5", "5.0", calc.add());
    }
    @Test
    public void subtractTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = Double.valueOf(10);
        calc.userInputDouble= Double.valueOf(5);
        assertEquals("5.0", calc.subtract());
    }
    @Test
    public void multiplyTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = Double.valueOf(10);
        calc.userInputDouble= Double.valueOf(5);
        assertEquals( "50.0", calc.multiply());
    }
    @Test
    public void divideTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = Double.valueOf(10);
        calc.userInputDouble= Double.valueOf(5);
        assertEquals("2.0", calc.divide());
    }
    @Test
    public void clearTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = Double.valueOf(10);
        calc.userInputDouble= Double.valueOf(5);
        assertEquals("0.0", calc.clear());
    }

    @Test
    public void squareTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = 10d;
        assertEquals("100.0", calc.square());
    }

    @Test
    public void sqrtTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = 100d;
        assertEquals("10.0", calc.sqrt());
    }

    @Test
    public void inverseTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = 100d;
        assertEquals("0.01", calc.inverse());
    }

    @Test
    public void invertTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = 100d;
        assertEquals("-100.0", calc.invert());
    }
    @Test
    public void DoubleToBinaryTest() {
        Calculator calc = new Calculator();
        calc.currentValue = "16";
        assertEquals("10000", calc.doubleToBinary());
    }
    @Test
    public void varExpoTest() {
        Calculator calc = new Calculator();
        calc.currentValueDouble = 10d;
        calc.userInputDouble = 2d;
        assertEquals("100.0", calc.varExpo());
    }




}
