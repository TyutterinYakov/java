package starts;

public class problem {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println("Вы ввели "+num);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Требуется целочисленный элемент");
		} catch(NumberFormatException e) {
			e.getMessage();
		} finally {
			System.out.println("Программа завершилась");
		}
	}
}
