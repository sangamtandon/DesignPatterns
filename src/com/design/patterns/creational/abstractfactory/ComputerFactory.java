/**
 * Factory class:
 * 
 * This is Factory of Factories.
 * We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
 * Based on the input parameter, different subclass is created and returned. 
 * createComputer is the factory method.
 */
package com.design.patterns.creational.abstractfactory;

public class ComputerFactory {

	public static Computer createComputer(ComputerAbstractFactory computerAbstractFactory) {
		return computerAbstractFactory.createComputer();
	}

}
