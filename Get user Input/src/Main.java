import java.util.Scanner; //import Scanner class


public class Main {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in); //create Scanner  object
		
		System.out.println("What is you'r Name : ");
		String name = Sc.nextLine();  // ussing that Scanner
		
		System.out.println("Enter you'r Age :");
		int age = Sc.nextInt();
		
		System.out.println("Enter Your Heigth : ");
		Float height = Sc.nextFloat();
		
		System.out.println("Your name is " + name);
		System.out.println("Your age is : "+ age);
		System.out.println("You'r Height is : "+ height);
		
			

	}

}
