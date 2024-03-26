package chan.test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.jsp.tagext.TagSupport;



public class HelloTag extends TagSupport {
	private static final long serialVersionUID = 1L;
       
  
    public int doStartTag() {
    	try {
			pageContext.getOut().println("커스텀 태그 생성");
		} catch (Exception e) {
			e.printStackTrace();
		}
       return SKIP_BODY;
    }

}
