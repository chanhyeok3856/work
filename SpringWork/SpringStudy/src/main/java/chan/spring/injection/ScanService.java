package chan.spring.injection;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
@Service
@Setter
@Getter
public class ScanService {
	private ScanDTO scanDTO;
}
