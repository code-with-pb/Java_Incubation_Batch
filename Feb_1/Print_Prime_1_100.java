import java.util.*;

public class Print_Prime_1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2;i<101;i++) {
			int x = 0;
			for(int j = 2;j<i/2;j++) {
				if(i%j == 0) {
					x = 1;
				}
			}
			if(x == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
	}

}
