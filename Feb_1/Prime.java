import java.util.*;

class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = sc.nextInt();
        int x = 1;
        for(int i = 2;i<n/2;i++){
            if(n%i == 0){
                x = 0;
                break;
            }
        }
        if(x == 0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}