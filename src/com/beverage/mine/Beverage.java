package com.beverage.mine;

public abstract class Beverage 
{
	public String description = "Unknown desc";
	public String TALL = "small";
	public String GRANDE = "medium";
	public String VENTI = "large";
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract String getSize();
	
	public abstract void setSize(String size);
	
	public abstract double cost();
}
