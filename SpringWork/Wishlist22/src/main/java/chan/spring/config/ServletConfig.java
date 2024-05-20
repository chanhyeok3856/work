package chan.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


import java.util.Properties;


//스프링 설정 클래스 선언해 클래스가 스프링 구성이나 설정 클래스임을 나타냄
@Configuration
//스프링 프레임워크의 웹 MVC설정을 지원한다
@EnableWebMvc
//특정 패키지 스캔해 컴포넌트, 서비스, 리포지토리 등을 자동으로 찾아 스프링 빈으로 등록한다
@ComponentScan(basePackages = { "chan.spring" })
public class ServletConfig implements WebMvcConfigurer{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {
	resourceHandlerRegistry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	resourceHandlerRegistry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
	resourceHandlerRegistry.addResourceHandler("/img/**").addResourceLocations("/resources/img/");
	resourceHandlerRegistry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
	}
@Override
public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {
InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver( );
internalResourceViewResolver.setViewClass(JstlView.class);
internalResourceViewResolver.setPrefix("/WEB-INF/views/");
internalResourceViewResolver.setSuffix(".jsp");
viewResolverRegistry.viewResolver(internalResourceViewResolver);
}

@Bean
public StandardServletMultipartResolver multipartResolver() {
	return new StandardServletMultipartResolver();
}

}