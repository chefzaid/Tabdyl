package dev.simpleit.tabdyl.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class AppConfig {

	private Long sessionTtl;
	private Long sessionTimer;
	private Integer sessionMaxItems;

}
