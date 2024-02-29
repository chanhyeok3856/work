package chan.dept.control;
import java.util.*;
import org.apache.commons.logging.*;
import chan.dept.action.DeptAction;
import chan.dept.dao.DeptDAO;
import chan.dept.dto.DeptDTO;
public class DeptUpdate implements DeptAction {
private static final Log log = LogFactory.getLog(DeptUpdate.class);
@Override
public void execute(Scanner scanner) {
DeptDAO deptDAO = new DeptDAO( );
ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>( );
System.out.println("부서를 수정하세요.");
System.out.print("부서 번호 : ");
int deptno = scanner.nextInt( );
// 가변 배열에 추가한 전체 데이터를 반환하여 arrayList 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다.
arrayList = deptDAO.deptSelectAll( );
log.info("데이터 확인 - " + arrayList);
boolean check = false;
for(DeptDTO deptDTO2 : arrayList) {
// ==(더블 이퀄) 연산자로 조건을 입력한 deptno 변숫값을 확인한다. 
	if(deptDTO2.getDeptno( ) == deptno) {
System.out.print("부서 이름 : ");
String dname = scanner.next( );
System.out.print("지역 : ");
String loc = scanner.next( );
DeptDTO deptDTO = new DeptDTO( );
//수정한 데이터를 반환하여 deptDTO 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다. 
deptDTO = deptDAO.deptUpdate(deptno, dname, loc);
log.info("데이터 확인 - " + deptDTO);
System.out.println("부서를 수정했습니다.");
check = true;
//조건이 맞으면 반복문의 { }(코드 블록)을 벗어나서 프로그램을 종료한다.
break;
}
}
if(check == false) {
System.out.println("수정할 부서 번호가 없습니다.");
}
}
}
