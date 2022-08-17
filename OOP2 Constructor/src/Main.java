
public class Main {

	public static void main(String[] args) {
	
		// constructor = special method that called an object is created

		Human human = new Human("Jeewaantha" , 23 , 62);
		Human human2 = new Human("dilshan" , 25 , 61);
		
		System.out.println(human.name);
		System.out.println(human.age);
		System.out.println(human.weight);
		
		human.drink();
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(human2.name);
		System.out.println(human2.age);
		System.out.println(human2.weight);
		
		human2.eat();
	}

}
