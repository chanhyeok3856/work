package chan.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanScopeCall {

private static final Logger logger = LoggerFactory.getLogger(BeanScopeCall.class);

public static void main(String[] args) {
	ApplicationContext applicationContext = new GenericXmlApplicationContext("bean/Bean.xml");
	logger.info("정보", applicationContext);
	 BeanScope beanScope1 = (BeanScope) applicationContext.getBean("beanScope");
	 BeanScope beanScope2 = (BeanScope) applicationContext.getBean("beanScope");
	System.out.println("beanScope1 주소값 :" +beanScope1);
	System.out.println("beanScope2 주소값 :" +beanScope2);
}
}
