package de.tmt.angry.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.tmt.angry.persistence" })
public class PersistenceConfig {

}
