import java.util.*;
public class two_D_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ROWS array: ");
		int rows = scanner.nextInt();
		System.out.println("COLUMNS array: ");
		int columns = scanner.nextInt();
		scanner.close();
		int array[][] = new int[rows][columns];

		for(int i=0; i<rows; i++) {
			System.out.println();
			for(int j=0; j<columns;j++) {
				int a = (int)(Math.random()*100);
				array[i][j]=a;
				System.out.print(a+"\t");
			}
		}
		
//		System.out.println("\n\n\n");
	//	for(int i=0; i<rows; i++) {
	//		System.out.println();
	//		for(int j=0; j<columns;j++) {
			//	int a = (int)(Math.random()*100);
			//	array[i][j]=a;
	//			System.out.print(array[i][j]+"\t");
	//		}
	//	}
	}

}
