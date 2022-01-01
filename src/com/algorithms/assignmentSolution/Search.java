package com.algorithms.assignmentSolution;

public class Search 
{

	public static int linear(boolean[] r, boolean key )
	{
		int counter = 0;
			for(int j=0; j< r.length ;j++)
			{
				if(r[j] == key)
				{
					++counter;
				}
			}
		return counter;
			
	}
	
	public static double search(double[] stock_price,double key)
	{
			for(int j=0; j< stock_price.length ;j++)
			{
				if(stock_price[j] == key)
				{
					return stock_price[j];
				}
			}
			return 0;
			
	}
}	

