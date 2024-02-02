class Armstrong{
    public static void main(String args[]){
        int l = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int s = 0;
        int t = n;
        
        while(t != 0){
           int  r = t % 10;
           int temp = r;

           int i= 1;

            while(i != l){
                temp *= r;
                i++;
            }
            t = t / 10;
            s += temp;
        }
        System.out.println(s);
        if(s == n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}