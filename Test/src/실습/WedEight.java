package 실습;

public class WedEight {
public static void main(String[] args) {
	String[]citie = {"서울","대구","춘천","울산","광주","천안" };
	System.out.println("citie주소값 : "+citie);
	String[]copy = new String[citie.length];
	System.out.println("copy 주소값 : "+copy);
	for (String str : copy) {
		System.out.print(" "+str + " ");
	}
	System.out.println();
	System.arraycopy(citie , 0 , copy, 0 , citie.length);
	for (String str : copy) {
		System.out.print(" "+str+" ");
		
	}
}
}
