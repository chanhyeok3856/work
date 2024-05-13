package chan.spring.web.fileupload.thumbnail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import chan.spring.web.fileupload.FileUpDownDTO;
import net.coobird.thumbnailator.Thumbnailator;

@Component
public class ImageThumbnaillatorService {
	

	private static final Logger logger = LoggerFactory.getLogger(ImageThumbnaillatorService.class);
public String processImage(FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {
	
	MultipartFile multipartFile = fileUpDownDTO.getFile();
	if (multipartFile.isEmpty()) {
		return "redirect:/thumbnail";
	}
	Long datetime = System.currentTimeMillis();
	String fileName = datetime + "_" + fileUpDownDTO.getFile().getOriginalFilename();
	String savePath = multipartHttpServletRequest.getSession().getServletContext().getRealPath("./resources/img");
	String filePath = savePath + "\\" + fileName;
	File file = new File(filePath);
	FileCopyUtils.copy(multipartFile.getBytes(), file);
	FileOutputStream fileOutputStream = new FileOutputStream(new File(savePath, "sm_"+fileName));
	logger.info(savePath);
	Thumbnailator.createThumbnail(multipartFile.getInputStream(),fileOutputStream, 100, 100);
	multipartFile.transferTo(file);
	fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+","%20");
	return fileName;
	
}

}
