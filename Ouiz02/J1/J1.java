package J1;
import java.util.*;
class test extends Exception{
	private int password;
	int i;
	test(){
		i=0;
		System.out.println("密碼輸入測試");
		System.out.print("請輸入密碼:");
	}
	void fpassword(int fp){
		password = fp;
		System.out.print("請再輸入密碼:");
	}
	void spassword(int sp) {
		if(sp!=password) {
			i++;
			if(i==3) {
				throw new RuntimeException("輸入三次錯誤!程式停止!");
			}else {
				System.out.println("與第一次輸入的不同!");
				System.out.print("請再輸入密碼:");
			}
		}else {
			System.out.print("密碼正確");
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
