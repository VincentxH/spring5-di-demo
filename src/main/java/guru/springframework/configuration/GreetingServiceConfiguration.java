package guru.springframework.configuration;

import guru.springframework.repositories.*;
import guru.springframework.services.*;
import org.springframework.context.annotation.*;

@Configuration
public class GreetingServiceConfiguration {

	@Bean
	public GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {

		return new GreetingServiceFactory(repository);
	}

	@Bean
	@Primary
	@Profile({ LanguageProfile.DEFAULT, LanguageProfile.ENGLISH })
	public GreetingService primaryGreetingService(GreetingServiceFactory factory) {

		return factory.creatGreetingService(LanguageProfile.ENGLISH);
	}

	@Bean
	@Primary
	@Profile({ LanguageProfile.SPANISH })
	public GreetingService primarySpanishGreetingService(GreetingServiceFactory factory) {

		return factory.creatGreetingService(LanguageProfile.SPANISH);
	}

	@Bean
	@Primary
	@Profile({ LanguageProfile.GERMAN })
	public GreetingService primaryGreetingGermanService(GreetingServiceFactory factory) {

		return factory.creatGreetingService(LanguageProfile.GERMAN);
	}

}
