import java.util.ArrayList;

public class lists {

	public static void main(String[] args) {
		ArrayList<String> drink = new ArrayList();
		drink.add("Coffe");
		drink.add("tea");
		drink.add("colla");
		ArrayList<String> eat = new ArrayList();
		eat.add("potato");
		eat.add("cucumber");
		eat.add("banana");
		ArrayList<ArrayList<String>> all = new ArrayList();
		all.add(drink);
		all.add(eat);
		
		System.out.println(all.get(0));
		
		
		
	}
}
