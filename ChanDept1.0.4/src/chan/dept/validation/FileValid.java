package chan.dept.validation;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileValid {
	
	public static boolean isValid(String deptno) {
		
		Pattern pattern1 = Pattern.compile("[\s\\{\\}\\/?,;:|*~`!^\\+<>@\\#$%&\\\\\\=\\]");
		Matcher matcher2 = pattern1.matcher(deptno);
		if (matcher2.find()) {
	System.out.println("올바른 번호를 입력하세요.");
	
	}
		return isValid(deptno);
	}

}