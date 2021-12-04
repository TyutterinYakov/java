import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		
		try {
	
		int temp = (int) (Math.random()*100);
		Scanner scanner = new Scanner(System.in);
		
		for (int i=1; i<100000; i++) {
			System.out.println("Введите число в промежутке [0;99]! Для выхода введите любую букву!");
			int rand = scanner.nextInt();
			if(rand==temp) {
				System.out.println("You won on "+i+" try");
				System.out.println("Lucky % = "+(100-i));
				break;
			} else if (temp<rand) {
				System.out.println("Число слишком большое!");
			} else if (temp>rand) {
				System.out.println("Число слишком маленькое");
							
			}
		}
		} catch(java.util.InputMismatchException e) {

			System.out.println("Спасибо за игру!");
			
		}
		
	}

}
