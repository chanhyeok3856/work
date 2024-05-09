package chan.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {

		@GetMapping("/paramA")
		public String hello() {
		return "./hello/hellogo";
		
	}
	
	//get 메서드의 구체화 작업
	@GetMapping("/param")
	//@RequestMapping("/hello")
	//임의 모델 객체 생성한다.
	// -----?id=값  집어넣을 수 있는 구조가 된다.
	public String hello(@RequestParam("id") String id, @RequestParam("pass")int pass, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pass", pass);
		return "./hello/hello";
		//  [./ 쓰는 이유 == forward , 자기자신]		
	} 
}
