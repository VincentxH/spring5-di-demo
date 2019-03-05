package guru.springframework.services;

import guru.springframework.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	@Autowired
	public PrimaryGreetingService(GreetingRepository greetingRepository) {

		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {

		return greetingRepository.getEnglishGreeting();
	}
}
