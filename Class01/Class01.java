package Class01;
class Cal_area{
	double pi = 3.14;
	int r,width,height,length;
	Cal_area(int r) {
		this.r=r;
		System.out.println("半徑="+r);
		System.out.println("球體體積="+r*r*r*pi*4/3.);
	}
	Cal_area(int l,int w,int h) {
		width=w;
		height=h;
		length=l;
		System.out.println("長="+l+",寬="+w+",高="+h);
		System.out.println("立方體表面積="+l*w*h);
	}
}
public class Class01 {

}
