import java.util.*;

public class Print_Div_Without_Op {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 No: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int s = 0;
		
		for(;n1>= n2;) {
			n1 = n1 - n2;
			s++;
		}
		System.out.println(s);
	}
}
