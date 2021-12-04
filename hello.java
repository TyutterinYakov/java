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
		switch(32) {
		case 2: msg="1"; break;
		case 3: msg="2"; break;
		default: msg="Ничего";
		}
		System.out.println(msg);
		for(int i=0; i<5; i++) {
			for(int y=5; y<10;y++) {
				System.out.print("two");
			}
			System.out.println("\n"+i);
		}
		int z=0;
		while(z<10) {
			z++;
			System.out.print(z+" ");
		}
		System.out.println("\n");
		for(int g=0; g<3; g++) {
			if(g==2) continue;
			System.out.println("g="+g);
		}
		for(int g=0; g<10; g++) {
			if ((g%2==0)&&(g!=0)) {
				System.out.println("Hello = "+g);
			}
		}
		String number = "10";
		int number1 = 20;
		String num = number + number1;
		System.out.println("Строка = "+num);
		System.out.println("Строка - 100 = "+(Integer.parseInt(num)-100));
		
		String[] mas = {"Hello", "My", "Best", "Friends",""};
		int k=0;
		while(k<mas.length) {
			mas[mas.length-1]="GOOD";
			System.out.println(mas[k]+" ");
			k++;
		}
		if (args.length!=0) {
		System.out.print("Переданное из консоли: ");
		for(int h=0; h<args.length; h++) {
		System.out.print(args[h]+" ");
		}
		System.out.println("");
		}
		int[][] arr_lev = new int[2][3];
		for (int q=0; q<2; q++) {
			for(int i=0; i<3; i++) {
				if (q==0) {
			arr_lev[q][i]=1;
				} else {
					arr_lev[q][i]=2;
				}

			System.out.println(arr_lev[q][i]);
			}
		}

		System.out.println("Число ПИ равно "+Math.PI);
		System.out.println("Основание логарифма e равно "+Math.E);
		System.out.println("9 в квадрате = "+Math.pow(9,2));
		System.out.println("9 в кубе = "+Math.pow(9,3));
		System.out.println("9 под корнем = "+Math.sqrt(9));
		
		System.out.println("\n");
		
		System.out.println("round 7,5(по мат) = "+Math.round(7.5));
		System.out.println("ceil 7,3(большая) = "+Math.ceil(7.3));
		System.out.println("floor 7,3(в меньшую) = "+Math.floor(7.3));
		
		System.out.println("Числа 2313123 и 4233244, наибольшее = "+Math.max(4233244, 2313123));
		System.out.println("Числа 24422 и 354345, наименьшее = "+Math.min(24422,354345));
		
		System.out.println("Случайное число равно: "+Math.round(Math.random()*100));
		
		String txt1 = "строка одын";
		String txt2 = "СтрОка дВыА";
		String txt3 = "СтРОКА ОДЫН";
		System.out.println("Сравнение строк 1: "+txt1+". 2: "+txt2+". Ответ: "+txt1.equals(txt2));
		System.out.println("Увеличение: "+txt1+". Строка: "+txt1.toUpperCase());
		System.out.println("Уменьшение: "+txt2+". Строка: "+txt2.toLowerCase());
		
		System.out.println("Сравнение без регистра "+txt1+"-- И -- "+txt3 +" Ответ: "+txt3.toLowerCase().equals(txt1));
		
		String[] books =
			{ "Java in easy steps", "XML in easy steps" ,
			"HTML in easy steps" , "CSS in easy steps" , "Gone With the Wind" , "Drop the Defense" } ;
		
		for (int f=0; f<books.length; f++) {
			if (books[f].startsWith("Java")) {
				System.out.println("В строке номер "+f+" в начале найдено совпадение Java");
			} 
			if (books[f].endsWith("steps")) {
				System.out.println("В строке номер "+f+" в конце найдено совпадение steps");
			}
			System.out.println("Начало строки номер "+f+books[f].substring(0,4)+"... с первого по четвертый");
		}
		System.out.println("Первый символ строки номер 1:'"+books[1].charAt(0)+"'");
		System.out.println("Последний символ строки номер 1: "+books[1].charAt(books[1].length()-1));
	}
}


//Hello, its easy code