package chan.spring.ioc;

public class MessageKr implements Message{

	@Override
	public void call(String name) {
		// TODO Auto-generated method stub
		System.out.println("안녕"+name);
	}


}
