package com.pattern.test;

import com.pattern.component.Beverage;
import com.pattern.concretecomponent.Cappuccino;
import com.pattern.concretecomponent.Espresso;
import com.pattern.concretedecorator.Mocha;
import com.pattern.concretedecorator.Whip;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		// Customer Orders Cappuccino with Double Whip
		Beverage beverage = new Cappuccino();
		beverage = new Whip(beverage);
		beverage = new Whip(beverage);
		
		System.out.println("Description:"+beverage.getDescription());
		System.out.println("Cost:"+beverage.cost());
		
		// Customer Orders Espresso with Mocha and Whip
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println("Description:"+beverage2.getDescription());
		System.out.println("Cost:"+beverage2.cost());
	}
}
