package chan.spring.web.requestparam;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ArticleDTO {
	private String title;
	private String content;
	private int number;

}
