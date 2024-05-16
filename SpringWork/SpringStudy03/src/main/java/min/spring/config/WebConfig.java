package min.spring.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.Filter;
import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletRegistration;


public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[ ] { ServletConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[ ] { "/" };
	}
	@Override
	protected Filter[ ] getServletFilters( ) {
	CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter( );
	characterEncodingFilter.setEncoding("UTF-8");
	characterEncodingFilter.setForceEncoding(true);
	// PUT 메서드, DELETE 메서드 등의 HTTP 메서드 요청을 할 수 있게 도와준다.
	HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter( );
	return new Filter[ ] { characterEncodingFilter, hiddenHttpMethodFilter };
	}
	// 파일 업로드를 설정하는 메서드를 설정한다.
	@Override	
	protected void customizeRegistration(ServletRegistration.Dynamic dynamic) {
	// 설정된 경로와 0으로 설정되어 있어 업로드된 모든 파일이 디스크에 저장된다.
	MultipartConfigElement multipartConfigElement = new MultipartConfigElement("", 2000000, 4000000, 0);
	dynamic.setMultipartConfig(multipartConfigElement);
	dynamic.setAsyncSupported(true);
	}
	}