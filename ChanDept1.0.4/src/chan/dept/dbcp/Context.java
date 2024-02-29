package chan.dept.dbcp;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import chan.dept.dbcp.Context;
public class Context {
	public BasicDataSource basicDataSource;
	//클래스로 접근할 때 데이터를 제일 처음 저장하는 역할인 초기화 작업을 한다. 
	public Context( ) {
	// 커넥션 풀 정보를 저장하는 인스턴스 변수를 초기화한다. 
		basicDataSource = new BasicDataSource( );
	//JDBC 드라이버 클래스 이름을 설정하여 연결한다. 
		basicDataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	//JDBC 드라이버를 사용하여 접속할 URL을 설정한다. 
		basicDataSource.setUrl("jdbc:oracle:thin:@192.168.0.59:1521:xe");
	// 접속할 scott 계정 설정한다. 
		basicDataSource.setUsername("scott");
	// 접속할 scott 계정의 tiger 비밀번호를 설정한다. 
		basicDataSource.setPassword("tiger");
	// 커넥션 풀의 초기 크기를 4개의 커넥션으로 설정한다. 
		basicDataSource.setInitialSize(4);
	// 커넥션 풀에서 대기 상태로 유지할 수 있는 최대 1000개의 커넥션을 설정한다. 
		basicDataSource.setMaxIdle(1000);
	// 커넥션 풀에서 대기 상태로 유지할 수 있는 최소 5개의 커넥션을 설정한다. 
		basicDataSource.setMinIdle(5);
	}
	}
