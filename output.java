package starts;
import java.util.Scanner;

public class output {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Hello, whats is you name?");
			String name = scanner.nextLine();
			System.out.println(name+", how old are you?");
			int years = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Whats is favorite food?");
			String food = scanner.nextLine();
			System.out.println("Your name "+name+". Your are old "+years+". You like "+food);
			
		}
}
