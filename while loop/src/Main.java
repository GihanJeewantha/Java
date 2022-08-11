
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		String name="" ;
		
		while(name.isBlank()) {
			System.out.println("Enter Your Name: ");
			name = Sc.nextLine();
			
		}
		System.out.println("Hello "+name);
	}

}
