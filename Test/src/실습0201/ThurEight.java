package 실습0201;

import 다른패키지.ThurSeven;

public class ThurEight extends ThurSeven {
	public void call() {
		inheritance();
	}
	public static void main(String[] args) {
		ThurEight thurEight = new ThurEight();
		thurEight.call();
	}

}
