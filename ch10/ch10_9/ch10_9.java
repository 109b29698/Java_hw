package ch10_9;
class Caaa{
	private int num;
	public Caaa(int n) {
		num = n;
	}
	public int get() {
		return num;
	}
	void display() {
		System.out.println("printed from Caaa class");
	}
}
class Cbbb extends Caaa{
	//必須要有建構式
	Cbbb(int n){
		super(n);
	}
	public void show() {
		System.out.println("num="+get());
	}
	void display() {
		System.out.println("printed from Cbbb class");
	}
}
public class ch10_9 {
	public static void main(String args[]) {
		Caaa bb = new Cbbb(2);
		bb.display();
	}
}
