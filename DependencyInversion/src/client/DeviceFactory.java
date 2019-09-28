package client;
import process.GeneralManufaturingProcess;
import process.SmartPhoneManufacturingProcess;

public class DeviceFactory {
	public static void main(String args[]) {
		GeneralManufaturingProcess mProcess = new SmartPhoneManufacturingProcess("Huawei phone");
		mProcess.launchProcess();
	}
}
