package chan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import chan.dto.DeptDTO;

public class InsertDAO {
public DeptDTO insert(int deptno, String dname, String loc) {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	DeptDTO deptDTO = new DeptDTO();
	deptDTO.setDeptno(deptno);
	deptDTO.setDname(dname);
	deptDTO.setLoc(loc);
	try {
		Context context = new InitialContext();
		DataSource dataSource = (DataSource)context.lookup("java:comp/env/jdbc");
		connection = dataSource.getConnection();
		String sql =  "insert into dept(deptno, dname, loc )";
		sql+=" values ( ? , ? , ? ) ";
		System.out.println(sql);
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, deptDTO.getDeptno());
		preparedStatement.setString(2, deptDTO.getDname());
		preparedStatement.setString(3, deptDTO.getLoc());
		preparedStatement.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		try {
			preparedStatement.close(); connection.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	return deptDTO;
}
}
