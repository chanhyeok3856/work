package chan.spring.injection;

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
