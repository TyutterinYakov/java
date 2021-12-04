package starts;

public class yan {

	public static void main(String[] args) {
		int[] mass = {1,3,2,4,1,3,4,5,7,9,8,7,24,9,8,2,11,23,44,17,123,123,12,18,16,13,12,13,15,44,16,18,17,15,11,5,23,21};
		for(int i=0; i<mass.length; i++) {
			for(int j=0; j<mass.length; j++) {
				if((mass[i]==mass[j])&&(i!=j)) {
					break;
				} else if(j==mass.length-1) {
					System.out.println("Число "+mass[i]);
				}
			}
		}
	}
}

