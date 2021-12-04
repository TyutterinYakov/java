package starts;
import java.io.*;

public class input {

	public static void main(String[] args) {
		System.out.println("Введите название данной книги");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(isr);
		String input = "";
		try {
			input = buffer.readLine();
			buffer.close();
			System.out.println("Спасибо, что Вы читаете "+input);
		}
		catch(IOException e) {
			System.out.println("Произошла ошибка ввода");
		}
		
	}
}
