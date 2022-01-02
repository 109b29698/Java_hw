package Class06;

class Add implements Runnable{
	private int n;
	private int sum=0;
	Add(int a){
		n=a;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			sum+=i;
			show();
		}
	}
	public void show() {
		System.out.println(sum);
	}
}
public class Class06 {
	public static void main(String args[]) {
		Add a = new Add(5);
		Add b = new Add(10);
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}
