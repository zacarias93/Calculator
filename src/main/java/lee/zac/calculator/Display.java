package lee.zac.calculator;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by zaclee on 9/12/16.
 */
public class Display {

    private Scanner scan;

    public Display() {
        scan = new Scanner(System.in);
    }


    public void printToConsole(String string) {
        System.out.println(string);
    }

    public void printDisplayValue (double displayValue) {
        System.out.println("Display: " + displayValue);
    }


    public String getUserOperation() {
        String userOperation = scan.nextLine();
        return userOperation.toLowerCase();
    }

    public double getUserDoubleInput() {
        System.out.print("Please enter a number: ");
        double userInput = scan.nextDouble();
        scan.nextLine();
        return userInput;
    }

    public void printOptions() {
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("add, subtract, multiply, divide");
        System.out.println("square, sqrt, inverse, invert, var expo");
        System.out.println("list, change, clear, rotate, off");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
    }

    public void error() {
        System.out.println("Error! Clear before continuing.");
//        Calculator.getUserInput();
//        while(!Objects.equals(Calculator.userInput.toLowerCase(), "clear")) {
//            error();
//        }
//        Calculator.displayValue =0d;
//        Calculator.setPowerOn();
    }

}
