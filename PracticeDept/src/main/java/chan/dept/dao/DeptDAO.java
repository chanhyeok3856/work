package chan.dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import chan.dept.dto.DeptDTO;
import chan.dept.service.DeptService;

public class DeptDAO implements DeptService {
	public ArrayList<DeptDTO> deptSelectAll(){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>();
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
			connection = dataSource.getConnection();
			String sql = "select deptno, dname, loc from dept";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				DeptDTO deptDTO = new DeptDTO();
				deptDTO.setDeptno(resultSet.getInt("deptno"));
				deptDTO.setDname(resultSet.getString("dname"));
				deptDTO.setLoc(resultSet.getString("loc"));
				arrayList.add(deptDTO);
				//저장 정보 DeptDTO의 인스턴스에 추가.
			}
			resultSet.getRow();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return arrayList;
	}
@Override
public DeptDTO deptSelect(int deptno) {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	DeptDTO deptDTO = new DeptDTO();
	try {
	Context context = new InitialContext();
	DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
	connection = dataSource.getConnection();
	String sql = "select deptno, dname, loc from dept";
	sql += " where deptno = ? ";
	preparedStatement = connection.prepareStatement(sql);
	preparedStatement.setInt(1, deptno);
	resultSet = preparedStatement.executeQuery();
	while (resultSet.next()) {
		deptDTO.setDeptno(resultSet.getInt("deptno"));
		deptDTO.setDname(resultSet.getString("dname"));
		deptDTO.setLoc(resultSet.getString("loc"));
	}
	} catch (Exception e) {
		
	} finally {
		try {
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return deptDTO;
}

@Override
public DeptDTO deptInsert(DeptDTO deptDTO) {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	try {
		Context context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
		connection = dataSource.getConnection();
		String sql = "insert into dept (deptno, dname, loc ) ";
		sql += " values ( ? , ? , ? ) ";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, deptDTO.getDeptno());
		preparedStatement.setString(2, deptDTO.getDname());
		preparedStatement.setString(3, deptDTO.getLoc());
	int count = preparedStatement.executeUpdate();
	if (count > 0) {
		connection.commit();
	} else {
		connection.rollback();
	}
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return deptDTO;
}

@Override
public DeptDTO deptUpdate(DeptDTO deptDTO) {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	try {
		Context context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
		connection = dataSource.getConnection();
		String sql = "update dept set dname = ?, loc = ? ";
		sql += " where deptno = ?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, deptDTO.getDname()); 
		preparedStatement.setString(2, deptDTO.getLoc()); 
		preparedStatement.setInt(3, deptDTO.getDeptno()); 
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			connection.commit();
		}else {
			connection.rollback();
		}
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		try {
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return deptDTO;
}

@Override
public DeptDTO deptDelete(int deptno) {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	try {
		Context context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
		connection = dataSource.getConnection();
		String sql = "delete from dept";
		sql += " where deptno = ? ";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, deptno);
		int count = preparedStatement.executeUpdate();
		if (count >0) {
			connection.commit();
		}else {
			connection.rollback();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	return null;
}
}
