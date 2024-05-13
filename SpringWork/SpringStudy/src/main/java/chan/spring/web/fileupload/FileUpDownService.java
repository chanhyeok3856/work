package chan.spring.web.fileupload;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

@Component
public class FileUpDownService {
private static final Logger logger = LoggerFactory.getLogger(FileUpDownService.class);
public String uploadFile(Model model, FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception, IOException {
	String name = fileUpDownDTO.getName();
	String subject = fileUpDownDTO.getSubject();
	//웹 클라이언트 파일 시스템에 있는 원래 파일 이름 반환.
	String realFileName = fileUpDownDTO.getFile().getOriginalFilename();
	//파라미터 이름을 키로, 파라미터에 해당하는 파일 정보를 값으로 하는 Map 가져옴.
	Map<String, MultipartFile> map = multipartHttpServletRequest.getFileMap();
	//맵 요소로 반복하는 동안만 유효, 맵 요소의 키와 값을 set 인터페이스로 반복해 호출.
	Iterator<Map.Entry<String, MultipartFile>> iterator = map.entrySet().iterator();
	MultipartFile multipartFile = fileUpDownDTO.getFile();
	if (multipartFile.isEmpty()) {
		return "redirect:/upload";
	}
	String fileName = multipartFile.getOriginalFilename();
	String savePath = multipartHttpServletRequest.getSession().getServletContext().getRealPath("./resources/upload");
	String filePath = savePath + "\\";
	String saveFileName = "";
	String saveFilePath = "";
	while (iterator.hasNext()) {
		Map.Entry<String, MultipartFile> entry = iterator.next();
		multipartFile = entry.getValue();
		String extensionExclude = fileName.substring(0, fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf(".")+1);
		saveFilePath = filePath + File.separator + fileName;
		File saveFile = new File(saveFilePath);
		if (saveFile.isFile()) {
			boolean fileExist = true;
			int index = 0;
			while (fileExist) {
				index++;
				saveFileName = extensionExclude + index + "." + extension;
				String dictFile = filePath + File.separator + saveFileName;
				fileExist = new File(dictFile).isFile();
				if (!fileExist) {
					saveFilePath = dictFile;
				}
			}
			multipartFile.transferTo(new File(saveFilePath));
			model.addAttribute("name", name);
			model.addAttribute("subject", subject);
			model.addAttribute("realFileName", realFileName);
			model.addAttribute("fileName", saveFileName);
			return "./fileupdown/uploadview";
			
		}else {
			multipartFile.transferTo(saveFile);
			model.addAttribute("name", name);
			model.addAttribute("subject", subject);
			model.addAttribute("realFileName", realFileName);
			model.addAttribute("fileName", saveFileName);
			return "./fileupdown/uploadview";
		}
	}
	return saveFilePath;
	
}
public String downloadFile(String fileName, HttpServletResponse response) throws Exception {
	fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
	System.out.println("파일 이름" + fileName);
	logger.info("데이터 확인 -" +fileName);
	response.setContentType("application/octet-stream");
	return "redirect:/resources/upload/" +fileName;
}
}
