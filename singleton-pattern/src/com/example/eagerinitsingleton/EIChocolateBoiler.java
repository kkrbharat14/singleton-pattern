package com.example.eagerinitsingleton;

public class EIChocolateBoiler {
	private static boolean empty;
	private static boolean boiled;
	private static EIChocolateBoiler uniqueInstance = new EIChocolateBoiler();
	
	private EIChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static EIChocolateBoiler getInstance() {
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
