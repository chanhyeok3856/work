package chan.spring.injection;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import jakarta.inject.Inject;


@Configuration
public class ConfigScopeService {
	@Inject
	@Scope(value ="prototype")
	public ConfigScope configScopeService() {
		return new ConfigScope();
	}

}
