package starts;
import java.io.*;

public class Write {
	public static void main(String[] args) {
		try {
		FileWriter file = new FileWriter("/Users/asatutterin/Desktop/project/starts/src/starts/hey.txt"); 
		BufferedWriter buffer = new BufferedWriter(file);
		buffer.write("Дул сильный ветер");
		buffer.newLine();
		buffer.write("Сильно хотелось спать");
		buffer.newLine();
		buffer.write("Я уснул на углу дома");
		buffer.close();
		}
		catch(IOException e){
			System.out.println("Возникли проблемы при чтении/записи файла");
		}
	}
}
