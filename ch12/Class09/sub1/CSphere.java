package Class09.sub1;

public class CSphere {
	private double radius;
	private double pi=3.14;
	public CSphere(double r){
		radius = r;
	}
	public void show() {
		System.out.println(4./3.*pi*radius*radius*radius);
	}
}
