package com.example.store;

import com.example.ingredient.ChicagoPizzaIngredientFactory;
import com.example.ingredient.PizzaIngredientFactory;
import com.example.pizza.CheesePizza;
import com.example.pizza.Pizza;
import com.example.pizza.PizzaType;
import com.example.pizza.VegPizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType pizzaType) {
		Pizza pizza;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(pizzaType.equals(PizzaType.VEG_PIZZA)) {
			pizza = new VegPizza(pizzaIngredientFactory);
			pizza.setName("Chicago Veg Pizza");
		}else {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Chicago Cheese Pizza");
		}
		
		return pizza;
	}
	
}
