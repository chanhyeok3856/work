package chan.servlet.tld;

import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport{

	public int doStartTag() {
	try {
	PageContext.getOut().println("커스텀 태그 생성");
	}catch(Exception e) {
		e.printStackTrace();
	}
	return SKIP_BODY;
}
}