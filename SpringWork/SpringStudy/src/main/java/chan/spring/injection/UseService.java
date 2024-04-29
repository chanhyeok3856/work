package chan.spring.injection;

import org.springframework.beans.factory.annotation.Autowired;

public class UseService {
private UseDTO useDTO;

public UseDTO getUseDTO() {
	return useDTO;
}
@Autowired
//빈의 이름은 useDTO가 된다
public void setUseDTO(UseDTO useDTO) {
	this.useDTO = useDTO;
}

}
