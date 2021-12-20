package J2;
interface iShape03{
	public void show(); 
	public int area(); 
}
interface iColor{
	public void showColor();
}
class CWin implements iShape03,iColor{
	protected int width;
	protected int height;
	protected String color;
	CWin(int w, int h,String c){
		width = w;
		height = h;
		color = c;
	}
	public void showColor() {
		System.out.println("color="+color);
	}
	public void show() {
		System.out.println("color="+color);
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("area="+area());
	}
	public int area() {
		int area = width*height;
		return area;
	}
}
public class J2 {
	public static void main(String argc[]) {
		CWin win = new CWin(5,7,"Green");
		win.show();
	}
}