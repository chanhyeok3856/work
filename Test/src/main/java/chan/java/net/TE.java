package chan.java.net;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
public class TE {
public static void main(String[ ] args) {
try {
//스트림 소켓의 인스턴스를 생성하고 서버 IP 주소의 설정된 임의의 포트 번호에 연결한다. 
	Socket socket = new Socket("192.168.0.227", 9191);
//소켓의 입력 스트림을 반환하여 소켓의 입력 스트림을 연다. 
	InputStream inputStream = socket.getInputStream( );
//설정된 입력 스트림에서 객체의 직렬화된 데이터를 원 상태의 타입으로 읽을 수 있는 인스턴스를 선언한다. 
	ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//객체를 입력 스트림으로 읽고 출력한다. 
	System.out.println(objectInputStream.readObject( ));
objectInputStream.close( );
socket.close( );
} catch(Exception e) {
System.out.println("서버를 먼저 실행시켜야 합니다.");
}
}
}
