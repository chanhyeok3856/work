package chan.dept.service;

import java.util.ArrayList;
import chan.dept.dto.DeptDTO;

public interface DeptService {
	public ArrayList<DeptDTO> deptSelectAll();
	public DeptDTO deptSelect(int deptno);
	public DeptDTO deptInsert(int deptno, String dname, String loc);
	public DeptDTO deptUpdate(int deptno, String dname, String loc);
	public DeptDTO deptDelete(int deptno);
}
