package com.example.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	
	@Override
	public Dough createDough() {
		System.out.println("Creating ThickCrustDough");
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		System.out.println("Creating MarinaraSauce");
		return new MarinaraSauce();
	}
	
}
