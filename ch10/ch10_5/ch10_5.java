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
	//�����n���غc��
	Cbbb(int n){
		super(n);
	}
	public void show() {
		System.out.println("num="+get());
	}
}
public class ch10_5 {
	public static void main(String args[]) {
		//�غc�����n���@�Ӿ��
		Cbbb bb = new Cbbb(2);
		bb.show();
	}
}
