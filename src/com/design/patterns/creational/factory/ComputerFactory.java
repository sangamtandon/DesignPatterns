/**
 * Factory class:
 * We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
 * Based on the input parameter, different subclass is created and returned. 
 * createComputer is the factory method.
 */
package com.design.patterns.creational.factory;

public class ComputerFactory {

	public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

		Computer comp = null;
		switch (type) {
		case PC:
			comp = new PC(ram, hdd, cpu);
			break;
		case SERVER:
			comp = new Server(ram, hdd, cpu);
		}
		return comp;
	}

}
