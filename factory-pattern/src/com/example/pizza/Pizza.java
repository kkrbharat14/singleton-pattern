package com.example.pizza;

public abstract class Pizza {
	public String name;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Standard Baking:: 20 Minutes");
	}
	
	public void cut() {
		System.out.println("Standard Cutting:: Diagonal Slices");
	}
	
	public void box() {
		System.out.println("Standard Boxing:: PizzaStoreBox");
	}

	public void setName(String name) {
		this.name = name;
	}

}
