package com.example.store;

import com.example.pizza.Pizza;
import com.example.pizza.PizzaType;

public abstract class PizzaStore {
	
	public void orderPizza(PizzaType pizzaType) {
		Pizza pizza = createPizza(pizzaType);
		pizza.prepare();
		pizza.cut();
		pizza.box();
	}
	
	public abstract Pizza createPizza(PizzaType pizzaType);
}
