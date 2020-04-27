package com.example.lazyinitsingleton;

public class LIChocolateBoiler {
	private static boolean empty;
	private static boolean boiled;
	private static LIChocolateBoiler uniqueInstance;
	
	private LIChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static LIChocolateBoiler getInstance() {
		if(uniqueInstance==null) {
			uniqueInstance = new LIChocolateBoiler();
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
