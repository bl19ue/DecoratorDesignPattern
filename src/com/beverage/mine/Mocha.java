package com.beverage.mine;

public class Mocha extends CondimentDecorator
{
	Beverage beverage;
	String size;

	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() 
	{
		return beverage.getDescription() + ", Mocha!";
	}

	@Override
	public double cost() 
	{
		double cost = beverage.cost();
		
		if(getSize().equals(beverage.TALL)) 		{ cost += .10; }
		else if(getSize().equals(beverage.GRANDE))  { cost += .20; }
		else 										{ cost += .30; }
		
		return cost;
	}

	@Override
	public String getSize() {
		return beverage.getSize();
	}

	@Override
	public void setSize(String size) 
	{
		//this.size = size;
	}

}
