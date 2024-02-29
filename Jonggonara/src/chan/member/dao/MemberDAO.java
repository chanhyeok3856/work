package chan.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import chan.member.dto.MemberDTO;
import chan.member.dao.MemberDAO;
import chan.member.dbcp.Context;

public class MemberDAO {
	

	
	public ArrayList<MemberDTO> memberSelectAll( ) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>( );
		try {
			Context context = new Context( );
			DataSource dataSource = context.basicDataSource;
			connection = dataSource.getConnection( );
			String sql = "select phonenumber, company, idnumber, name from member";
			
			preparedStatement = connection.prepareStatement(sql);
			
			resultSet = preparedStatement.executeQuery( );
			
			while(resultSet.next( )) {
				MemberDTO memberDTO = new MemberDTO( );
				memberDTO.setPhonenumber(resultSet.getString("phonenumber"));
				memberDTO.setCompany(resultSet.getString("company"));
				memberDTO.setIdnumber(resultSet.getString("idnumber"));
				memberDTO.setName(resultSet.getString("name"));
				
				
				arrayList.add(memberDTO);
				
			}
			if(resultSet.getRow( ) == 0) {
			
			}
		} catch(Exception e) {
			
		} finally {
			try {
				resultSet.close( );
				preparedStatement.close( );
				connection.close( );
			} catch(SQLException e) {
				e.printStackTrace( );
			}
		}
		return arrayList;
	}
	
	public MemberDTO memberSelect(String name) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		MemberDTO memberDTO = new MemberDTO( );
		try {
			Context context = new Context( );
			DataSource dataSource = context.basicDataSource;
			connection = dataSource.getConnection( );
			String sql = "select phonenumber, company, idnumber from member";
			sql += " where name = ? ";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery( );
			if(resultSet.next( )) {
				
				if(resultSet.getString("name").equals(name)) {
			
					memberDTO.setPhonenumber(resultSet.getString("phonenumber"));
					memberDTO.setCompany(resultSet.getString("company"));
					memberDTO.setIdnumber(resultSet.getString("idnumber"));
					memberDTO.setName(resultSet.getString("name"));
					
				}
			}
		} catch(SQLException e) {
		
		} finally {
			try {
				resultSet.close( );
				preparedStatement.close( );
				connection.close( );
			} catch(SQLException e) {
				e.printStackTrace( );
			}
		}
		return memberDTO;
	}
	public void memberInsert(MemberDTO memberDTO) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Context context = new Context();
			DataSource dataSource = context.basicDataSource;
			connection = dataSource.getConnection();
			String sql = "insert into member(phonenumber, company, idnumber, name)";
			sql += " values (?, ?, ?, ?)";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getPhonenumber());
			preparedStatement.setString(2, memberDTO.getCompany());
			preparedStatement.setString(3, memberDTO.getIdnumber());
			preparedStatement.setString(4, memberDTO.getName());
			int count = preparedStatement.executeUpdate();
			
			if (count > 0) {
				connection.commit();
				
			}else {
				connection.rollback();
				
			}
		
		}catch(SQLException e) {
		
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
	public MemberDTO memberDelete(String name) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// 입력한 아이디를 MemberDTO 클래스의 인스턴스에 저장한다.
		MemberDTO memberDTO = new MemberDTO( );
		memberDTO.setName(name);
		try {
			Context context = new Context( );
			DataSource dataSource = context.basicDataSource;
			connection = dataSource.getConnection( );
			String sql = "delete from member ";
			sql += " where name = ? ";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			int count = preparedStatement.executeUpdate( );
			if(count > 0) {
				connection.commit( );
			} else {
				connection.rollback( );
			}
		} catch(SQLException e) {
		} finally {
			try {
				preparedStatement.close( );
				connection.close( );
			} catch(SQLException e) {
				e.printStackTrace( );
			}
		}
		return memberDTO;
	}
	
	public MemberDTO memberUpdate(MemberDTO memberDTO) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Context context = new Context( );
			DataSource dataSource = context.basicDataSource;
			connection = dataSource.getConnection( );
			String sql = "update member set  phonenumber = ?,company = ?, idnumber =?";
			sql+=" where name=?";
			
		
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getPhonenumber( ));
			preparedStatement.setString(2, memberDTO.getCompany( ));
			preparedStatement.setString(3, memberDTO.getIdnumber( ));
			preparedStatement.setString(4, memberDTO.getName( ));
			int count = preparedStatement.executeUpdate( );
			
			if(count > 0) {
				connection.commit( );
				
			} else {
				connection.rollback( );
				
			}
		} catch(Exception e) {
			

		} finally {
			try {
				preparedStatement.close( );
				connection.close( );
			} catch(SQLException e) {
				e.printStackTrace( );
			}
		}
		return memberDTO;
	}
		public MemberDTO memberNameCheck(String name) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			MemberDTO memberDTO = new MemberDTO( );
			try {
				Context context = new Context( );
				DataSource dataSource = context.basicDataSource;
				connection = dataSource.getConnection( );
				String sql = "select * from member";
				sql += " where name=? ";
				
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, name);
				resultSet = preparedStatement.executeQuery( );
				if(resultSet.next( )) {
					if(resultSet.getString("name").equals(name)) {
						memberDTO.setName(resultSet.getString("name"));
						
					}
				}
			} catch(Exception e) {
				
			} finally {
				try {
					resultSet.close( );
					preparedStatement.close( );
					connection.close( );
				} catch(SQLException e) {
					e.printStackTrace( );
				}
			}
			return memberDTO;
		
		
	}

}
