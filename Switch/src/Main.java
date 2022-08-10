
import java.util.Scanner;

public class Main {
	
	static Scanner Sc = new Scanner(System.in);

	public static void main(String[] args) {
		//switch = statement that allows variable to be tested for equality against a list of values
		
		
		
		System.out.println("Enter Day name: ");
		String day = Sc.nextLine();
		
		switch(day) {
		case "sunday": System.out.println("It is Sunday !");
		break;
		
		case "monday": System.out.println("It is Monday !");
		break;
		
		case "tuesday": System.out.println("It is Tuesday !");
		break;
		
		case "Thursday": System.out.println("It is Thursday !");
		break;
		
		case "Friday": System.out.println("It is friday !");
		break;
		
		case "Saturday": System.out.println("It is Sataurday !");
		break;
		}
		
		

	}

}
