package ch10_1;
class Caaa{
	public int num1;
	public int num2;
}
class Cbbb extends Caaa{
	void set_num(int i,int j) {
		num1 = i;
		num2 = j;
	}
	void show() {
		System.out.print("num1"+"="+num1);
		System.out.println(" ,num2"+"="+num2);
	}
}
public class ch10_1 {
	public static void main(String args[]){
		Cbbb bb = new Cbbb();
		bb.set_num(5,10);
		bb.show();
	}
}
