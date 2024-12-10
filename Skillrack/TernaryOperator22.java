/*
 ternary operator
ternary operator can be used instead of simple conditions involving if else.
As an example, the program checks if the number passed as input is positive.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 String result = number > 0 ? "positive":"notpositive";
 System.out.println(result);
 }
}
ProgramID- 25 SKILLRACK
ternary operator
In the below Java program the input will be a number.
Complete the below program (preferably by using ternary operator), so that it prints "negative" if the
number is less than zero. It prints "notnegative" if the number is greater than or equal to zero.
Example Input/Output:
If the input is "-2", the output must be "negative"
If the input is "55", the output must be "notnegative"
 */

import java.util.Scanner;

public class TernaryOperator22 {
    public static void main(AbbrevationMatching[] args) {
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 System.out.print(number<0?"negative":"notnegative");
 }

}
