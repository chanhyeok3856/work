package chan.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@192.168.0.59:1521:xe";
		String userid = "scott";
		String passwd="tiger";
		
		int deptno = 90;
		String dname = "홍길동";
		String loc = "서울";
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		try {
			Class.forName(driver);
			
		connection = 	DriverManager.getConnection(url,userid, passwd);
			String sql = "insert into dept(deptno, dname, loc)";
			sql+="values(?,?,?)";
			System.out.println(sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,deptno);
			preparedStatement.setString(2,dname);
			preparedStatement.setString(3, loc);
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
