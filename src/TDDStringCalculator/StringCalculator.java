package TDDStringCalculator;
import java.util.regex.Pattern;

public class StringCalculator {
	public int add(String numbers) {
		
		if(numbers == null || numbers.isEmpty()) {
			return 0;
		}
		
		String delimiter = "[,\n]"; // DEFAULT DELIMITER
		
		if(numbers.startsWith("//")) {
			int endIndex = numbers.indexOf("\n");
			String customDelimiter = numbers.substring(2,endIndex);
			delimiter = Pattern.quote(customDelimiter); //FOR REGEX CHARACTERS
			numbers = numbers.substring(endIndex+1);
		}
		
		String[] tokens = numbers.split(delimiter);
		
		int sum = 0;
		
		for(String token : tokens) {
			int num = Integer.parseInt(token.trim());
			if(num < 0) {
				throw new IllegalArgumentException("Negative numbers are not allowed: " + num);
			}else {
				sum += num;
			}
		}
		
		return sum;
	}
}
