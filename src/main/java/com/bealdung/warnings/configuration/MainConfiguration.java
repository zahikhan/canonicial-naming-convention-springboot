package com.bealdung.warnings.configuration;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <h2>This class is for Configuration.</h2>
 * <p>
 * Project Name: New folder
 *
 * @author Zahid Khan
 * @version 4/1/2023
 */
@Configuration
@ConfigurationProperties(prefix = "profile.application-properties")
@Data
public class MainConfiguration {
	String name;
	@PostConstruct
	void print(){
		System.err.println(name);
	}
}
