package chan.spring.configuration.scope;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import jakarta.inject.Inject;

@Configuration
public class ConfigScopeService {
	@Inject
	//매번 호출할 때마다 빈 생성 (프로토 타입의 특징)
	@Scope(value ="prototype")
	public ConfigScope configScopeService() {
		return new ConfigScope();
		
	}

}
