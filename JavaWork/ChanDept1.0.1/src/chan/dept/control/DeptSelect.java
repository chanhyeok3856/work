package chan.dept.control;

import java.util.Scanner;
import java.util.logging.Logger;

import chan.dept.dto.DeptDTO;
import chan.dept.service.DeptAction;

public class DeptSelect implements DeptAction{
 private static final Logger logger = Logger.getLogger(DeptSelect.class.getName());
	@Override
	public DeptDTO execute(Scanner scanner) {
		logger.info("전체 조회 페이지");
		return null;
	}

}
