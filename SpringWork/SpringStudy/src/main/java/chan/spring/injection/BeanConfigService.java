package chan.spring.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeanConfigService {
	@Bean(name = "beanConfig", initMethod="go")
	public BeanConfig call() {
		return new BeanConfig();
	}
}
