import java.util.*;

public class String_Check_Vowel_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		
		int c = 0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				c++;
			}
		}
		System.out.println(c);
	}

}
