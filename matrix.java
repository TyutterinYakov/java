import java.util.Scanner;
public class matrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Columns: ");
		int columns = scanner.nextInt();
		System.out.println("rows: ");
		int rows = scanner.nextInt();
		scanner.close();
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print((int)(Math.random()*100)+" \t");
			}
		}

	}

}
