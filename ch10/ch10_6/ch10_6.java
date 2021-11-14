package ch10_6;
class Triangle{
	protected int base;
	protected int height;
	
	protected void show() {
		System.out.println("base="+base+" ,height="+height);
	}
	public Triangle(int b,int h) {
		base = b;
		height = h;
	}
}
class CData extends Triangle{
	private double area;
	CData(int b,int h){
		super(b,h);
	}
	void area() {
		area = base*height*1/2;
		System.out.println("base="+base+" ,height="+height+" ,area="+area);
	}
}
public class ch10_6 {
	public static void main(String args[]) {
		CData obj = new CData(3,8);
		obj.area();
	}
}
