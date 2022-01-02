package Class06;

import java.io.*;                // 載入java.io類別庫裡的所有類別
public class Class06
{
   public static void main(String args[])
   {
	   try
	   {
		   char data[]=new char[128]; // 建立可容納128個字元的陣列
		      FileReader fr=new FileReader("c:/Users/USER/eclipse-workspace/ch14/src/Class06/train.txt");  // 建立物件fr

		      int num=fr.read(data);     // 將資料讀入字元陣列data內
		      String str=new String(data,0,num);     // 將字元陣列轉換成字串
		      System.out.println("Characters read= "+num);
		      System.out.println(str);
		      fr.close();
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }
}