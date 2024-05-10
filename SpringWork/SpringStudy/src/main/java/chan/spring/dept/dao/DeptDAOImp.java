package chan.spring.dept.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import chan.spring.dept.dto.DeptDTO;
import lombok.RequiredArgsConstructor;
@Repository
@RequiredArgsConstructor
public class DeptDAOImp implements DeptDAO{
	@Autowired
	//SqlSession 인터페이스의 모든 기능 구현.
private final SqlSessionTemplate sqlSessionTemplate;
	@Override
	public List<DeptDTO> selectAll(){
		return sqlSessionTemplate.selectList("chan.spring.dept.selectAll");
	}
	@Override
	public DeptDTO select(int deptno) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("chan.spring.dept.select", deptno);
	}
	@Transactional
	@Override
	public void insert(DeptDTO deptDTO) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.selectOne("chan.spring.dept.insert", deptDTO);
	}
	@Override
	public void update(DeptDTO deptDTO) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.selectOne("chan.spring.dept.update", deptDTO);
	}
	@Override
	public void delete(int deptno) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.selectOne("chan.spring.dept.delete", deptno);
	}
}
