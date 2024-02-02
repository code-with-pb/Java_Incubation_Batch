class TypeCasting{
    public static void main(String args[]){
        // Implicit TypeCasting  i.e Automatic Type Conversion
        // Explicit TypeCasting  i.e Manual Type Conversion

        // Implicit  
        
        //higher datatype = lower datatype

        short n = 10;
        int n1 = n;

        System.out.println(n1+"  "+n); // 10  10

        // Explicit 

        // lower datatype = higher datatype

        int n2 = 10;
        short n3 = (short)n2;

        System.out.println(n2+"  "+n3);
    }
}