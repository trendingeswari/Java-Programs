/*
 We use two equal symbols to check for equality of primitive variables like int.
As an example, the program below prints true if first number is equal to second number.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int firstNum = sc.nextInt();
 int secondNum = sc.nextInt();
 boolean equal = (firstNum == secondNum);
 System.out.println(equal);
 }
}
Note: Remember that a single = is an assignment operator

Check if equal
Complete the below program by inserting the missing lines of code, so that it prints true if first
number is not equal to second number. Else it prints false
Hint: To check not equal use the following code snippet
firstNum != secondNum
 */

import java.util.Scanner;

public class EqualityOpeartor14 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
         int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        if(firstNum!=secondNum)
            System.out.print(true);
        else
            System.out.print(false);
 }

}
