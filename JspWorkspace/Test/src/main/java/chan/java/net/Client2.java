package chan.java.net;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
// Thread 클래스에 생성된 구현 클래스로 스레드를 선언한다. 
public class Client2 extends Thread {
private static Socket socket;
public static void main(String[ ] args) throws Exception {
// 스트림 소켓의 인스턴스를 생성하고 설정된 IP 주소의 설정된 포트 번호에 연결한다. 
	socket = new Socket("192.168.0.227", 9191);
InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
BufferedReader sendRead = new BufferedReader(inputStreamReader1);
// 소켓의 출력 스트림을 반환하고 출력 스트림으로 할당한다. 
OutputStream outputStream = socket.getOutputStream( );
PrintWriter printWriter = new PrintWriter(outputStream);
// 소켓의 입력 스트림을 반환하고 입력 스트림으로 할당한다. 
InputStream inputStream = socket.getInputStream( );
InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream);
BufferedReader receiveRead = new BufferedReader(inputStreamReader2);
System.out.println("대화를 입력한 후 Enter 키를 누르십시오.");
String receiveMessage = "";
String sendMessage = "";
while(true) {
sendMessage = sendRead.readLine( );
printWriter.println(sendMessage);
//출력 스트림을 비우고 버퍼된 출력 바이트를 강제로 기록한다. 
printWriter.flush( );
if((receiveMessage = receiveRead.readLine( )) != null) {
System.out.println(receiveMessage);
}
}
}
}