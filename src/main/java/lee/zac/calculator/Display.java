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

    public String getUserDisplayMode() {
        String userDisplayMode = scan.nextLine();
        return userDisplayMode.toLowerCase();
    }

    public String getUserUnitsMode() {
        String userUnitsMode = scan.nextLine();
        return userUnitsMode.toLowerCase();
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
        System.out.println("binary, octal, hex");
        System.out.println("m+, mc, mrc,");
        System.out.println("switch units, rotate units, switch display, rotate display");
        System.out.println("log, natural log, inverse ln, inverse log");
        System.out.println("list, change, clear, rotate, off");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
    }


//        Calculator.getUserInput();
//        while(!Objects.equals(Calculator.userInput.toLowerCase(), "clear")) {
//            error();
//        }
//        Calculator.displayValue =0d;
//        Calculator.setPowerOn();

}
