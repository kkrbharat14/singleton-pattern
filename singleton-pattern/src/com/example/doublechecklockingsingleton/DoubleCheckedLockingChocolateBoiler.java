package com.example.doublechecklockingsingleton;

public class DoubleCheckedLockingChocolateBoiler {
	private static boolean empty;
	private static boolean boiled;
	private static volatile DoubleCheckedLockingChocolateBoiler uniqueInstance;
	
	private DoubleCheckedLockingChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static DoubleCheckedLockingChocolateBoiler getInstance() {
		if(uniqueInstance==null) {
			synchronized(DoubleCheckedLockingChocolateBoiler.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new DoubleCheckedLockingChocolateBoiler();
				}
			}
		}
		return uniqueInstance;
	}
	
	public static void fill() {
		if(isEmpty()) {
			System.out.println("Filling !!!");
			empty = false;
		}
	}
	
	public static void drain() {
		if(!isEmpty() && isBoiled()) {
			System.out.println("Draining !!!");
			empty = true;
		}
	}
	
	public static void boil() {
		if(!isEmpty() && !isBoiled()) {
			System.out.println("Boiling");
			boiled = true;
		}
	}

	public static boolean isEmpty() {
		return empty;
	}

	public static boolean isBoiled() {
		return boiled;
	}
}
