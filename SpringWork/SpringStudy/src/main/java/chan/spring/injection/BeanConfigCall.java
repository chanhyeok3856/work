package chan.spring.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanConfigCall {
	
	private static final Logger logger = LoggerFactory.getLogger(BeanConfigCall.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("bean/Bean.xml");
		logger.info("정보", applicationContext);
		//빈을 호출한다.
		 BeanConfig beanConfig = (BeanConfig) applicationContext.getBean("beanConfig");
		logger.info("" + beanConfig);
	}

}
