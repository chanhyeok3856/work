package chan.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class Chanfilter implements Filter {
	FilterConfig config;
public void init(FilterConfig fConfig) throws ServletException {
		this.config = fConfig;
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
request.setCharacterEncoding(config.getInitParameter("encoding"));
chain.doFilter(request, response);

	}


	public void destroy() {
		
	}

	

}
