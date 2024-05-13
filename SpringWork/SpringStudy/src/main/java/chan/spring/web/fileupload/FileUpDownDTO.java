package chan.spring.web.fileupload;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FileUpDownDTO {
	private String name;
	private String subject;
private MultipartFile file;
}
