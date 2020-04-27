package com.example.pizza;

import com.example.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
	private PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		pizzaIngredientFactory.createDough();
		pizzaIngredientFactory.createSauce();
		System.out.println("Preparing Cheese Pizza!!!");
	}

}
