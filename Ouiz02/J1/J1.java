package J1;
import java.util.*;
class test extends Exception{
	private int password;
	int i;
	test(){
		i=0;
		System.out.println("�K�X��J����");
		System.out.print("�п�J�K�X:");
	}
	void fpassword(int fp){
		password = fp;
		System.out.print("�ЦA��J�K�X:");
	}
	void spassword(int sp) {
		if(sp!=password) {
			i++;
			if(i==3) {
				throw new RuntimeException("��J�T�����~!�{������!");
			}else {
				System.out.println("�P�Ĥ@����J�����P!");
				System.out.print("�ЦA��J�K�X:");
			}
		}else {
			System.out.print("�K�X���T");
		}
	}
}
public class J1 {
	public static void main(String args[]) {
		test t = new test();
		Scanner sc = new Scanner(System.in);
		int pass = sc.nextInt();
		t.fpassword(pass);
		for(int i=0;i<3;i++) {
			int pass2 = sc.nextInt();
			try{
				t.spassword(pass2);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
