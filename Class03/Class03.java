package Class03;
import java.util.Scanner;
class Data{
	private String name;
	private test score;
	Data(){
		
	}
	class test{
		int english,math;
		test(int eng,int m){
			english=eng;
			math=m;
		}
		double avg() {
			return (english+math)/2.;
		}
	}
	Data(String s,int i,int j){
		name=s;
		this.score = new test(i,j);
	}
	void show(){
		System.out.println("name="+name);
		System.out.println("english="+this.score.english);
		System.out.println("math="+this.score.math);
		System.out.println("avg="+this.score.avg());
	}
}
public class Class03 {
	public static void main(String args[]) {
		int i = 85,j = 92,k=77,l=56;
		String s1="Annie",s2="Brian";
		Data d1 = new Data(s1,i,j);
		d1.show();
		Data d2 = new Data(s2,k,l);
		d2.show();
	}
}
