package chan.dept.control;
import java.util.ArrayList;
import java.util.Scanner;
import chan.dept.action.DeptAction;
import chan.dept.dao.DeptDAO;
import chan.dept.dto.DeptDTO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class DeptInsert implements DeptAction {
private static final Log log = LogFactory.getLog(DeptInsert.class);
@Override
public void execute(Scanner scanner) {
DeptDAO deptDAO = new DeptDAO( );
DeptDTO deptDTO = new DeptDTO( );
ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>( );
System.out.println("부서를 등록하세요.");
System.out.print("부서 번호 : ");
int deptno = scanner.nextInt( );
// 가변 배열에 추가한 전체 데이터를 반환하여 arrayList 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다. 
arrayList = deptDAO.deptSelectAll( );
log.info("데이터 확인 - " + arrayList);
// 저장된 데이터를 반복하여 출력한다. 
for(DeptDTO deptDTO2 : arrayList) {
// ==(더블 이퀄) 연산자로 조건을 입력한 deptno 변숫값을 확인한다. 
if(deptDTO2.getDeptno( ) == deptno) {
System.out.println("이미 등록한 부서 번호가 있습니다.");
return;
}
}
System.out.print("부서 이름 : ");
String dname = scanner.next( );
System.out.print("지역 : ");
String loc = scanner.next( );
// 입력된 데이터를 반환하여 deptDTO 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다. deptDTO = deptDAO.deptInsert(deptno, dname, loc);
log.info("데이터 확인 - " + deptDTO);
System.out.println("새로운 부서를 등록했습니다.");
}
}
