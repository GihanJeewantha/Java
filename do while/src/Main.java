
import java.util.Scanner;

public class Main {

	static Scanner Sc = new Scanner(System.in);
	public static void main(String[] args) {
		String name="";
		
		do {
			System.out.println("Enter you name: ");
			name = Sc.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello"+name);
		
	}

}
