package chan.java.context;

import java.sql.Connection;
import java.sql.SQLException;

public class DBTestCall {
	public static void main(String[] args) {
		Connection connection = null;
		Context context = new Context();
		try {
			connection = context.basicDataSource.getConnection();
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
