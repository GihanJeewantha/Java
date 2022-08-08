
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter side X : ");
		 x = Sc.nextDouble();
		 
		 System.out.println("Enter side Y :");
		 y = Sc.nextDouble();
		 
		 z =Math.sqrt((x*x) + (y*y));
		 
		 System.out.println("The Hypotenuse is : " +z);
		 
		
	
		 
	}

}
