package chan.spring.lombok;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokCall {

private static final Logger logger = LoggerFactory.getLogger(LombokCall.class);

public static void main(String[] args) {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanBeanConfig.class);
	logger.info("정보", applicationContext);
	LombokDTO lombokDTO = new LombokDTO();
	lombokDTO.setName("홍길동");
	lombokDTO.setAge(33);
	logger.info("" + lombokDTO);
}
}

