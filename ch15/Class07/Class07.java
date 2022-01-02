package Class07;

class CTest implements Runnable{
	private String id;
	public CTest(String str){
		id=str;
	}
	//b
	public void run() {
		for(int i=1;i<5;i++) {
			for(int j=0;j<100000000;j++) {
				System.out.println(id+" "+i);
			}
		}
	}
}
public class Class07 {
	public static void main(String args[]) {
		//c
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		CTest morning = new CTest("Good morning");
		Thread thi = new Thread(hi);
		Thread tbye = new Thread(bye);
		Thread tmorning = new Thread(morning);
		thi.start();
		tbye.start();
		tmorning.start();
	}
}