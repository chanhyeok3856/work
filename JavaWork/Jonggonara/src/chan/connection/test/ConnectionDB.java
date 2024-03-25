package chan.connection.test;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import chan.member.dbcp.Context;


public class ConnectionDB {
	private static Log log = LogFactory.getLog(ConnectionDB.class);

	public static void main(String[ ] args) {
		Connection connection = null;
		try {
			Context context = new Context( );
                // 데이터베이스와 연결하고 인스턴스에 할당한다.
			DataSource dataSource = context.basicDataSource;
                 // 커넥션 인스턴스를 생성하고 연결한다.
			connection = dataSource.getConnection( );
			log.info("데이터베이스 연결 - " + connection);
		} catch(SQLException e) {
			log.info("데이터베이스 연결 실패 - " + e);
		} finally {
			try {
                 // 자원을 해제한다.
				connection.close( );
			} catch(SQLException e) {
				e.printStackTrace( );
			}
		}
	}
}