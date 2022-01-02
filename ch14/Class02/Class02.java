package Class02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Class02 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.toUpperCase();
		System.out.println(s);
	}
}