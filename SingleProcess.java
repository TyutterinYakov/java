import java.math.BigInteger;
import java.security.SecureRandom;

public class SingleProcess implements Runnable {
	
	private String name;
	
	public SingleProcess() {
		super();
	}
	public SingleProcess(String name) {
		this.name = name;
	}
	public void run() {
		process();
	}
	
	
	public Long process() {
		Long summ = 0L;
		
		SecureRandom random = new SecureRandom();
		
		for(int i=0; i<SimpleProcess.TASK_COUNT; i++) {
			String g = new BigInteger(5000, random).toString(32);
			for(char c: g.toCharArray()) {
				summ+=c; 
				
				
			}
		}
	//	System.out.println(name);
		return summ;
	}
	
}
