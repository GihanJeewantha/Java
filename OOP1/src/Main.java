
public class Main {

	public static void main(String[] args) {
	
		// object example = (table , computer , coffee cup)
		// object = contain attributes and methods
		
		car myCar = new car();
		car myCar2 = new car();
		
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.make);
		System.out.println(myCar.price);
		System.out.println(myCar.year);
		
		System.out.println(myCar2.model);
		System.out.println(myCar2.color);
		System.out.println(myCar2.make);
		System.out.println(myCar2.price);
		System.out.println(myCar2.year);
		
		myCar.drive();
		myCar.brake();
		
		myCar2.drive();
		myCar2.brake();
		
		
		
	}

}
