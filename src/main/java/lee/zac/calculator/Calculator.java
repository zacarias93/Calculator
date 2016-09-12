package lee.zac.calculator;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by zaclee on 9/11/16.
 */
public class Calculator {

    Boolean powerOn;
    String currentValue="0";
    Double currentValueDouble=0.0;
    String userInput;
    Double userInputDouble;
    String userOperation;
    String memValue = "0";
    Core core;
    int currentValueBinary;
    String currentDisplay = "decimal";

    /*
    Use this to move stuff into another class (Core) so that everything doesn't have to be in one class.
    public Calculator {
        this.powerOn = false;
        String this.currentValue="0";
        Double this.currentValueDouble=0.0;
        String this.userInput;
        Double this.userInputDouble;
        String this.userOperation;
        String this.memValue = "0";
        Core this.core;
    }
    */



    public void setPowerOn() {
        powerOn = true;
        System.out.println("Hello! Type 'list' for a list of commands!");
        while (powerOn) {
            display();
            askOperation();
        }
    }

    public void setPowerOff(){
        powerOn = false;
        return;
    }

    public void display() {
            System.out.println("Display: " + currentValue);
            return;
    }

    public String getUserOperation() {
        Scanner in = new Scanner(System.in);
        userOperation = in.nextLine();
        return userOperation.toLowerCase();
    }

    public String getUserInput() {
        Scanner in = new Scanner(System.in);
        userInput = in.nextLine();
        return userInput;
    }

    public void convertUserInputToDouble() {
        this.userInputDouble = Double.valueOf(this.userInput);
    }

    public void convertCurrentValueToDouble() {
        Double currentValueDouble = Double.valueOf(this.currentValue);
    }

    public void convertCurrentValueToString() {
        this.currentValue = String.valueOf(currentValueDouble);
    }

    public void askNumber() {
        System.out.print("Please enter a number: ");
        getUserInput();
        convertUserInputToDouble();
        convertCurrentValueToDouble();
    }

    public void askOperation() {
        System.out.print("What operation would you like perform? ");
        getUserOperation();

       // Operations that need a number

        if (userOperation.equals("off")) {
            setPowerOff();
        }
        else if(userOperation.equals("add")) {
            askNumber();
            add();
        }
        else if(userOperation.equals("subtract")) {
            askNumber();
            subtract();
        }
        else if(userOperation.equals("multiply")) {
            askNumber();
            multiply();
        }
        else if(userOperation.equals("divide")) {
            askNumber();
            if(userInputDouble == 0) { error(); }
            else { divide(); }
        }
        else if(userOperation.equals("change")) {
            askNumber();
            change();
        }
        else if(userOperation.equals("var expo")) {
            askNumber();
            varExpo();
        }

        //OPS THAT DON'T NEED askNumber(); ----------------------------------------------

        else if(userOperation.equals("list")) {
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("add, subtract, multiply, divide");
            System.out.println("square, sqrt, inverse, invert, var expo");
            System.out.println("list, change, clear, rotate, off");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
        }
        else if(userOperation.equals("clear")) {
            clear();
        }
        else if(userOperation.equals("square")) {
            square();
        }
        else if(userOperation.equals("sqrt")) {
            if(currentValueDouble<0) {
                error();
            }
            else {
                sqrt();
            }
        }
        else if(userOperation.equals("inverse")) {
            inverse();
        }
        else if(userOperation.equals("invert")) {
            invert();
        }
        else if(userOperation.equals("rotate")) {
            switchDisplay();
        }






        else {
            System.out.println("You broke me! Try again!");
            askOperation();
        }
    }

    public String add() {
        currentValueDouble += userInputDouble;
        convertCurrentValueToString();
        return currentValue;
    }

    public String subtract() {
        currentValueDouble -= userInputDouble;
        convertCurrentValueToString();
        return currentValue;
    }

    public String multiply() {
        currentValueDouble *= userInputDouble;
        convertCurrentValueToString();
        return currentValue;
    }

    public String divide() {
        currentValueDouble /= userInputDouble;
        convertCurrentValueToString();
        return currentValue;
    }
    public String varExpo() {
        currentValueDouble = Math.pow(currentValueDouble,userInputDouble);
        convertCurrentValueToString();
        return currentValue;
    }

    public String change() {
        convertUserInputToDouble();
        currentValueDouble = userInputDouble;
        convertCurrentValueToString();
        return currentValue;
    }

    // Operations that don't need a number

    public String clear() {
        currentValueDouble = 0.0d;
        convertCurrentValueToString();
        return currentValue;
    }
    public String square() {
        convertCurrentValueToDouble();
        currentValueDouble = currentValueDouble*currentValueDouble;
        convertCurrentValueToString();
        return currentValue;
    }
    public String sqrt() {
        convertCurrentValueToDouble();
        currentValueDouble = Math.sqrt(currentValueDouble);
        convertCurrentValueToString();
        return currentValue;
    }
    public String inverse() {
        convertCurrentValueToDouble();
        currentValueDouble = 1.0d/currentValueDouble;
        convertCurrentValueToString();
        return currentValue;
    }
    public String invert() {
        convertCurrentValueToDouble();
        currentValueDouble = -currentValueDouble;
        convertCurrentValueToString();
        return currentValue;
    }
    public void error() {
        System.out.println("Error! Clear before continuing.");
        getUserInput();
        while(!Objects.equals(userInput.toLowerCase(), "clear")) {
            error();
        }
        currentValueDouble=0d;
        convertCurrentValueToString();
        setPowerOn();
    }

    // THESE METHODS STILL NEED WORK - THE SWITCH DOES WORK THE FIRST TIME

    public String doubleToBinary() {
        int currentValueInt;
        String currentValueBinary;
        double dubs = Double.valueOf(currentValue);
        Integer ints = (int)dubs;
        currentValueInt = Integer.valueOf(ints);
        currentValueBinary = Integer.toBinaryString(currentValueInt);
        currentValue = currentValueBinary;
        currentDisplay = "binary";
        return currentValue;
    }

    public void switchDisplay() {
        if(Objects.equals(currentDisplay, "decimal")) {
            doubleToBinary();
        }

    }










    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.setPowerOn();


    }
}