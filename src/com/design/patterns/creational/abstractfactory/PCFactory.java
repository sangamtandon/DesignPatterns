/**
 * A Factory class to create instances of PC type
 */
package com.design.patterns.creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {
	
	private String RAM;
	private String HDD;
	private String CPU;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(this.RAM, this.HDD, this.CPU);
	}

}
