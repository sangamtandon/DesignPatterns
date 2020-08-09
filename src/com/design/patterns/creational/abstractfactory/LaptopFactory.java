/**
 * A Factory class to create instances of Laptop type
 */
package com.design.patterns.creational.abstractfactory;

public class LaptopFactory implements ComputerAbstractFactory {
	
	private String RAM;
	private String HDD;
	private String CPU;
	
	public LaptopFactory(String ram, String hdd, String cpu) {
		RAM = ram;
		HDD = hdd;
		CPU = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Laptop(this.RAM, this.HDD, this.CPU);
	}

}
