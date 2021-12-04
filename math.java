
import java.util.Scanner;
public class math {
	public static void main(String[] args) {
	double x;
	double y;
	double z;
	
	
	
	try {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		scanner.close();
		z = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		
		System.out.println("Hypotenuse = "+z);
		
	} catch(java.util.InputMismatchException e) {
		System.out.println("Enter the number!!!");
	}
	
	 
	}
	
}
