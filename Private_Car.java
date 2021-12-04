package starts;

public class Private_Car {
	private String maker;
	private String color;
	private String bodyType;
	private String peculiarity;
	
	private String run() {
		return peculiarity;
	}
 public void options(String brand, String paint, String body, String last) {
	maker = brand;
	color = paint;
	bodyType = body;
	peculiarity = last;
 }
 public void call() {
	 System.out.println(maker+ " цвет: "+color);
	 System.out.println(maker+ " тип кузова: "+bodyType);
	 System.out.println(maker+ " Свойство: "+run());
 }

}
