/**
 * Static Block Initialized Points:
 * 1.	Static block initialization implementation is similar to eager initialization.
 * 2.	The instance of class is created in the static block that provides option for exception handling.
 * 3.	Same drawback that instance is created even though client application might not be using it.
 */

package com.design.patterns.creational.singleton;

public class StaticBlockInitializedSingleton {
	
	private static StaticBlockInitializedSingleton instance;
	
	static {
		try {
			instance = new StaticBlockInitializedSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	private StaticBlockInitializedSingleton() {}

	public static StaticBlockInitializedSingleton getInstance() {
		return instance;
	}
}
