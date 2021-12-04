package starts;
import java.text.*;
import java.time.format.*;

public class format_date {
	
	public static void main(String[] args) {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("\nВалюта "+cf.format(323.2));
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		System.out.println("\nЧисло "+nf.format(432432));
		
		NumberFormat pf = NumberFormat.getPercentInstance();
		System.out.println("\nПроцент: "+pf.format(0.43));
		
		java.time.LocalDateTime now = java.time.LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern( "MMMM d, yyy" ) ;
		System.out.println( "\nДата: " + now.format( df ) ) ;
		DateTimeFormatter tf = DateTimeFormatter.ofPattern( "h:m a" ) ;
		System.out.println( "\nВремя: " + now.format( tf ) ) ;

		
				
	}
}
