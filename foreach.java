
public class foreach {
	
	static String hello() {
		
		
		return "Hello is methods hello";
	}
	
	static int age() {
		return 15;
	}
	
	public static void main(String[] args) {
		
		String[] animals = {"Dog", "Cat", "Rat", "Hamster", "Rabbit"};
		for(String i : animals) {
			System.out.println(i);
		}
		
		System.out.println("\n\n\n"+hello());
		System.out.println("You are old "+age()+" years");
		System.out.println("PI = "+Math.PI);
	}

}
