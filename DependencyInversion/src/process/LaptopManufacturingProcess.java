package process;

public class LaptopManufacturingProcess extends GeneralManufaturingProcess {

	public LaptopManufacturingProcess(String processName) {
		super(processName);
	}

	@Override
	protected void assembleDevice() {
		System.out.println("assemble laptop");
	}

	@Override
	protected void testDevice() {
		System.out.println("test laptop");
	}

	@Override
	protected void packageDevice() {
		System.out.println("package laptop");
	}

	@Override
	protected void storeDevice() {
		System.out.println("store laptop");
	}

}