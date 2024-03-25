package 실습;

public class MonOne {
	public static void main(String[] args) {
		int []score =new int [5];
		score[0]=78;
		score[1]=97;
		score[2]=85;
		//score[3]=99;
	
		score[4]=91;
		for (int i = 0; i <=score.length; i++) {
			System.out.println("배열값 : "+ score[i]);
			
		}
	}

}
