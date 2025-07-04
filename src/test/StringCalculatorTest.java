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
}
