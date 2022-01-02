package Class05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class05 {
	public static void main(String args[]) throws IOException {
		String str;
		int count=0;
	    FileReader fr=new FileReader("c:/Users/USER/eclipse-workspace/ch14/src/Class04/donkey.txt");
	    BufferedReader bfr=new BufferedReader(fr);

	    while((str=bfr.readLine())!=null) {
	    	if(count!=0) {
	    		System.out.println(str);
	    	}
	         count++;
	    }

	}
}
