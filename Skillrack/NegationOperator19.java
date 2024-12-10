/*
 Negation Operator
Negation operator (also called Logical Complement operator) is used to reverse the boolean
value (true or false).
The below program prints "small" if the input number is less than 100 using the negation operator.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 boolean greaterThanEqualToHundred = number >= 100;
 //NEGATION operator being used
 if (!greaterThanEqualToHundred) {
 System.out.println("small");
 }
 }
}
ProgramID- 45 SKILLRACK
Negation Operator
A string value is passed as input to the below program. Modify the program so that it should print
'ABCD' if the input is not equal to '123'
 */

import java.util.Scanner;

public class NegationOperator19 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is123 = sc.nextLine().equalsIgnoreCase("123");
        if(!is123)
        {
            System.out.print("ABCD");
        }
    }
}
