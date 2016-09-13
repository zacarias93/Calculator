package lee.zac.calculator;

import static com.sun.tools.javac.util.Assert.error;

/**
 * Created by zaclee on 9/12/16.
 */
public class Logic {

    private boolean powerOn;
    private Display display;
    private Memory memory;
    private Operations operations;
    private ConvertDisplayType convertDisplayType;
    double userInputValue;
    double newDisplayValue;
    double displayValue;
    public String displayMode;
    public String unitsMode;

    public Logic() {
        powerOn = true;
        display = new Display();
        memory = new Memory();
        convertDisplayType = new ConvertDisplayType();
        operations = new Operations();
        displayMode = "decimal";
        unitsMode = "decimal";
    }

    public void runCalculator() {
        System.out.println("Hello! Type 'list' for a list of commands!");
        while (powerOn) {
            System.out.print("What operation would you like perform? ");
            String userOperation = display.getUserOperation();
            delegateOperation(userOperation);
            System.out.println(memory.getDisplayValue());
        }
    }

    public void setPowerOff(){
        powerOn = false;
    }

    public void switchDisplayMode() {
        if(displayMode == "decimal") {
            System.out.println("The number in Binary is: " + convertDisplayType.doubleToBinary(newDisplayValue));
            displayMode = "binary";
        }
        else if (displayMode == "binary") {
            System.out.println("The number in Octal is: " + convertDisplayType.doubleToOctal(newDisplayValue));
            displayMode = "octal";
        }
        else if (displayMode == "octal") {
            System.out.println("The number in Hex is: " + convertDisplayType.doubleToHex(newDisplayValue));
            displayMode = "hex";
        }
        else if (displayMode == "hex") {
            System.out.println("The number in Decimals is: " + newDisplayValue);
            displayMode = "decimal";
        }
    }

    public void switchDisplayMode(String displayMode) {
        switch (displayMode) {
            case "binary":
                System.out.println("The number in Binary is: " + convertDisplayType.doubleToBinary(newDisplayValue));
                break;

            case "octal":
                System.out.println("The number in Octal is: " + convertDisplayType.doubleToOctal(newDisplayValue));
                break;

            case "hex":
                System.out.println("The number in Hex is: " + convertDisplayType.doubleToHex(newDisplayValue));
                break;

            default:
                System.out.println("Not a valid response.");
        }
    }

    public void switchUnitsMode() {
        if (unitsMode == "decimal") {
            System.out.println("The number in degrees is: " + Math.toDegrees(newDisplayValue));
            unitsMode = "degrees";
        } else if (unitsMode == "degrees") {
            System.out.println("The number in radians is: " + Math.toRadians(newDisplayValue));
            unitsMode = "radians";
        } else if (unitsMode == "radians") {
            System.out.println("The number in Decimals is: " + newDisplayValue);
            unitsMode = "decimal";
        }
    }



        public void switchUnitsMode(String unitsMode) {
        switch (unitsMode) {
            case "radians":
                System.out.println("The number in radians is: " + Math.toRadians(newDisplayValue));
        }

        switch (unitsMode) {
            case "degrees":
                System.out.println(("The number in degrees is: " + Math.toDegrees(newDisplayValue)));
        }
    }


    public void delegateOperation(String userOperation) {

        // Operations that need a number ~~~~~~~~~~~~~~~~~~~~~~
        switch (userOperation) {
            case "off":
                setPowerOff();
                break;

            case "add":
                userInputValue = display.getUserDoubleInput();
                newDisplayValue = operations.add(memory.getDisplayValue(), userInputValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "subtract":
                userInputValue = display.getUserDoubleInput();
                newDisplayValue = operations.subtract(memory.getDisplayValue(), userInputValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "multiply":
                userInputValue = display.getUserDoubleInput();
                newDisplayValue = operations.multiply(memory.getDisplayValue(), userInputValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "divide":
                userInputValue = display.getUserDoubleInput();
                if ( userInputValue == 0) {
                    display.error();
                } else {
                    newDisplayValue = operations.divide(memory.getDisplayValue(), userInputValue);
                    memory.setDisplayValue(newDisplayValue);
                }
                break;

            case "var expo":
                userInputValue = display.getUserDoubleInput();
                newDisplayValue = operations.varExpo(memory.getDisplayValue(), userInputValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            //OPS THAT DON'T NEED userInput(); ----------------------------------------------


            case "list":
                display.printOptions();
                break;

            case "clear":
                memory.clearDisplayValue();
                break;

            case "square":
                newDisplayValue = operations.square(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "sqrt":
                if (displayValue < 0) {
                    error();
                } else {
                    newDisplayValue = operations.sqrt(memory.displayValue);
                    memory.setDisplayValue(newDisplayValue);
                }
                break;

            case "inverse":
                newDisplayValue = operations.inverse(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "sin":
                newDisplayValue = operations.sin(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "cos":
                newDisplayValue = operations.cos(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "tan":
                newDisplayValue = operations.tan(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "inverse sin":
                newDisplayValue = operations.inverseSin(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "inverse cos":
                newDisplayValue = operations.inverseCos(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "inverse tan":
                newDisplayValue = operations.inverseTan(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "factorial":
                newDisplayValue = operations.inverseTan(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "log":
                newDisplayValue = operations.log(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "natural log":
                newDisplayValue = operations.naturalLog(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "inverse ln":
                newDisplayValue = operations.inverseNaturalLog(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "inverse log":
                newDisplayValue = operations.inverseLog(memory.displayValue);
                memory.setDisplayValue(newDisplayValue);
                break;

            case "m+":
                memory.setMemoryValueUpdateDisplay();
                break;

            case "mc":
                memory.clearMemoryValue();
                break;

            case "mrc":
                memory.setMemoryValueToDisplay();
                break;

            case "switch display":
                System.out.println("Which display would you like to see: binary, octal, or hex?");
                switchDisplayMode(display.getUserDisplayMode());
                break;

            case "switch units":
                System.out.println("Which units would you like to see: degrees or radians?");
                switchUnitsMode(display.getUserUnitsMode());
                break;

            case "rotate display":
                switchDisplayMode();
                break;

            case "rotate units":
                switchUnitsMode();
                break;





       default:
                System.out.println("You broke me! Try again!");
                runCalculator();
                break;
        }
    }
}
