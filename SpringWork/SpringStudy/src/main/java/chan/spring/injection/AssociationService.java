package chan.spring.injection;

public class AssociationService {
private AssociationDTO associationDTO;

public AssociationDTO getAssociationDTO() {
	return associationDTO;
}

public void setAssociationDTO(AssociationDTO associationDTO) {
	this.associationDTO = associationDTO;
}
}
