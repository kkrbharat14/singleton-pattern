package com.example.store;

import com.example.ingredient.NYPizzaIngredientFactory;
import com.example.ingredient.PizzaIngredientFactory;
import com.example.pizza.CheesePizza;
import com.example.pizza.Pizza;
import com.example.pizza.PizzaType;
import com.example.pizza.VegPizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(PizzaType pizzaType) {
		Pizza pizza;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		if(pizzaType.equals(PizzaType.VEG_PIZZA)) {
			pizza = new VegPizza(pizzaIngredientFactory);
			pizza.setName("New York Veg Pizza");
		}else {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Cheese Pizza");
		}
		
		return pizza;
	}

}
