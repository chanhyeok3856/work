package chan.spring.injection;

public class UseCall {
	public static void main(String[] args) {
		UseDTO useDTO = new UseDTO();
		useDTO.setName("홍길동");
		useDTO.setAge(33);
		UseService useService = new UseService();
		useService.setUseDTO(useDTO);
		
	}
}
