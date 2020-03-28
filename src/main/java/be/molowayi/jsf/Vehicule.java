package be.molowayi.jsf;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.util.Date;

@Named
@RequestScoped
public class Vehicule {
    private String brand;
    private String type;
    private String fuel;
    private double power;
    private Date firstUse;
    private String chassisNumber;
    private double co2;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Date getFirstUse() {
        return firstUse;
    }

    public void setFirstUse(Date firstUse) {
        this.firstUse = firstUse;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public void checkDate(FacesContext context, UIComponent component, Object value){
        Date date = (Date) value;
        UIInput comp = (UIInput) component;
        Date now = new Date();
        if (date.after(now)){
            FacesMessage message = new FacesMessage("Date is not in the past");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(component.getClientId(), message);
            comp.setValid(false);
        }

    }

}
