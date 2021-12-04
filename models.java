package starts;

public class models {
	public static void main (String[] args) {
		sub(15,20);
		
		System.out.println("\n"+sub2(2));
		System.out.println("\n"+sub2("Hello"));
	}
	
	public static void sub(int a, int b) {
		System.out.print("Промежуток чисел от "+a+" до "+b+": ");
		for(; a<=b; a++) {
			System.out.print(a+" ");
		}
	}
	public static String sub2(int ones) {
		return ("Переданное число равно: "+ones);
	}
	public static String sub2(String ones) {
		return ("Переданная строка: "+ones);
	}

}
