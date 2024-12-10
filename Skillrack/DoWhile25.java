/*
 Between while and do-while statements, the only difference is that in do-while after executing the
statements atleast once, the condition to loop is checked.
Hence, the statements within the do block are always executed at least once.
The below program will print "5" as the code within do block will be executed atleast once. (Even
though the check counter > 100 is not true).
public class Hello {
 public static void main(String[] args) {
 int counter = 5;
 do {
 System.out.println(counter);
 } while (counter > 100);
 }
}
The program prints just the input number if the number is even.
If the input number is odd, it prints the input number and the next number (which is even).
public class Hello {
 public static void main(String[] args) {
 int number = Integer.parseInt(args[0]);
 do {
 System.out.println(number);
 } while (number++ % 2 != 0);
 }
}
Please remember that the post decrement operator ++ increases the value of number only after that
specific line is executed.
ProgramID- 67 SKILLRACK
do while statement
Complete the below program by specifying while condition as per the below rules.
- Print only the input number if the number is odd.
- If the input number is even, print the input number and the number which is lesser by one
(which is odd).
Example:
If the input is 11 only 11 is printed.
If the input is 56, both 56 55 are printed
 */

import java.util.Scanner;

public class DoWhile25 {
    public static void main(AbbrevationMatching[] args) {
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 do {
 System.out.println(number);
 }
 while(number--%2==0);
 }
}
