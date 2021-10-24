package Java_08;
class cbbb{
	double x;
	double y;
};

class CBox{
	int length;
	int width;
	int height;
	
	void volume() {
		System.out.println("voulen="+this.length*this.width*this.height);
	}
	void surfaceArea() {
		System.out.println("surfaceArea="+this.length*this.width);
	}
	void showData() {
		System.out.println("length="+this.length);
		System.out.println("width="+this.width);
		System.out.println("height="+this.height);
	}
	void showAll() {
		this.showData();
		this.volume();
		this.surfaceArea();
	}
};

class CCircle{
	double pi=3.14;
	double radius;
	void show_periphery() {
		System.out.println("periphery="+2*this.pi*this.radius);
	}
	
	double area(double r) {
		return 3.14*r*r;
	}
	float area(float r) {
		return 3.14f*r*r;
	}
	double area(int r) {
		return 3.14*r*r;
	}
};

class CTest {
	int number;
	void test() {
		if(this.number==0) {
			System.out.println("此數為零");
		}else if(this.number%2==0) {
			System.out.println("此數為偶數");
		}else if(this.number%2==1) {
			System.out.println("此數為奇數");
		}
	}
};

class CCalculator {
	int a,b,c;
	void set_value(int x,int y,int z) {
		this.a=x;
		this.b=y;
		this.c=z;
	}
	public void show() {
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
		System.out.println("c="+this.c);
	}
	int add() {
		return a+b+c;
	}
	int sub() {
		return a-b-c;
	}
	int mul() {
		return a*b*c;
	}
	double avg() {
		return this.add()/3;
	}
};

class CWin {
	int width;
	int height;
	String name;
	void setW(int w) {
		width=w;
	}
	void setH(int h) {
		height=h;
	}
	void setName(String s) {
		name=s;
	}
	void show() {
		System.out.println("Name="+name);
		System.out.println("W="+width+", H="+height);
	}
	void setWindows(int w, int h) {
		width=w;
		height=h;
	}
	void setWindows(int w, int h, String name) {
		width=w;
		height=h;
		this.name=name;
	}
};

class CSphere {
	private int x;
	private int y;
	private int z;
	private int radius;
	void setLocation(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void setRadius(int radius) {
		this.radius=radius;
	}
	double faceArea() {
		return radius*2*3.14;
	}
	double volume() {
		return radius*radius*3.14;
	}
	void showCenter() {
		System.out.println(x+","+y+","+z);
	}
}

public class Java08{
	public static void main(String arge[]) {
		System.out.println("第二題");
		cbbb obj1 = new cbbb();
		cbbb obj2 = new cbbb();
		cbbb avg = new cbbb();
		
		obj1.x=5.2;
		obj1.y=3.9;
		obj2.x=6.5;
		obj2.y=4.6;
		avg.x=(5.2+6.5)/2;
		avg.y=(3.9+4.6)/2;
		
		System.out.println("x="+obj1.x+" "+"y="+obj1.y);
		System.out.println("x="+obj2.x+" "+"y="+obj2.y);
		System.out.println("x="+avg.x+" "+"y="+avg.y);
		
		System.out.println("第四題");
		CBox box = new CBox();
		box.length=15;
		box.width=10;
		box.height=25;
		
		System.out.println("lenght="+box.length);
		System.out.println("width="+box.width);
		System.out.println("heigth="+box.height);
		
		System.out.println("第五題");
		box.length=1;
		box.width=1;
		box.height=1;
		box.volume();
		box.surfaceArea();
		box.showData();
		box.showAll();
		
		System.out.println("第六題");
		CCircle cir1 = new CCircle();
		cir1.radius = 3.0;
		cir1.show_periphery();
		
		System.out.println("第七題");
		CTest test = new CTest();
		test.number=3;
		test.test();
		test.number=8;
		test.test();
		test.number=0;
		test.test();
		
		System.out.println("第九題");
		CCalculator cal = new CCalculator();
		cal.set_value(25,3,7);
		cal.show();
		System.out.println(cal.add());
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.avg());
		
		System.out.println("第十二題");
		CWin cw = new CWin();
		CWin cw2 = new CWin();
		CWin cw3 = new CWin();
		
		cw.setName("My Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();
		cw2.setWindows(10,6);
		cw2.show();
		cw3.setWindows(20,12,"Windogs");
		cw3.show();
		
		System.out.println("第十三題");
		CCircle ccir = new CCircle();
		System.out.println(ccir.area(2));
		System.out.println(ccir.area(2.2f));
		System.out.println(ccir.area(2.2));
		
		System.out.println("第十六題");
		CSphere cs = new CSphere();
		cs.setLocation(3, 4, 5);
		cs.setRadius(1);
		System.out.println(cs.faceArea());
		System.out.println(cs.volume());
		cs.showCenter();
		
		System.out.println("10/4上課問題");
		int i;
		for(i = 417;i<=417;i+=17-417%17) {
		}
		System.out.println("大於417的17的倍數是:" + i);
	}
}