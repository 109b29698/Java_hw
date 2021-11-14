package ch10_3;
class Caaa{
	private int num1;
	private int num2;
	Caaa(){
		num1 = 1;
		num2 = 1;
	}
	Caaa(int a,int b){
		num1 = a;
		num2 = b;
	}
	void show() {
		System.out.print("num1"+"="+num1);
		System.out.println(" ,num2"+"="+num2);
	}
}
class Cbbb extends Caaa{
	Cbbb(int a,int b){
		super(a,b);
	}
}
public class ch10_3 {
	public static void main(String args[]) {
		Caaa a = new Caaa();
		a.show();
		int i=5,j=10;
		Caaa a2 = new Caaa(i,j);
		a2.show();
		i=10;j=20;
		Cbbb b = new Cbbb(i,j);
		b.show();
	}
}
