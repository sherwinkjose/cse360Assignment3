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
		int add = addTest.add(5);
		assertEquals(5, add);
		
	}
	
	@Test
	public void subrtractTest() 
	{
		Calculator subTest = new Calculator();
		int sub = subTest.subtract(5);
		assertEquals(-5, sub);
		
	}
	
	@Test
	public void multiplyTest() 
	{
		Calculator mulTest = new Calculator();
		int mul = mulTest.multiply(5);
		assertEquals(0, mul);
		
	}
	
	@Test
	public void divideTest() 
	{
		Calculator divTest = new Calculator();
		int div = divTest.divide(5);
		assertEquals(0, div);
		
	}
	
	@Test
	public void historyTest() 
	{
		Calculator historyTest = new Calculator();
		String getHis = historyTest.getHistory();
		assertEquals("", getHis);
		
	}
	
	@Test
	public void testCalculator() 
	{
		Calculator calcTest = new Calculator();
		assertNotNull(calcTest);
		
	}

}
