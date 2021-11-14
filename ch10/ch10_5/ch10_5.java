package ch10_5;
class Caaa{
	private int num;
	public Caaa(int n) {
		num = n;
	}
	public int get() {
		return num;
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
}
public class ch10_5 {
	public static void main(String args[]) {
		//建構式內要有一個整數
		Cbbb bb = new Cbbb(2);
		bb.show();
	}
}
