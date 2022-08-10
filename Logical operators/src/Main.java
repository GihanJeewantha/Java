
public class Main {

	public static void main(String[] args) {
		
		//Logical operators = use to  connect two or more expression
		
		//    && =(AND)
		//    || =(OR)
		//    != =(NOT)
		
		int temp = 25;
		
		if(temp>30) {
			System.out.println("It is hot outside!");
		}
		
		else if(temp>=20 && temp<=30) {
			System.out.println("it is warm outside!");
		}
		else {
			System.out.println("it is cold outside!");
		}

	}

}
