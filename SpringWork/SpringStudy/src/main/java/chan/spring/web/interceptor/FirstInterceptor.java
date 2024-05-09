package chan.spring.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstInterceptor implements HandlerInterceptor{
	
	private static final Logger logger = LoggerFactory.getLogger(FirstInterceptor.class);
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
	logger.info("preHandle call.....");
	if (handler instanceof HandlerMethod) {
		HandlerMethod method = (HandlerMethod) handler;
		logger.info("handler method name " + method.getMethod().getName());
		}
	return true;
}
@Override
//throws Exception 안해도 되는 이유는?
public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
	logger.info("postHandle call......");
}
@Override
//throws Exception 안해도 되는 이유는?
public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
	logger.info("afterCompletion call.....");
}
}
