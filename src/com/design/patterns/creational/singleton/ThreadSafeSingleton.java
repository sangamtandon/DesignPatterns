package com.design.patterns.creational.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	/**
	 * The global access method is synchronized, so only one thread could access it at a time.
	 * This provides thread-safety but it reduces the performance because of the cost associated 
	 * with the synchronized method.
	 */
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	/**
	 * To avoid the extra overhead of synchronization every time, double checked locking principle is used.
	 * In this approach, the synchronized block is used inside the if condition with an additional check,
	 * to ensure that only one instance of a singleton class is created.
	 * @return
	 */
	public static ThreadSafeSingleton getInstanceUsingDoubleCheckedLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
