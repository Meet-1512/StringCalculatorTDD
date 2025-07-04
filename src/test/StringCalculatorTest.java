package test;
import TDDStringCalculator.StringCalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; // or org.junit.Test for JUnit 4

public class StringCalculatorTest {
	
	StringCalculator calculator = new StringCalculator();
	
	@Test
	void emptyInputReturnZero() {
		int result = calculator.add("");
		assertEquals(0,result);
	}
	
	@Test
	void singleNumberReturnItsValue() {
		assertEquals(5,calculator.add("5"));
		assertEquals(123,calculator.add("123"));
		assertEquals(12345,calculator.add("12345"));
	}
	
	@Test
	void twoNumbersAreSummed() {
		assertEquals(6,calculator.add("1,5"));
		assertEquals(100,calculator.add("40,60"));
	}
	
	@Test
	void multipleNumbersAreSummed() {
		assertEquals(15,calculator.add("1,2,3,4,5"));
		assertEquals(100,calculator.add("10,20,30,40"));
	}
	
	@Test
	void newLineAsDelimiter() {
		assertEquals(6,calculator.add("1\n2,3"));
		assertEquals(15,calculator.add("5\n5\n5"));
	}
	
	@Test
	void customDelimiter() {
		assertEquals(3,calculator.add("//;\n1;2"));
		assertEquals(3,calculator.add("//.\n1.2"));
		assertEquals(3,calculator.add("//|\n1|2"));
	}
	
	@Test
	void singleNegativeNumberException() {
		IllegalArgumentException ex = assertThrows(
			IllegalArgumentException.class,
			()->calculator.add("4,-7,2")
		);
		assertEquals("Negative numbers are not allowed: -7",ex.getMessage());
	}
	
	@Test
	void multipleNegativeNumberException() {
		IllegalArgumentException ex = assertThrows(
				IllegalArgumentException.class,
				()->calculator.add("-4,-7,2")
		);
		assertEquals("Negative numbers are not allowed: -4, -7",ex.getMessage());
	}
}

