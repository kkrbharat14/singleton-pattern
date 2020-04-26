package com.pattern.component;

public abstract class Beverage {
	private String description = "Unknown Description";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
