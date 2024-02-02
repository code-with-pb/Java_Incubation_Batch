class Fact{
    public static void main(String args[]){
        int n1 = Integer.parseInt(args[0]);
        int i = 1, s = 1;
        while(i<=n1){
            s *= i;
            i++;
        }
        System.out.println("Factorial is: "+s);
    }
}