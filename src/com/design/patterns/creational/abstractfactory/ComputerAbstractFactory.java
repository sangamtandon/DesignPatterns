/**
 * Abstract Factory Class could be an abstract class or interface.
 * Notice that createComputer() method is returning an instance of super class Computer. 
 * Now factory classes will implement this interface and return their respective sub-class
 */
package com.design.patterns.creational.abstractfactory;

public interface ComputerAbstractFactory {
	
	public Computer createComputer();

}
