package be.molowayi.jsf.validation;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

public class Passenger implements Serializable {
    @Size(min = 1, message = "{validation.firstName}")
    private String firstName;
    @Size(min = 1, message = "{validation.lastName}")
    private String lastName;
    @Pattern(regexp = "[0-9]{11}", message = "Pattern ")
    private String nationalNumber;
    @Min(value = 0, message = "validation.age")
    private int age;
    @DecimalMax(value = "15", message = "Please enter luggage weight")
    @DecimalMin(value = "0", message = "Weight must be less than 15kg")
    private float luggageWeight;
    @Future
    private Date departureDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageWeight(float luggageWeight) {
        this.luggageWeight = luggageWeight;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalNumber='" + nationalNumber + '\'' +
                ", age=" + age +
                ", luggageWeight=" + luggageWeight +
                ", departureDate=" + departureDate +
                '}';
    }
}
