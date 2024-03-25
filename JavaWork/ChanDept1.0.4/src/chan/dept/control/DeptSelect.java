package chan.dept.control;
import chan.dept.action.DeptAction;
import chan.dept.dao.DeptDAO;
import chan.dept.dto.DeptDTO;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class DeptSelect implements DeptAction {
private static final Log log = LogFactory.getLog(DeptSelect.class);
@Override
public void execute(Scanner scanner) {
ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>( );
DeptDAO deptDAO = new DeptDAO( );
// 가변 배열에 추가한 전체 데이터를 반환하여 arrayList 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다. 
arrayList = deptDAO.deptSelectAll( );
log.info("데이터 확인 - " + arrayList);
boolean check = false;
// 저장된 데이터를 반복하여 출력한다. 
for(DeptDTO deptDTO : arrayList) {
int deptno = deptDTO.getDeptno( );
String dname = deptDTO.getDname( );
String loc = deptDTO.getLoc( );
System.out.println(deptno + " " + dname + " " + loc);
check = true;
}
if(check == false) {
System.out.println("등록한 부서가 없습니다. 부서를 등록해 주세요");
}
}
}