package longclipeus;

import java.util.Scanner;

public class Main {

	private static final String SIZE = "Storage size ";
	private static final String BYTE = " byte";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(SIZE + "byte\t=\t" + (Byte.SIZE >> 3) + BYTE);
		System.out.println(SIZE + "short\t=\t" + (Short.SIZE >> 3) + BYTE);
		System.out.println(SIZE + "int\t=\t" + (Integer.SIZE >> 3) + BYTE);
		System.out.println(SIZE + "float\t=\t" + (Float.SIZE >> 3) + BYTE);
		System.out.println(SIZE + "long\t=\t" + (Long.SIZE >> 3) + BYTE);
		System.out.println(SIZE + "double\t=\t" + (Double.SIZE >> 3) + BYTE);

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter a byte value: ");
			input.nextByte();
			System.out.print("Enter a short value: ");
			input.nextShort();
			System.out.print("Enter an int value: ");
			input.nextInt();
			System.out.print("Enter a long value: ");
			input.nextLong();
			System.out.print("Enter a float value: ");
			input.nextFloat();
			System.out.print("Enter a double value: ");
			input.nextDouble();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
