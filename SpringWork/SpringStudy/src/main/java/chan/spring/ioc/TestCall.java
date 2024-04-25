package chan.spring.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCall {
	private static final Logger logger = LoggerFactory.getLogger(TestCall.class);
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new GenericXmlApplicationContext("bean/Bean.xml");
		logger.info("정보", applicationContext);
		Test test = (Test)applicationContext.getBean("test");
		logger.info(""+test);
		test.call();
	}
}
