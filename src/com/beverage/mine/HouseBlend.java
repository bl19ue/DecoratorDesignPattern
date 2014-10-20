package com.beverage.mine;

public class HouseBlend extends Beverage
{
	String size;
	public HouseBlend()
	{
		description = "HouseBlend...";
	}
	@Override
	public double cost() 
	{
		return 3.99;
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
