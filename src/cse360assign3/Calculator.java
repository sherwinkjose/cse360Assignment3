/*
 * Sherwin Jose
 * PIN: 415
 * Description: Calculator that can add, subtract, multiply, divide, and get the total
*/

package cse360assign3;

public class Calculator {

	private int total; 
	private String store;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		store = "0";
	}
	
	public int getTotal () // calculates the total 
	{ 
		return total;
	}
	
	public int add (int value) // adds the value to the total
	{ 
		store += "+";
		store += value;
		
		total = total + value;
		return total;
		
	}
	
	public int subtract (int value) // subtracts the value from the total
	{ 
		
		store += "-";
		store += value;
		
		total = total - value;
		return total;
	}
	
	public int multiply (int value) // multiplies the value to the total
	{
		store += "*";
		store += value;
		
		total = total * total * value;
		return total;
	}
	
	public int divide (int value) // divides the value from the total 
	{ 
		if (value == 0)
		{
			return 0;
		}else
		{
			store += "/";
			store += value;
			
			total = total / value;
			return total;
		}
		
	}
	
	public String getHistory () // gets the history of the calculations
	{
		return store;	
	}
	
}