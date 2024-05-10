package chan.spring.dept.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import chan.spring.dept.dto.DeptDTO;
import chan.spring.dept.service.DeptServiceImp;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class DeptController {


private static final Logger logger = LoggerFactory.getLogger(DeptController.class);
@Autowired
private final DeptServiceImp deptServiceImpl;
@GetMapping("/DeptSelect")
public String list(Model model) {
	model.addAttribute("list", deptServiceImpl.deptSelectAll());
	logger.info("list", model);
	return "./dept/dept_select_view";
}
@GetMapping("/DeptSelectDetail")
public String detail(Model model, DeptDTO deptDTO) {
	model.addAttribute("deptDTO", deptServiceImpl.deptSelect(deptDTO.getDeptno()));
	return "./dept/dept_select_detail_view";
}
@GetMapping("/DeptInsert")
public String insert() {
	return "./dept/dept_insert";
}
@PostMapping("/DeptInsert")
public String insert(Model model, DeptDTO deptDTO) {
	model.addAttribute("list", deptServiceImpl.deptSelectAll());
	deptServiceImpl.deptInsert(deptDTO);
	return "./dept/dept_insert_view";
}
@GetMapping("/DeptUpdate")
public String update(Model model, DeptDTO deptDTO) {
	model.addAttribute("deptDTO", deptServiceImpl.deptSelect(deptDTO.getDeptno( )));
	return "./dept/dept_update";
}
@PostMapping("/DeptUpdate")
public String update(DeptDTO deptDTO) {
deptServiceImpl.deptUpdate(deptDTO);
return "./dept/dept_update_view";
}
@GetMapping("/DeptDelete")
public String delete( ) {
return "./dept/dept_delete";
}

@PostMapping("/DeptDelete")
public String delete(DeptDTO deptDTO) {
deptServiceImpl.deptDelete(deptDTO.getDeptno( ));
return "./dept/dept_delete_view";
}
}