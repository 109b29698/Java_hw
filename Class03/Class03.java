package Class03;
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
			return (english+math)/2;
		}
	}
	void show(){
		System.out.println("name="+name);
		System.out.println("english="+score.english);
		System.out.println("math="+score.math);
		System.out.println("avg="+score.avg());
	}
}
public class Class03 {
	
}
