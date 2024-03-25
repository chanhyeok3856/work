package chan.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ConnectDB")
public class ConnectDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	Connection connection = null;
	Boolean bool = true;
	try {	
		Class.forName(driver);
		connection = DriverManager.getConnection(url, userid, passwd);
		request.getSession().setAttribute("bool", bool);
		response.sendRedirect("./jdbc/connection_db.jsp");
		
	} catch (SQLException e) {
		
	}catch(ClassNotFoundException e) {
		
	}
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}

}
