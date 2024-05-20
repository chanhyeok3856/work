package min.spring.web.json.jackson.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SendAjaxController {
@GetMapping("/idCheck")
public String idcheck() {
	return "./jackson/id_check";
}
@GetMapping("/idSave")
public String idSave() {
	return "./jackson/id_save";
}
@GetMapping("/idUpdate")
public String idUpdate() {
	return "./jackson/id_update";
}
@GetMapping("/idDelete")
public String idDelete() {
	return "./jackson/id_delete";
}
}
