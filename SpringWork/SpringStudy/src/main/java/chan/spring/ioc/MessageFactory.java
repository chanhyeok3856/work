package chan.spring.ioc;

public class MessageFactory {
	public static Message create(String instance) {
		if (instance.equals("beanKr")) {
			return new MessageKr();
		}else if (instance.equals("beanEn")) {
			return new MessageEn();
		}else {
			return null;
		}
	}
}
