package constructor;

public class Main {

	public static void main(String[] args) {
		// constructor = special method that is called when an object is instantiated(created) 
		
		Human human = new Human("Jeewantha",23);
		System.out.println(human.name);
		System.out.println(human.age);

	}

}
