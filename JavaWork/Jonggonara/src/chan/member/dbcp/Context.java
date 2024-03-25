package chan.member.dbcp;

import org.apache.commons.dbcp2.BasicDataSource;

public class Context {
	public BasicDataSource basicDataSource;
	public Context() {
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		basicDataSource.setUsername("scott");
		basicDataSource.setPassword("tiger");
		basicDataSource.setInitialSize(4);
		basicDataSource.setMaxIdle(1000);
		basicDataSource.setMinIdle(15);
	}

}
