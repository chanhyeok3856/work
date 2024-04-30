package chan.spring.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AssociationCall {
public static void main(String[] args) {
	AssociationDTO associationDTO = new AssociationDTO();
	associationDTO.setName("홍길동");
	associationDTO.setAge(33);
AssociationService associationService = new AssociationService();
associationService.setAssociationDTO(associationDTO);
System.out.println(associationService.getAssociationDTO());
}
}

