package starts;
import java.io.*;

public class Read {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("/Users/asatutterin/Desktop/project/starts/src/starts/info.txt");
			BufferedReader buffer = new BufferedReader(file);
			String line = "";
			
			while(( line = buffer.readLine() )!=null) {
				System.out.println(line);
			}
			buffer.close();
		} catch(IOException e) {
			System.out.println("Произошла ошибка чтения");
		}
	}
}
