package chan.dept.service;

import java.util.ArrayList;

import chan.dept.dto.DeptDTO;

public interface DeptService {
	public ArrayList<DeptDTO> deptSelectAll();
	public DeptDTO deptSelect(int deptno);
	public DeptDTO deptInsert(DeptDTO deptDTO);
	public DeptDTO deptUpdate(DeptDTO deptDTO);
	public DeptDTO deptDelete(int deptno);

}
