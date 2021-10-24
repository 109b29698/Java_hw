package Java_09;

class CRectangle{
	int width;
	int height;
//1
	//a
	CRectangle(int w,int h){
		width=w;
		height=h;
	}
	//b
	CRectangle(){
		width=10;
		height=8;
	}
	//c
	/*
	CRectangle(){
		this.width=10;
		this.height=8;
	}
	*/
}

//5
	//a
class CCount{
	int cnt=0;
	void count() {cnt++;}
	//b
	void setZero() {cnt=0;}
	//c
	void setValue(int n) {cnt=n;}
	//d
	//類別變數, 為所有實例所共用
	//e
	//實例變數, 函數可以多次宣告
}
//7
class Power{
	int answer=0;
	int power(int x,int n){answer=1;for(int i=0;i<n;i++) {answer*=x;};return answer;}
}
//17
class Namecard{
	private String name;
	private String address;
	private Phone data;
	//a
	class Phone{
		String company;
		String cell;
	//b
		Phone(String s1,String s2){
			company=s1;
			cell=s2;
		}
	}
}
//19
class Date{
	private String name;
	private Test score;
	//a
	class Test{
		int english;
		int math;
	//b
		Test(int eng,int m){
			english=eng;
			math=m;
		}
	//c
		double avg() {
			return (english+math)/2;
		}
	}
	//d
	void show(){
		System.out.println(name);
		System.out.println(score.english);
		System.out.println(score.math);
		System.out.println(score.avg());
	}
	//e
	Date(String na,int eng,int m){
		name=na;
		score.english=eng;
		score.math=m;
	}
}
public class Java09 {
	//e
	Date stu= new Date("Annie",85,92);
}
