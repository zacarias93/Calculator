package lee.zac.calculator;

/**
 * Created by zaclee on 9/12/16.
 */
public class Memory {

    public double displayValue;

    public Memory () {

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
}
