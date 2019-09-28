package process;

public class SmartPhoneManufacturingProcess extends GeneralManufaturingProcess {

	public SmartPhoneManufacturingProcess(String processName) {
		super(processName);
	}

	@Override
	protected void assembleDevice() {
		System.out.println("assemble phone");
	}

	@Override
	protected void testDevice() {
		System.out.println("test phone");
	}

	@Override
	protected void packageDevice() {
		System.out.println("package phone");
	}

	@Override
	protected void storeDevice() {
		System.out.println("store phone");
	}

}
