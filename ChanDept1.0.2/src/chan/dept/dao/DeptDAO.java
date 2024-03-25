package chan.dept.dao;

import java.sql.*;

public class DeptDAO {
	private String driver;
	private String url;
	private String userid;
	private String passwd;
	public DeptDAO() {
		

	
		driver = "oracle.jdbc.OracleDriver";
		url = "jdbc:oracle:thin:@192.168.0.59:1521:xe";
		userid = "scott";
		passwd = "tiger";
		

	
	}
	public void insert(int deptno, String dname, String loc){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept (deptno, dname, loc)";
			sql+= "values (?, ?, ?)";
			System.out.println("쿼리문 확인 :"+sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,deptno);
			preparedStatement.setString(2,dname);
			preparedStatement.setString(3,loc);
			int i = preparedStatement.executeUpdate();
			System.out.println(i+"개의 행을 입력합니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close(); connection.close(); 
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	
		
	}
	public void select(int deptno){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userid, passwd);
			String sql = "select from dept";
			sql += "where deptno = ?";
			System.out.println("쿼리문 확인 : "+ sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,deptno);
			int i = preparedStatement.executeUpdate();
			System.out.println(i+"개의 행이 조회되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close(); connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
		
	
	public void update(String dname, String loc, int deptno){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userid, passwd);
			String sql = "update dept set dname = ?, loc = ?";
			sql+= " where deptno = ?";
			System.out.println("쿼리문 확인 : "+ sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,dname);
			preparedStatement.setString(2,loc);
			preparedStatement.setInt(3, deptno);
			int i = preparedStatement.executeUpdate();
			System.out.println(i + "개의 행이 수정되었습니다");
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close(); connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	public  void delete(int deptno){
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userid, passwd);
			String sql = "delete from dept";
			sql += "where deptno = ?";
			System.out.println("쿼리문 확인 : "+ sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,deptno);
			int i = preparedStatement.executeUpdate();
			System.out.println(i+"개의 행이 삭제되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close(); connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
