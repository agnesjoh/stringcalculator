package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumber() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testManyNumber() {
		assertEquals(27, Calculator.add("1,2,9,3,7,5"));
	}

	@Test
	public void testSeperateByEndl() {
	assertEquals(4, Calculator.add("1,2\n1"));	}

	@Test
	public void testDifferentDelimeter() {
	assertEquals(3, Calculator.add("//;\n1;2"));}

	@Test
	(expected = IllegalArgumentException.class)
	public void testNegativeNumber() {
	assertEquals("Negatives not allowed: -1", Calculator.add("-1,2"));}

	@Test
	(expected = IllegalArgumentException.class)
	public void testManyNegativeNumber() {
	assertEquals("Negatives not allowed: -4,-5", Calculator.add("2,-4,3,-5"));}
}