package com.example;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public void fill() {
		if(isEmpty()) {
			System.out.println("Filling !!!");
			this.empty = false;
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			System.out.println("Draining !!!");
			this.empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			System.out.println("Boiling");
			this.boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
