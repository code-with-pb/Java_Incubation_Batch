class CMDLineOperation{
    public static void main(String args[]){
        char ch = (char)args[0].charAt(0);
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);

        switch(ch){
            case '+' :System.out.println("Addition: "+(n1+n2));break;
            case '-' :System.out.println("SubStraction: "+(n1-n2));break;
            case '*' :System.out.println("Multiplication: "+(n1*n2));break;
            case '/' :System.out.println("Division: "+(n1/n2));break;
            default  : System.out.println("Invalid Input....");break;
        }
    }
}