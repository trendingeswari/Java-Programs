/*
 +    Additive operator (also used for String concatenation)
-    Subtraction operator
*    Multiplication operator
/    Division operator
%    Remainder operator
The below program prints the product of two int values x and y (passed as input) using the
multiplication operator *.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int x=sc.nextInt();
 int y=sc.nextInt();
 System.out.println(x*y);
 }
}

Arithmetic Operators
Fill in the missing lines of code so that the program prints the quotient when M is divided by N
 */

import java.util.Scanner;

public class ArithmeticOperator11 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
       System.out.print(M/N);
    }
}
