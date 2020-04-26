package com.pattern.concretecomponent;

import com.pattern.component.Beverage;

public class Espresso extends Beverage {
	private String description = "Espresso";
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public double cost() {
		return 3.00;
	}
}
