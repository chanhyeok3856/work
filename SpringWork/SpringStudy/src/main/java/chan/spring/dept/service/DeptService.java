package chan.spring.dept.service;

import java.util.List;

import chan.spring.dept.dto.DeptDTO;

public interface DeptService {
	List<DeptDTO> deptSelectAll();
	DeptDTO deptSelect(int deptno);
	void deptInsert(DeptDTO deptDTO);
	void deptUpdate(DeptDTO deptDTO);
	void deptDelete(int deptno);

}
