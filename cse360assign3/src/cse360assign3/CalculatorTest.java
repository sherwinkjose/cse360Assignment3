package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void totalTest() 
	{
		Calculator totalTest = new Calculator();
		int total = totalTest.getTotal();
		assertEquals(0, total);
		
	}
	
	@Test
	public void addTest() 
	{
		Calculator addTest = new Calculator();
		fail("Not yet implemented");
		
	}
	
	@Test
	public void subrtractTest() 
	{
		Calculator subTest = new Calculator();
		fail("Not yet implemented");

		
	}
	
	@Test
	public void multiplyTest() 
	{
		Calculator mulTest = new Calculator();
		fail("Not yet implemented");

		
	}
	
	@Test
	public void divideTest() 
	{
		Calculator divTest = new Calculator();
		fail("Not yet implemented");

	}
	
	@Test
	public void historyTest() 
	{
		Calculator historyTest = new Calculator();
		fail("Not yet implemented");

		
	}
	
	@Test
	public void testCalculator() 
	{
		Calculator calcTest = new Calculator();
		assertNotNull(calcTest);
		
	}

}
