package be.molowayi.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ApplicationScoped
public class Calculator implements Serializable {
    private double result = 0;
    private double input = 0;

    public double getResult() {
        return result;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public void add() {
        result += input;
        input = 0;
    }

    public void substract() {
        result -= input;
        input = 0;
    }

    public void divide() {
        result /= input;
        input = 0;
    }

    public void multiply() {
        if (input != 0) {
            result *= input;
        }
        input = 0;
    }

    public void ce() {
        result = 0;
        input = 0;
    }
}
