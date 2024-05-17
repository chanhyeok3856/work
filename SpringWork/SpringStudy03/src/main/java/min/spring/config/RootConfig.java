package min.spring.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
//특정 패키지를 스캔하며 컴포넌트, 서비스, 리포지토리 등을 자동으로 찾아 스프링 빈으로 등록한다.
@ComponentScan(basePackages = { "min.spring.dept" })
//선언적 트랜잭션 관리를 활성화하여 @Transactional 어노테이션 사용을 가능하게 하며 스프링이 트랜잭션 관리를 자동으로 처리하도록 한다.
@EnableTransactionManagement
public class RootConfig {
//데이터 소스 빈을 생성하고 이 메서드는 데이터베이스 연결 풀을 설정하는 HikariCP 라이브러리를 사용한다.
@Bean
public DataSource dataSource( ) {
//HikariConfig 클래스의 객체를 생성한다.
HikariConfig hikariConfig = new HikariConfig( );
//데이터베이스 드라이버 클래스를 설정한다.
hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
//데이터베이스 접속 URL을 설정한다.
hikariConfig.setJdbcUrl("jdbc:log4jdbc:oracle:thin:@127.0.0.1:1521:xe");
//데이터베이스 접속을 위한 사용자 이름을 설정한다.
hikariConfig.setUsername("scott");
//데이터베이스 접속을 위한 비밀번호를 설정한다.
hikariConfig.setPassword("tiger");
//설정된 HikariConfig 객체를 사용하여 HikariDataSource 객체를 생성하고 설정된 파라미터를 기반으로 데이터베이스 연결을 풀링한다.
return new HikariDataSource(hikariConfig);
}
@Bean
public SqlSessionFactoryBean sqlSessionFactoryBean( ) {
SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean( );
sqlSessionFactoryBean.setDataSource(dataSource( ));
sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("configuration/config.xml"));
sqlSessionFactoryBean.setMapperLocations(new ClassPathResource("mapper/mapper.xml"));
return sqlSessionFactoryBean;
}
// 마이바티스의 SqlSessionTemplate 빈을 생성하고 이 템플릿은 SQL 세션의 실행을 단순화하고 스프링 트랜잭션 설정과 통합한다.
@Bean
public SqlSessionTemplate sqlSessionTemplate( ) throws Exception {
// SqlSessionFactoryBean에서 SqlSessionFactory 객체를 가져와 SqlSessionTemplate를 생성한다.
return new SqlSessionTemplate(sqlSessionFactoryBean( ).getObject( ));
}
// 데이터 소스 트랜잭션 관리자를 생성하고 이 관리자는 JDBC 트랜잭션을 처리한다.
@Bean
public DataSourceTransactionManager transactionManager(DataSource dataSource) {
DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager( );
// 트랜잭션 관리에 사용할 데이터 소스를 설정한다.
dataSourceTransactionManager.setDataSource(dataSource);
// 구성된 트랜잭션 관리자를 반환한다.
return dataSourceTransactionManager;
}
}