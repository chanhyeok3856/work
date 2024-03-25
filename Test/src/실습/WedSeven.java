package 실습;

public class WedSeven {
	public static void main(String[] args) {
		int[][] num =   new int [3][2];
		char c = 'A';
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = c++;
			}
			
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num["+i+"]["+j+"]="+(char)num[i][j]);
			}
		}
	}

}
