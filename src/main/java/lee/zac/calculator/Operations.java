package lee.zac.calculator;

import java.util.Objects;

/**
 * Created by zaclee on 9/11/16.
 */
public class Operations {

    /* Make an instance of Calculator inside here then you can use that to reference the values like displayValue. */

    public double add(double displayValue, double userInput) {
        return displayValue+userInput;
    }

    public double subtract(double displayValue, double userInput) {
        return displayValue-userInput;
    }

    public double multiply(double displayValue, double userInput) {
        return displayValue*userInput;
    }

    public double divide(double displayValue, double userInput) {
        return displayValue/userInput;
    }

    public Double varExpo(double displayValue, double userInput) {
        return Math.pow(displayValue,userInput);
    }

    // Operations that don't need a number

    public Double square(double displayValue) {
        return displayValue * displayValue;
    }

    public Double sqrt(double displayValue) {
        return Math.sqrt(displayValue);
    }

    public Double inverse(double displayValue) {
        return 1/displayValue;
    }

    public Double invert(double displayValue) {
        return displayValue*(-1);
    }

    //TRIG FUNCTIONS

    public Double sin(double displayValue) {
        return Math.sin(displayValue);
    }

    public Double cos(double displayValue) {
        return Math.cos(displayValue);
    }

    public Double tan(double displayValue) {
        return Math.tan(displayValue);
    }

    public Double inverseSin(double displayValue) {
        return Math.asin(displayValue);
    }

    public Double inverseCos(double displayValue) {
        return Math.acos(displayValue);
    }

    public Double inverseTan(double displayValue) {
        return Math.atan(displayValue);
    }








}

