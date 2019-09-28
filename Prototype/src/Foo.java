import java.io.Serializable;

public class Foo implements Serializable{
	@Override
	public String toString() {
		return "Foo [stuff=" + stuff + ", whatever=" + whatever + "]";
	}
	public int stuff;
	public String whatever;
	public Foo(int stuff, String whatever) {
		this.stuff = stuff;
		this.whatever = whatever;
	}
}
