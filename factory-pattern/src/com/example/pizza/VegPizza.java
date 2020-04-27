package com.example.pizza;

import com.example.ingredient.PizzaIngredientFactory;

public class VegPizza extends Pizza {
	
	private PizzaIngredientFactory pizzaIngredientFactory;
	
	public VegPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		pizzaIngredientFactory.createDough();
		pizzaIngredientFactory.createSauce();
		System.out.println("Preparing Veg Pizza!!!");
	}

}
