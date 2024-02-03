class Pattern6 {

public static void printStars(int n) {

int i, j;

for (i = 0; i < n; i++) {  

for (j = n - i; j > 1; j--) { 

System.out.print(" "); // Print Spaces

}

for (j = 0; j <= i; j++) { //For Loop for col

System.out.print("* "); // Print Star

}

System.out.println();

}

}

public static void main(String args[]) {

int n = 5; 

printStars(n);

}

}