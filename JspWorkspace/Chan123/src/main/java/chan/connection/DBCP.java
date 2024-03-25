package chan.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/DBCP")
public class DBCP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Connection connection = null;
Boolean bool = true;
try {
	Context context = new InitialContext();
	DataSource dataSource = (DataSource)context.lookup("java:comp/env/jdbc");
	connection = dataSource.getConnection();
	request.setAttribute("bool", bool);
	RequestDispatcher dispatcher = request.getRequestDispatcher("./jdbc/connection_pool_db.jsp");
	dispatcher.forward(request, response);
} catch (Exception e) {
	// TODO: handle exception
}finally {
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
	}
}
