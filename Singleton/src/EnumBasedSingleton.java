
public enum EnumBasedSingleton {
	INSTANCE;
	
	private EnumBasedSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private int value;
}
