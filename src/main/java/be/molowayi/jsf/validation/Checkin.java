package be.molowayi.jsf.validation;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
class Checkin implements Serializable{
    private String toto;

    public String getToto() {
        return toto;
    }

    public void setToto(String toto) {
        this.toto = toto;
    }

    private Passenger passenger = new Passenger();

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String register(){
        System.out.println(this);
        toto = passenger.toString();
        return "success";
    }

    @Override
    public String toString() {
        return "Checkin{" +
                "passenger=" + passenger +
                '}';
    }
}
