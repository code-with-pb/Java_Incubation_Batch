class CMDLineVovel{
    public static void main(String args[]){
        char ch = args[0].charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Vovel");
        }
        else{
            System.out.println("Not Vovel");
        }
    }
}