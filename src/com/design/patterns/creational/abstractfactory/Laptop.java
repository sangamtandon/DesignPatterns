/**
 * Sub class Laptop extending Computer super class
 */
package com.design.patterns.creational.abstractfactory;

public class Laptop extends Computer{
	
	private String RAM;
	private String HDD;
	private String CPU;

	public Laptop(String ram, String hdd, String cpu) {
		RAM = ram;
		HDD = hdd;
		CPU = cpu;
	}

	@Override
	public String getRAM() {
		return this.RAM;
	}

	@Override
	public String getHDD() {
		return this.HDD;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}

}
