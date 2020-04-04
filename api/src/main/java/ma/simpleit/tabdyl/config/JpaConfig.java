package ma.simpleit.tabdyl.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaConfig {

	@Bean
	public AuditorAware<String> auditorProvider() {
		// TODO It's not working/auditing, to fix
		// TODO Once Spring Security is implemented
		// SecurityContextHolder.getContext().getAuthentication().getName();
		return () -> Optional.ofNullable("SYSTEM");
	}

}
