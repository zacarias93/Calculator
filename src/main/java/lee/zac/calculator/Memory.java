package lee.zac.calculator;

/**
 * Created by zaclee on 9/12/16.
 */
public class Memory {

    public double displayValue;
    public double memoryValue;

    public Memory() {

        displayValue = 0;

    }

    public double getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(double newDisplayValue) {

        displayValue = newDisplayValue;
    }

    public void clearDisplayValue() {
        displayValue = 0.0d;
    }

    public void setMemoryValueUpdateDisplay() {

        memoryValue = displayValue;
        displayValue = 0;
    }

    public void clearMemoryValue() {

        memoryValue = 0;
    }

    public void setMemoryValueToDisplay() {
        displayValue = memoryValue;
    }



//    public void switchDisplayMode(); {
//        if (displayValue)
//    }

}
