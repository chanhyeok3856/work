package chan.dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import chan.dept.dbcp.Context;
import chan.dept.dto.DeptDTO;
import chan.dept.service.DeptService;

public class DeptDAO implements DeptService {
	private static final Log log = LogFactory.getLog(DeptDAO.class);
	@Override
	public ArrayList<DeptDTO> deptSelectAll(){
		ArrayList<DeptDTO>arrayList = new ArrayList<DeptDTO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
		Context context = new Context();
		DataSource dataSource = context.basicDataSource;
		connection = dataSource.getConnection();
		String sql = "select deptno, dname, loc from dept";
		log.info("SQL - "+ sql);
		preparedStatement = connection.prepareStatement(sql);
		resultSet =  preparedStatement.executeQuery();
		while (resultSet.next()) {
			DeptDTO deptDTO = new DeptDTO();
			deptDTO.setDeptno(resultSet.getInt("deptno"));
			log.info("부서 번호 확인 -"+resultSet.getInt("deptno"));
			deptDTO.setDname(resultSet.getString("dname"));
			deptDTO.setLoc(resultSet.getString("loc"));
			arrayList.add(deptDTO);
			
			
		}
		resultSet.getRow();
		if (resultSet.getRow() == 0) {
			log.info("등록한 부서가 없습니다.");
			
		}
	}catch(Exception e) {
		log.info("예외 확인 -"+e);
	}finally {
		try {
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	
	return arrayList;
	}
	}
	@Override
		public DeptDTO deptInsert(int deptno, String dname, String loc) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			DeptDTO deptDTO = new DeptDTO();
			deptDTO.setDeptno(deptno);
			deptDTO.setDname(dname);
			deptDTO.setLoc(loc);
			try {
				Context context = new Context();
				DataSource dataSource = context.basicDataSource;
				connection = dataSource.getConnection();
				String sql = "insert into dept (deptno, dname, loc)";
				sql += "values (?, ?, ?)";
				log.info("SQL - "+ sql);
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, deptDTO.getDeptno());
				preparedStatement.setString(2, deptDTO.getDname());
				preparedStatement.setString(3, deptDTO.getLoc());
				preparedStatement.executeUpdate();
			}catch(Exception e) {
				log.info("예외 확인 -"+e);
			}finally {
				try {
					preparedStatement.close();
					connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return deptDTO;
		}
		@Override
		public DeptDTO deptDelete(int deptno) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// 입력한 정보를 DeptDTO 클래스의 인스턴스에 저장한다.
		DeptDTO deptDTO = new DeptDTO( );
		deptDTO.setDeptno(deptno);
		try {
		Context context = new Context( );
		DataSource dataSource = context.basicDataSource;
		connection = dataSource.getConnection( );
		String sql = "delete from dept ";
		sql += " where deptno = ?";
		log.info("SQL - " + sql);
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, deptDTO.getDeptno( ));
		// SQL인 delete…from…where 문을 실행하고 데이터를 삭제한다. preparedStatement.executeUpdate( );
		} catch(Exception e) {
		log.info("예외 확인 - " + e);
		} finally {
		try {
		preparedStatement.close( );
		connection.close( );
		} catch(SQLException e) {
		e.printStackTrace( );
		}
		}
		return deptDTO;
		}
		@Override
		public DeptDTO deptSelect(int deptno) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		DeptDTO deptDTO = new DeptDTO( );
		try {
		Context context = new Context( );
		DataSource dataSource = context.basicDataSource;
		connection = dataSource.getConnection( );
		String sql = "select deptno, dname, loc from dept ";
		sql += " where deptno = ? ";
		log.info("SQL - " + sql);
		// SQL을 데이터베이스로 보내기 위한 인스턴스를 생성하고 데이터베이스에 요청한다. 
		preparedStatement = connection.prepareStatement(sql);
		// deptno 파라미터값을 int 타입으로 설정한다. 
		preparedStatement.setInt(1, deptno);
		// SQL인 select…from…where 문을 실행하고 데이터를 조회한다. 
		resultSet = preparedStatement.executeQuery( );
		while(resultSet.next( )) {
		//호출한 정보를 DeptDTO 클래스의 인스턴스에 저장한다. 
			deptDTO.setDeptno(resultSet.getInt("deptno"));
		deptDTO.setDname(resultSet.getString("dname"));
		deptDTO.setLoc(resultSet.getString("loc"));
		}
		} catch(Exception e) {
		log.info("예외 확인 - " + e);
		} finally {
		try {
		resultSet.close( );
		preparedStatement.close( );
		connection.close( );
		} catch(SQLException e) {
		e.printStackTrace( );
		}
		}
		return deptDTO;
		}
		

}
