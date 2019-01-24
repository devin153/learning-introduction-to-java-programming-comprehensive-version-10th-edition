package longclipeus;

public class Main {

	private static final double EPSILON_DOUBLE = 1E-14;
	private static final float EPSILON_FLOAT = 1E-7f;

	public static void main(String[] args) {

		/**
		 * Common Error 5: Equality Test of Two Floating-Point Values
		 * You cannot reliably test equality of two floating-point values. 
		 * However, you can compare whether they are close enough by testing
		 * whether the difference of the two numbers is less than some threshold. 
		 * That is, two numbers x and y are very close if |x−y| < EPSILON for a very 
		 * small value, EPSILON. EPSILON, a Greek letter pronounced epsilon, is commonly 
		 * used to denote a very small value. Normally, you set e to 10^-14 for comparing two
		 * values of the double type and to 10^-7 for comparing two values of the float type.
		 */
		double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		float y = 1.0f - 0.1f - 0.1f - 0.1f - 0.1f - 0.1f;
		
		System.out.println(x == 0.5);
		System.out.println(y == 0.5);

		if (Math.abs(x - 0.5) < EPSILON_DOUBLE)
			System.out.println("x = " + x + " is approximately 0.5");
		if (Math.abs(y - 0.5) < EPSILON_FLOAT)
			System.out.println("y = " + y + " is approximately 0.5");
		
		/**
		 * Common Pitfall 1: Simplifying Boolean Variable Assignment
		 */
		int number = 5;
		boolean even = number % 2 == 0;
		System.out.println(even);
		
	}

}
