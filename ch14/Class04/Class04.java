package Class04;
//a
import java.io.FileReader;
import java.io.IOException;
public class Class04 {
	public static void main(String args[]) throws IOException {
		char data[]=new char[128];
		FileReader fr=new FileReader("c:/Users/USER/eclipse-workspace/ch14/src/Class04/donkey.txt");
		
		int num=fr.read(data);     // �N���Ū�J�r���}�Cdata��
	    String str=new String(data,0,num);     // �N�r���}�C�ഫ���r��
	    System.out.println("�r�����="+num);
	    System.out.println(str);
	}
}
//b ���@��, �]��������r��, �ҥH�@�@30
