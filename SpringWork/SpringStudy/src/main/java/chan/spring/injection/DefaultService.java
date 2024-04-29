package chan.spring.injection;

public class DefaultService {
	private Default default1;

	public Default getDefault1() {
		return default1;
	}

	public void setDefault1(Default default1) {
		this.default1 = default1;
	}

	public DefaultService(Default default1) {
		super();
		this.default1 = default1;
	}
	
	

}
