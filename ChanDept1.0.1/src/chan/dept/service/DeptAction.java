package chan.dept.service;

import java.util.ArrayList;
import java.util.Scanner;

import chan.dept.dto.DeptDTO;

public interface DeptAction {
	ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>();
	
	public DeptDTO execute(Scanner scanner);

}
