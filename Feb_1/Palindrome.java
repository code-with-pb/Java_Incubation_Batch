class Palindrome{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);

        int s = 0;
        int t = n;
        while(t != 0){
            int r = t % 10;
            t = t / 10;
            s = s * 10 + r;
        }
        if(s == n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}