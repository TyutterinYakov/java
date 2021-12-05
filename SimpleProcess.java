
public class SimpleProcess {
	public static final int TASK_COUNT = 500;
	
	public static void main(String[] args) {
		Long summ = 0L;
		System.out.println(System.currentTimeMillis());
		for(int i=0; i<10; i++) {
			SingleProcess sp = new SingleProcess("ID: "+i);
			Thread t = new Thread(sp);
			t.start();
		}
		System.out.println(System.currentTimeMillis());
		System.out.println(summ);
		
	}
}
