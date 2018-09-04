import java.util.*;
public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		ch = sc.next();
		System.out.println("Enter an integer: ");
		n = sc.nextInt();
		
		System.out.println(ch);
		System.out.println(n);
		char[] arr = ch.toCharArray();
		for(char cd : arr) {
			//System.out.println(cd);
			if(cd == 'a' || cd == 'e' || cd == 'i' || cd == 'o' || cd == 'u') {
				System.out.println(cd + " is vowel");
			}
			else {
				if((cd > 'a' && cd < 'z') || (cd > 'A' && cd < 'Z')) {
					System.out.println(cd + " is consonent");
				}
				else {
					System.out.println("Not an alphabet");
				}
			}
		}
		
		int first = 1;
		for(int i = 1;i<=n; ++i) {
			for(int j = 1; j<= i; ++j) {
				System.out.println(i + "");
			}
			
			
			/*System.out.println();*/
		}
		
	}

}
