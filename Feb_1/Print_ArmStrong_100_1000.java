import java.util.*;

public class Print_ArmStrong_100_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=100;i<1001;i++) {
			int t = i;
			int n = 3;
			int s = 0,temp = 0;
			int d = 1;
			
			while(t != 0) {
				int r = t % 10;
				s = s * 10 + r;
				for(int j = 0;j < n;j++) {
					s *= s; 
				}
				temp += s;
				t = t /10;
				System.out.println(temp);
			}
			if(temp == i) {
				System.out.println(temp);
			}
		}*/
		for(int n=100;n<=1000;n++) {
			
			int t = n;
			int a = 0;
			int temp = 0;
		
			while(t != 0) {
				int s = 1;
			
				int r = t % 10;
			
				for(int i=0;i<3;i++) {
					s *= r;
				}
			
				temp += s;
			
				t /=10; 
			}
			if(temp == n) {
				System.out.println(temp);
			}
		}
		
	}

}
