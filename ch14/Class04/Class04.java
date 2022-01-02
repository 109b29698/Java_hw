package Class04;
//a
import java.io.FileReader;
import java.io.IOException;
public class Class04 {
	public static void main(String args[]) throws IOException {
		char data[]=new char[128];
		FileReader fr=new FileReader("c:/Users/USER/eclipse-workspace/ch14/src/Class04/donkey.txt");
		
		int num=fr.read(data);     // 將資料讀入字元陣列data內
	    String str=new String(data,0,num);     // 將字元陣列轉換成字串
	    System.out.println("字串長度="+num);
	    System.out.println(str);
	}
}
//b 不一樣, 因為有換行字元, 所以一共30
