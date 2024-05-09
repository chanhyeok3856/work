package chan.spring.web.requestparam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;
@Controller
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {
	@Autowired
private final ArticleService articleService;
	@RequestMapping(method = RequestMethod.GET)
	public String send() {
		return "./articleform";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String send(ArticleDTO articleDTO) {
		articleService.setArticleDTO(articleDTO);
		return "./articleview";
	}
}
