package chan.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.util.Iterator;

public class Client {
	private static DatagramSocket datagramSocket;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		datagramSocket = new DatagramSocket();
		System.out.println("<보낼 내용>");
		String msg = bufferedReader.readLine();
		for (int i = 1; i < 4; i++) {
			InetAddress inetAddress = InetAddress.getByName("192.168.0.227" + i);
			DatagramPacket datagram = new DatagramPacket(msg.getBytes(),msg.getBytes().length, inetAddress, 9191);
			datagramSocket.send(datagram);
			
		}
		datagramSocket.close();
		System.out.println("전송 완료");
	}

}
