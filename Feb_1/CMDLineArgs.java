class CMDLineArgs{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);

        if(n>s){
            System.out.println(n+" is Greater No");
        }
        else{
            System.out.println(s+" is Greater No");
        }
    }
}