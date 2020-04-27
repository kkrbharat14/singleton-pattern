package com.example.ingredient;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		System.out.println("Creating ThinCrustDough");
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		System.out.println("Creating BruschettaSauce");
		return new BruschettaSauce();
	}
	
}
