
public class Main {

	public static void main(String[] args) {
		
		//method = a block of code that executed whenever it is called upon
		
		String name = "Jeewantha Dilshan";
		int age = 23;
		
		hello(name,age);
		hello(name,age);
	

	}
	
	static void hello(String myname, int myage) {
		System.out.println("Hello "+myname);
		System.out.println("your age is"+myage);
	}

}
