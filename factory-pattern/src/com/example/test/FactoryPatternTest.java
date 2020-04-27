package com.example.test;

import com.example.pizza.PizzaType;
import com.example.store.ChicagoPizzaStore;
import com.example.store.NYPizzaStore;
import com.example.store.PizzaStore;

public class FactoryPatternTest {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		pizzaStore.orderPizza(PizzaType.CHEESE_PIZZA);
		
		PizzaStore pizzaStore2 = new NYPizzaStore();
		pizzaStore2.orderPizza(PizzaType.VEG_PIZZA);
	}
}
