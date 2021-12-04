package starts;

public class prime_number {
	public static void main(String[] args) {
		
		for(int i=2; i<=100; i++) {
			boolean controller = true;
			for(int j=2; j<i; j++ ) {
				if(i%j==0) {
					controller = false;
					break;
				}
			}
			if(controller) {
				System.out.println(i);
			}
		}
		
	}
}
