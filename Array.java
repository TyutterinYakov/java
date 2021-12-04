package starts;
import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String str="h";
		for (int i=0; i<10; i++) {
			str+="1";
			list.add(str);
		}
		list.add(2,"Hello"); //Добавление элемента и сдвиг списка
		System.out.println("Size of list: "+list.size());
		list.remove(1);//Удаление элемента 
		list.set(1,"hey"); //Замена существующего элемента
		System.out.println("Size of list: "+list.size());
		

		list.forEach((String x)->System.out.println("Элемент: "+x+" ")); //Вывод списка
		

	}
}
