import java.io.Serializable;

public class Person implements Serializable{
	private String name="simple";
	private Tool tool=new Tool();
	public String getName() {
		return this.name;
	}

}
