package guru.springframework.services;

import guru.springframework.repositories.*;

public class GreetingServiceFactory {

	private final GreetingRepository repository;

	public GreetingServiceFactory(GreetingRepository repository) {

		this.repository = repository;
	}

	public GreetingService creatGreetingService(String lang) {

		switch (lang) {
			case "en":
				return new PrimaryGreetingService(repository);

			case "de":
				return new PrimaryGermanGreetingService(repository);

			case "es":
				return new PrimarySpanishGreetingService(repository);

			default:
				return new PrimaryGreetingService(repository);

		}

	}
}
