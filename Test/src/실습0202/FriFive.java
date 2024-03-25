package 실습0202;



public class FriFive {
	public void variableArgument(String...names) {
		for (String string : names) {
			System.out.print(string);
		}
		System.out.println();
	}

}
