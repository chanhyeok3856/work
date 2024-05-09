package chan.spring.configuration.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ConfigScopeCall {

private static final Logger logger = LoggerFactory.getLogger(ConfigScopeCall.class);

public static void main(String[] args) {
	//ConfigScope 클래스 참조하여 호출한다.
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigScope.class);
	logger.info("정보", applicationContext);
	 ConfigScope configScope = (ConfigScope) applicationContext.getBean("configScope");
	logger.info("" + configScope);
}

}
