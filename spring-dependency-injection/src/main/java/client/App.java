package client;

import parts.LargeEngine;
import vehicles.Vehicles;

public class App {
	public static void main(String args[]) {
		Vehicles vehicles = new Vehicles(new LargeEngine(30));
		vehicles.crankIgnition();
	}
}
