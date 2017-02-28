import static org.junit.Assert.*;

import org.junit.Test;


public class CalcTest {
	
	@Test
	public void testAdd(){
		int a = 5;
		int b = 3;
		assertTrue(Calc.add(a, b) == 8);
		
	}
	
	@Test
	public void testSubtract(){
		int a = 10;
		int b = 3;
		assertTrue(Calc.subtract(a, b) == 7);
		
	}
	
	@Test
	public void testMultiply(){
		int a = 10;
		int b = 4;
		assertTrue(Calc.multiply(a, b) == 40);
		
	}
	
	@Test
	public void testDivide(){
		int a = 23;
		int b = 4;
		assertTrue(Calc.divide(a, b) == 5.75);
		
	}

}
