package longclipeus;

public class View {
	
	public static void main(String[] args) {
		if (args.length > 0) {
			for (String str : args) {
				System.out.println(str);
			}
		} else {
			System.out.println("Hello");
		}			
	}

}
