package dev.simpleit.tabdyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class TabdylApplication {

	public static void main(String[] args) {
		SpringApplication.run(TabdylApplication.class, args);
	}

}
