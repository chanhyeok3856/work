package chan.dept.control;
import java.util.Scanner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import chan.dept.action.DeptAction;
import chan.dept.dao.DeptDAO;
import chan.dept.dto.DeptDTO;
public class DeptSelectDetail implements DeptAction {
private static final Log log = LogFactory.getLog(DeptSelectDetail.class);
@Override
public void execute(Scanner scanner) {
DeptDAO deptDAO = new DeptDAO( );
DeptDTO deptDTO = new DeptDTO( );
System.out.println("부서 번호를 입력하세요.");
System.out.print("부서 번호 : ");
int deptno = scanner.nextInt( );
// 조회한 데이터를 반환하여 deptDTO 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다. 
deptDTO = deptDAO.deptSelect(deptno);
log.info("데이터 확인 - " + deptDTO);
deptno = deptDTO.getDeptno( );
String dname = deptDTO.getDname( );
String loc = deptDTO.getLoc( );
if(deptDTO.getDeptno( ) == 0) {
System.out.println("등록된 부서 번호가 없습니다.");
} else {
System.out.println(deptno + " " + dname + " " + loc);
}
}
}