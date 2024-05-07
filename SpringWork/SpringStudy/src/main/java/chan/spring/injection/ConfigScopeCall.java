package chan.spring.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ConfigScopeCall {
	
	private static final Logger logger = LoggerFactory.getLogger(ConfigScopeCall.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("bean/Bean.xml");
		logger.info("정보", applicationContext);
		 ConfigScope configScope = (ConfigScope) applicationContext.getBean("configScope");
		logger.info("" + configScope);
	}

}
