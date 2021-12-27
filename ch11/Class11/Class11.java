package Class11;
interface Data{
	public void showData();
}
interface Test{
	public void showScore();
	public double calcu();
}
class CStu implements Test,Data{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	CStu(String i,String na,int mi,int fi,int com){
		id=i;
		name=na;
		mid=mi;
		finl=fi;
		common=com;
	}
	public void showData() {
		System.out.println("學號:"+id);
		System.out.println("姓名:"+name);
	};
	public void showScore() {
		System.out.println("期中考成績:"+mid);
		System.out.println("期末考成績:"+finl);
		System.out.println("學期成績:"+calcu());
	};
	public double calcu() {
		return mid*0.3+finl*0.3+common*0.4;
	};
	public void show() {
		showData();
		showScore();
	}
}
public class Class11 {
	public static void main(String args[]) {
		CStu stu = new CStu("940001","Fiona",90,92,85);
		stu.show();
	}
}
