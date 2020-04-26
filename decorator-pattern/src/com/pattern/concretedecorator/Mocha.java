package com.pattern.concretedecorator;

import com.pattern.component.Beverage;
import com.pattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+ ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}

}
