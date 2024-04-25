package chan.spring.ioc;

public class MessageCall {
public static void main(String[] args) {
	Message message = MessageFactory.create("beankr");
	message.call("홍길동");
}
}
