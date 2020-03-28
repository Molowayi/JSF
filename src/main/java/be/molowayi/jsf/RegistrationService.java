package be.molowayi.jsf;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class RegistrationService {
    private Map<Integer, List<Integer>> registration;

    public RegistrationService() {

        this.registration = new HashMap<>();
    }

    public void registerConsumption(int userId, int consumption) {
        List<Integer> list = new ArrayList<>();
        if (registration.containsKey(userId)) {
            list = registration.get(userId);
            list.add(consumption);
            registration.put(userId, list);
        } else {
            list.add(consumption);
            registration.put(userId, list);
        }

    }

    public String toString() {
        return registration.toString();
    }
}
