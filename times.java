package starts;
import java.time.LocalDateTime;


public class times {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now();
		System.out.println("Сейчас: "+date);
		//date = date.withYear(2019);
		System.out.println("Сейчас: "+date.getYear()+" год");
		System.out.println("Время: "+date.getHour()+":"+date.getMinute()+":"+date.getSecond());


		


	}
}
