package Class06;

import java.io.*;                // ���Jjava.io���O�w�̪��Ҧ����O
public class Class06
{
   public static void main(String args[])
   {
	   try
	   {
		   char data[]=new char[128]; // �إߥi�e��128�Ӧr�����}�C
		      FileReader fr=new FileReader("c:/Users/USER/eclipse-workspace/ch14/src/Class06/train.txt");  // �إߪ���fr

		      int num=fr.read(data);     // �N���Ū�J�r���}�Cdata��
		      String str=new String(data,0,num);     // �N�r���}�C�ഫ���r��
		      System.out.println("Characters read= "+num);
		      System.out.println(str);
		      fr.close();
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }
}