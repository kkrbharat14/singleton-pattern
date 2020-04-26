package com.pattern.concretedecorator;

import com.pattern.component.Beverage;
import com.pattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
		
	public String getDescription() {
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
