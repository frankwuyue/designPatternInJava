package vehicles;

import parts.Engine;

public class Vehicles {

	private Engine engine;
	
	public Vehicles(Engine engine) {
		this.engine = engine;
	}
	
	public void crankIgnition() {
		engine.startEngine();
		System.out.println("Vehicle is runnning.");
	}
}
