package chan.dept.view;
import java.util.Scanner;
import chan.dept.control.*;
public class DeptMain {
public static void main(String[ ] args) {
Scanner scanner = new Scanner(System.in);
// 조건식과 관계없이 데이터 조회, 데이터 입력, 데이터 수정, 데이터 삭제, 프로그램 종료를 수행한다. 
do {
System.out.println("\n메뉴 번호를 선택하세요.");
System.out.println("1.부서 전체 조회 "+"2.부서 등록 "+"3.부서 수정 "+"4.부서 삭제 "+"5.부서 상세 조회 "+"6.종료");
System.out.print("번호 입력 : ");
String menu = scanner.next( );
switch(menu) {
case "1":
DeptSelect deptSelect = new DeptSelect( );
deptSelect.execute(scanner);
break;
case "2":
DeptInsert deptInsert = new DeptInsert( );
deptInsert.execute(scanner);
break;
case "3":
DeptUpdate deptUpdate = new DeptUpdate( );
deptUpdate.execute(scanner);
break;
case "4":
DeptDelete deptDelete = new DeptDelete( );
deptDelete.execute(scanner);
break;
case "5":
DeptSelectDetail deptSelectDetail = new DeptSelectDetail( );
deptSelectDetail.execute(scanner);
break;
case "6":
System.out.println("프로그램을 종료합니다."); System.exit(0);
default:
System.out.println("1번에서 6번 중의 번호를 선택하세요.");
break;
}
} while(true);
}
}
