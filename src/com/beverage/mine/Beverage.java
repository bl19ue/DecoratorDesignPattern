package com.beverage.mine;

public abstract class Beverage 
{
	public String description = "Unknown desc";
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract double cost();
}
