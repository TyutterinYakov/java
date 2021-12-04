package starts;

public class puzirek {
	public static void main(String[] args) {
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
		
		//Сортировка
		
		for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - i - 1; j++) {
                if (mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
	}
}
