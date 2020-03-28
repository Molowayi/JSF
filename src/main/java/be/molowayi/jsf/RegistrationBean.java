package be.molowayi.jsf;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("registration")
@RequestScoped
public class RegistrationBean {
    @Inject
    private RegistrationService service;

    private int id;
    private int consumption;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initialisation of the registration bean");
    }

    public void register() {
        service.registerConsumption(id, consumption);
        id = 0;
        consumption = 0;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying the registration bean");
        System.out.println(service);
    }
}
