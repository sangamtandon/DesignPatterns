package com.design.patterns.creational.abstractfactory;

public class ComputerClient {
	
	public static void main(String[] args) {

		Computer pc = ComputerFactory.createComputer(new PCFactory("8GB", "512GB", "2.4 Ghz"));
		
		Computer server = ComputerFactory.createComputer(new ServerFactory("32GB", "1TB", "3.2 Ghz"));
		
		Computer laptop = ComputerFactory.createComputer(new LaptopFactory("4GB", "256GB", "2.4 Ghz"));
		
		System.out.println("PC: " + pc);
		System.out.println("Server: " + server);
		System.out.println("Laptop: " + laptop);
	}
	
}
