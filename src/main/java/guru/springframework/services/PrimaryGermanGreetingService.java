package guru.springframework.services;

import guru.springframework.repositories.*;
import org.springframework.beans.factory.annotation.*;

/**
 * Created by jt on 5/24/17.
 */
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    @Autowired
    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {

        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
