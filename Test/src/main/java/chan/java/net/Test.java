package chan.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.net.InetAddress;
//import java.net.MalformedURLException;
import java.net.URL;
//import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com/");
		InputStream inputStream = url.openStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "EUC-KR");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String string = bufferedReader.readLine();
		while (string!= null) {
			System.out.println(string);
			string = bufferedReader.readLine();
		}
		bufferedReader.close();

	}

}
