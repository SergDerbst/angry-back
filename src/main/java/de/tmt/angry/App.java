package de.tmt.angry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import de.tmt.angry.config.ControllerConfig;
import de.tmt.angry.config.PersistenceConfig;

@SpringBootApplication
@Import({ ControllerConfig.class, PersistenceConfig.class })
public class App {

	public static void main(final String[] args) {
		SpringApplication.run(App.class, args);
	}
}
