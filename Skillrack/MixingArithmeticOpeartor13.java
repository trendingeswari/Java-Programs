/*
 Several arithmetic operators can be used in a single statement.
As an example the below program calculates the sum of the values of two times x and one-third of y.
Then it subtracts 2 from the resulting value.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int x=sc.nextInt();
 int y=sc.nextInt();
 int result = 2*x + y/3 -2;
 System.out.println(result);
 }
}

Mixing arithmetic operators
Fill in the missing lines of code so that the program prints the remainder when the sum of four times
x and five times y is divided by 6.
 */

import java.util.Scanner;

public class MixingArithmeticOpeartor13 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print(((4*x)+(5*y))/6);
    }
}
