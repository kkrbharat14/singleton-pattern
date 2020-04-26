package com.pattern.concretecomponent;

import com.pattern.component.Beverage;

public class Cappuccino extends Beverage {
	private String description = "Cappuccino";
	
	public String getDescription() {
		return description;
	}

	@Override
	public double cost() {
		return 2.00;
	}
}
