package be.molowayi.jsf;

import java.io.Serializable;

/**
 * Created by JLVH on 31-05-19.
 */
public class NumberPlate implements Serializable {
    private int code;
    private int number;
    private int control;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }
}
