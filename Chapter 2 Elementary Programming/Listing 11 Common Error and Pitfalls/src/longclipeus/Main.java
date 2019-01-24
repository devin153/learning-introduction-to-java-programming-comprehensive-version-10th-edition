package longclipeus;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Common Error 2: Integer Overflow
		 */
		
		int value = 2147483647 + 1;
		System.out.println(value);	// value will actually be -2147483648
		value = -2147483648 - 1;
		System.out.println(value);	// value will actually be 2147483647
		
		/**
		 * Common Error 3: Round-off Errors
		 * Note: Integers are stored precisely. Therefore, calculations with integers yield a precise integer result.
		 */
		
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);	// displays 0.5000000000000001, not 0.5
		System.out.println(1.0 - 0.9);							// displays 0.09999999999999998, not 0.1
		
		/**
		 * Common Error 4: Unintended Integer Division
		 */
		int number1 = 1;
		int number2 = 2;
		double average = (number1 + number2) / 2;
		System.out.println(average);
		average = (number1 + number2) / 2.0;
		System.out.println(average);

	}

}
