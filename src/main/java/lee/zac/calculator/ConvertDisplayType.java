package lee.zac.calculator;

/**
 * Created by zaclee on 9/12/16.
 */
public class ConvertDisplayType {

    // THESE METHODS STILL NEED WORK - THE SWITCH DOES WORK THE FIRST TIME --- Imple


    String binaryString;
    String octalString;
    String HexString;
    double newDisplayValue;
//    Logic logic = new Logic();

    public String doubleToBinary(double displayValue) {
        int displayValueInt = (int) displayValue;
        binaryString = Integer.toBinaryString(displayValueInt);
        return binaryString;
    }

    public String doubleToOctal(double displayValue) {
        int displayValueInt = (int) displayValue;
        octalString = Integer.toOctalString(displayValueInt);
        return octalString;
    }

    public String doubleToHex(double displayValue) {
        int displayValueInt = (int) displayValue;
        HexString = Integer.toHexString(displayValueInt);
        return HexString;
    }


    public void switchDisplayMode() {

    }




}
