package Class01;
class Cal_area{
	double pi = 3.14;
	int r,width,height,length;
	Cal_area(int r) {
		this.r=r;
		System.out.println("�b�|="+r);
		System.out.println("�y����n="+r*r*r*pi*4/3.);
	}
	Cal_area(int l,int w,int h) {
		width=w;
		height=h;
		length=l;
		System.out.println("��="+l+",�e="+w+",��="+h);
		System.out.println("�ߤ�����n="+l*w*h);
	}
}
public class Class01 {

}
