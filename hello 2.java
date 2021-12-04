package starts;

public class hello {
	public static void main(String [] args) {
		String name="Yasha";
		String msg;
		boolean ones=true, twos=true;
		boolean kek = name=="Yasha";
		final int years = 20;
		System.out.println("Hello, my name is "+name +". I old "+years+" years");
		System.out.println(3%2);
		System.out.println(kek);
		if ((ones)&&(twos)) {
			System.out.println("Оба значения true");
		} else if(ones||twos) {
				System.out.println("Одно из значений false");
			} else {
					System.out.println("Оба значения false");
				}
		msg=(ones||twos) ? "Одно true" : "Оба false" ;
		System.out.println(msg);
		float result = years*15/9;
		System.out.println("result = "+"\n"+result);
		System.out.println(ones==true?"Верно":"Неверно");
		boolean variant = true;
		switch(32) {
		case 2: msg="1"; break;
		case 3: msg="2"; break;
		default: msg="Ничего";
		}
		System.out.println(msg);
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
	}
}


//Hello, its easy code