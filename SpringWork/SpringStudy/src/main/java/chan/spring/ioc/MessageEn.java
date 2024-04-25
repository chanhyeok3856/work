package chan.spring.ioc;

public class MessageEn implements Message{

	@Override
	public void call(String name) {
		// TODO Auto-generated method stub
		System.out.println("hi"+name);
	}

}
