/**
 * For Every Singleton Approach below three things are common:
 * 1.	Private constructor to restrict instantiation of the class from other classes
 * 2.	Private static variable of the same class that is the only instance of the class
 * 3.	Public static method that returns the instance of the class, 
 * 		this is the global access point for outer world to get the instance of the singleton class
 * 
 * Eager Initialization Points:
 * 1.	In eager initialization, the instance of Singleton Class is created at the time of class loading.
 * 2.	It has a drawback that instance is created even though client application might not be using it.
 * 3.	Also, getInstance method doesn’t provide any options for exception handling.
 * 4.	If your singleton class is not using a lot of resources, this is the approach to use.
 */

package com.design.patterns.creational.singleton;

public class EagerInitializedSingleton {
	
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
