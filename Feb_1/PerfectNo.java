class PerfectNo{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int i = 1,s=0;
        while(i<=n/2){
            if(n%i == 0){
                s += i;
            }
            i++;
        }
        if(s == n){
            System.out.println(n+" :is Perfect No");
        }
        else{
            System.out.println(n+" :is Not Perfect No");
        }
    }
}