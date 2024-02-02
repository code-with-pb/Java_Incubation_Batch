class Op1{
    public static void main(String args[]){
        int n1 = 10,n2 = 20, n3 = 25;

        int max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

        System.out.println(max);
    }
}