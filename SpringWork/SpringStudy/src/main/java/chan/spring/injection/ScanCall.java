package chan.spring.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ScanCall {
	
	private static final Logger logger = LoggerFactory.getLogger(ScanCall.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("bean/Bean.xml");
		logger.info("정보", applicationContext);
		 ScanDTO scanDTO = new ScanDTO();
		 scanDTO.setName("홍길동");
		 scanDTO.setAge(33);
		 logger.info(""+scanDTO.toString());
		 ScanService scanService = (ScanService) applicationContext.getBean("scanService");
		 scanService.setScanDTO(scanDTO);
		 System.out.println(scanService.getScanDTO());
		
	}

}
