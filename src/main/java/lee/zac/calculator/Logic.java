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
    double userInputValue;
    double newDisplayValue;
    double displayValue;

    public Logic() {
        powerOn = true;
        display = new Display();
        memory = new Memory();
        operations = new Operations();
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






/*        else if(userOperation.equals("rotate")) {
            switchDisplay();
        }
*/
            default:
                System.out.println("You broke me! Try again!");
                runCalculator();
                break;
        }
    }
}
