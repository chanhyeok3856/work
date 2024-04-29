package chan.spring.injection;

public class FieldConstructor {
private String name;

public FieldConstructor(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "FiledConstructor [name=" + name + "]";
}

}
