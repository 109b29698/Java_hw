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
		System.out.println("�Ǹ�:"+id);
		System.out.println("�m�W:"+name);
	};
	public void showScore() {
		System.out.println("�����Ҧ��Z:"+mid);
		System.out.println("�����Ҧ��Z:"+finl);
		System.out.println("�Ǵ����Z:"+calcu());
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
