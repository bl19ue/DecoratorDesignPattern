package com.beverage.mine;

public class Espresso extends Beverage
{
	String size;
	public Espresso()
	{
		description = "Wow! Espresso!";
	}
	@Override
	public double cost() 
	{
		return 1.99;
	}
	@Override
	public String getSize() 
	{
		return size;
	}
	@Override
	public void setSize(String size) 
	{
		this.size = size;
	}
	
}
