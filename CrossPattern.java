import java.util.*;
class CrossPattern {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number of rows/columns");
    int n = s.nextInt();			//inputting number of rows/columns through scanner
    for (int i = 1; i <= n; i++) {		// first loop for row
         for (int j = 1; j <= n; j++) {		// second loop for column
             if (j == i) {			
             System.out.print("*");		//prints * for principle diagonal
             }
             else if (j == n - (i - 1)) {
             System.out.print("*");		//prints * for secondary diagonal
             }
             else {
             System.out.print(" ");
             }
          }
          System.out.println();			// printing new line after one iteration
     }
     }
}
