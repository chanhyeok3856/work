package chan.spring.web.fileupload.thumbnail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import chan.spring.web.fileupload.FileUpDownDTO;

@Controller
public class ImageThumbnailController {


private static final Logger logger = LoggerFactory.getLogger(ImageThumbnailController.class);
private final ImageThumbnaillatorService imageThumbnaillatorService;
//하나의 컨트롤러 안에서 다수의 서비스 사용, @Autowired 어노테이션 생략가능
public ImageThumbnailController(ImageThumbnaillatorService imageThumbnaillatorService) {
	this.imageThumbnaillatorService = imageThumbnaillatorService;
}
@GetMapping("/thumbnail")
public String form() {
	logger.info("컨트롤러 확인");
	return "./thumbnail/image_thumbnail";
}
@PostMapping("/thumbnail")
public String upload(Model model, FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {
	String fileName = imageThumbnaillatorService.processImage(fileUpDownDTO, multipartHttpServletRequest);
	model.addAttribute("fileName",fileName);
	return "./thumbnail/image_thumbnail_download";
}
@GetMapping("/thumbnailator")
public String formA() {
	return "./thumbnail/image_thumbnail_download";
}
@PostMapping("/thumbnailator")
public String uploadB(Model model, FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {
	String fileName = imageThumbnaillatorService.processImage(fileUpDownDTO, multipartHttpServletRequest);
	logger.info(fileName);
	model.addAttribute("fileName", fileName);
	return "./thumbnail/image_thumbnail_download";
}
}
