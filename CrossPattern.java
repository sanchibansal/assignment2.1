import java.util.*;
class CrossPattern {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the number of rows/columns");
            int n = s.nextInt();			//inputting number of rows/columns through scanner
            int i, j;
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    if (j == i) {			//prints * on the principle diagonal
                        System.out.print("*");		
                    } else if (j == n - (i - 1)) {
                        System.out.print("*");		//prints * on the secondary diagonal
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
