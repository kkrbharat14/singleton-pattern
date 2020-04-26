package com.pattern.decorator;

import com.pattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage  {
	public abstract String getDescription();
}
