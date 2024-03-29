package process;

public abstract class GeneralManufaturingProcess {
	
	private String processName;
	
	public GeneralManufaturingProcess(String processName) {
		this.processName = processName;
	}
	
	// template method
	public void launchProcess() {
		if (processName != null || !processName.isEmpty()) {
			assembleDevice();
			testDevice();
			packageDevice();
			storeDevice();
		} else {
			System.out.println("the process is not created.");
		}
		
	}
	
	protected abstract void assembleDevice();
	
	protected abstract void testDevice();
	
	protected abstract void packageDevice();
	
	protected abstract void storeDevice();
}
