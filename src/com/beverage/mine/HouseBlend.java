package com.beverage.mine;

public class HouseBlend extends Beverage
{
	public HouseBlend()
	{
		description = "HouseBlend...";
	}
	@Override
	public double cost() 
	{
		return 3.99;
	}
}
