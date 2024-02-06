import java.util.*;

public class Print_Mul_Without_Op {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 No: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int s = 0;
		
		for(int i=1;i<=n2;i++) {
			s += n1;
		}
		System.out.print(s);	
	}

}
