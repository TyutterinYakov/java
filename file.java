package starts;
import java.io.*;

public class file {
	public static void main(String[] args) {
		File info =new File("/Users/asatutterin/Desktop/project/starts/src/starts");
		System.out.println(info.exists());
		if (info.exists()) {
		String[] lists = info.list();
		System.out.println("Файлов найдено "+lists);
		for(int i=0; i<lists.length; i++) {
		System.out.println(lists[i]);
		}
		}
	}

}
