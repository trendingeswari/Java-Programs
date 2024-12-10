/*
 The remainder operator % is used to find the remainder when a number is divided by another number.
The below program prints the remainder when x is divided by y.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int x=sc.nextInt();
 int y=sc.nextInt();
 System.out.println(x%y);
 }
}

Remainder operator
Fill in the missing lines of code so that the program prints the unit digit of the integer x.
Hint: The unit digit of a number is nothing but the remainder when the number is divided by 10.
 */

import java.util.Scanner;

public class RemainderOperator12 {
    
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print(x%10);

    }
}
