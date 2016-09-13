package lee.zac.calculator;

import org.junit.Before;
import org.junit.Test;
import sun.security.x509.DeltaCRLIndicatorExtension;

import static org.junit.Assert.*;

/**
 * Created by zaclee on 9/11/16.
// */
public class CalculatorTest {

    double delta;
    Operations operations;
    @Before
    public void setUpTest() {
        operations = new Operations();
        delta = 10^-15;
    }

    @Test
    public void addTest() {
        double expected = 15;
        double actual = operations.add(10,5);
        assertEquals(expected,actual,delta);

    }

    @Test
    public void sinTest() {
        double expected = 0;
        double actual = operations.sin(0);
        assertEquals(expected,actual,delta);
    }

    @Test
    public void cosTest() {
        double expected = 1;
        double actual = operations.cos(0);
        assertEquals(expected,actual,delta);
    }

    @Test
    public void tanTest() {
        double expected = 0;
        double actual = operations.tan(0);
        assertEquals(expected,actual,delta);
    }

    @Test
    public void inverseCosTest() {
        double expected = 0;
        double actual = operations.inverseCos(0);
        assertEquals(expected,actual,delta);
    }

    @Test
    public void inverseSinTest() {
        double expected = 0;
        double actual = operations.inverseSin(0);
        assertEquals(expected,actual,delta);
    }

    @Test
    public void inverseTanTest() {
        double expected = 0;
        double actual = operations.inverseTan(0);
        assertEquals(expected,actual,delta);
    }








//    @Test
//    public void subtractTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(0);
//        calc.userInputDouble= Double.valueOf(5);
//        assertEquals("5.0", operations.subtract());
//    }
//    @Test
//    public void multiplyTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(0);
//        calc.userInputDouble= Double.valueOf(5);
//        assertEquals( "50.0", operations.multiply());
//    }
//    @Test
//    public void divideTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(0);
//        calc.userInputDouble= Double.valueOf(5);
//        assertEquals("2.0", operations.divide());
//    }
//    @Test
//    public void clearTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(0);
//        calc.userInputDouble= Double.valueOf(5);
//        assertEquals("0.0", operations.clear());
//    }
//
//    @Test
//    public void squareTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(100);
//        assertEquals("100.0", operations.square());
//    }
//
//    @Test
//    public void sqrtTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(100);
//        assertEquals("10.0", operations.sqrt());
//    }
//
//    @Test
//    public void inverseTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(100);
//        assertEquals("0.01", operations.inverse());
//    }
//
//    @Test
//    public void invertTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(100);
//        assertEquals("-100.0", operations.invert());
//    }
// /*   @Test
//    public void DoubleToBinaryTest() {
//        Calculator calc = new Calculator();
//        calc.displayValue = "16";
//        assertEquals("10000", calc.doubleToBinary());
//    }
// */
//    @Test
//    public void varExpoTest() {
//        Calculator calc = new Calculator();
//        Operations operations = new Operations();
//        calc.displayValue = Double.valueOf(100);
//        calc.userInputDouble = Double.valueOf(2);
//        assertEquals("100.0", operations.varExpo());
//    }
//



}
