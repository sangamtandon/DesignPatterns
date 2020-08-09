package com.design.patterns.creational.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.createComputer(ComputerType.PC, "8GB", "1TB", "2.4 GHz");
		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "200GB", "1000TB", "3.2 GHz");
		System.out.println("PC Settings: " + pc);
		System.out.println("Server Setting: " + server);
	}
}
