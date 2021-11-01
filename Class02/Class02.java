package Class02;
class is_prime{
	int s=0;
	is_prime(){
		System.out.println("Input a number:");
	}
	void prime(int n) {
		s=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				s++;
			}
		}
		if(s!=0) {
			System.out.println("No");
		}else if(s==0) {
			System.out.println("Yes");
		}
	}
}
public class Class02 {

}
