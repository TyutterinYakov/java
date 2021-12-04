package starts;

import java.util.Arrays;

public class mass {
	
		public static void main(String[] args) {
			String[] arr_str = {"H", "B", "C", "A", "M", "E", "Q"};
			int[] arr_int = {1,4,7,2,5,1,7,4,3,2,1,9,8,7,6,4,5,0};
			
			mass_out.out(arr_int.length, arr_int); //Mass out methods
			mass_out.out(arr_str.length, arr_str); //Mass out methods
			
			Arrays.sort(arr_str, 0, arr_str.length); //Sort mass methods String
			Arrays.sort(arr_int, 0, arr_int.length); //Sort mass methods Integer

			
			mass_out.out(arr_int.length, arr_int); //Mass out methods
			mass_out.out(arr_str.length, arr_str); //Mass out methods

			
		}

}
