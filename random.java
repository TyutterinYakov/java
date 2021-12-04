package starts;

public class random {
	public static void main(String[] args) {
		randoms();
		//hello();
	}
	static void randoms() {
		int results = 0;
		int max=0;
		int min=0;
		int[] mass = new int[100];
		for (int i=0; i<mass.length; i++) {
			Double b = Math.random()*100;
			mass[i]=b.intValue();
			System.out.print(mass[i]+" ");
			results+=mass[i];
			if (i==0) {
				max=mass[i];
				min=mass[i];
			}
			if (max<mass[i]) {
				max=mass[i];
			}
			if (min>mass[i]) {
				min=mass[i];
			}
		}
		System.out.println("");
		System.out.println("С/А: "+results/mass.length);
		System.out.println("MAX "+max);
		System.out.println("MIN "+min);
	}
	static void hello() {
		System.out.println("Привет из рандома!");
	}
}
