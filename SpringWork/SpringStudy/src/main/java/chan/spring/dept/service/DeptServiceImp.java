package chan.spring.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import chan.spring.dept.dao.DeptDAO;
import chan.spring.dept.dto.DeptDTO;
@Service
public class DeptServiceImp implements DeptService{
	private final DeptDAO deptDAO;
	@Autowired
	public DeptServiceImp(@Qualifier("deptDAOImp") DeptDAO deptDAO) {
		this.deptDAO = deptDAO;
	}
	@Override
	public List<DeptDTO> deptSelectAll() {
		// TODO Auto-generated method stub
		return deptDAO.selectAll();
	}

	@Override
	public DeptDTO deptSelect(int deptno) {
		// TODO Auto-generated method stub
		return deptDAO.select(deptno);
	}

	@Override
	public void deptInsert(DeptDTO deptDTO) {
		// TODO Auto-generated method stub
		try{
			deptDAO.insert(deptDTO);
			//데이터 무결성 제약조건에 대한 예외 처리
		}catch(DataIntegrityViolationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deptUpdate(DeptDTO deptDTO) {
		// TODO Auto-generated method stub
		deptDAO.update(deptDTO);
	}

	@Override
	public void deptDelete(int deptno) {
		// TODO Auto-generated method stub
		deptDAO.delete(deptno);
	}

}
