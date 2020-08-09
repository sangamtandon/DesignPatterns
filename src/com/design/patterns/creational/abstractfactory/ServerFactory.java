/**
 * A Factory class to create instances of Server type
 */
package com.design.patterns.creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {
	
	private String RAM;
	private String HDD;
	private String CPU;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(this.RAM, this.HDD, this.CPU);
	}

}
