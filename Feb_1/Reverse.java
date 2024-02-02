class Reverse{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int i = 1, s = 0;
        while(n != 0){
            int r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        System.out.println("The Reverse No is: "+ s);
    }
}