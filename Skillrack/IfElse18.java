/*
 if else condition can be used for either or situation.
As an example, the program checks if the number passed as input is odd or even.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 int remainder = number % 2;
 if (remainder == 0) {
 System.out.println("even");
 } else {
 System.out.println("odd");
 }
 }
}
ProgramID- 24 SKILLRACK

if else
In the below Java program the input will be a positive number representing the age of a person.
Complete the below program by inserting the missing lines of code, so that it prints "senior" if age is
greater than or equal to 60. Else it prints "notsenior".
Example Input/Output:
If the input is "25", the output must be "notsenior"
If the input is "65", the output must be "senior"
 */

import java.util.Scanner;

public class IfElse18 {
    public static void main(AbbrevationMatching[] args) {
 Scanner sc = new Scanner(System.in);
 int age = sc.nextInt();
 if(age>=60)
 System.out.print("senior");
else
 System.out.print("notsenior");
 }
}
