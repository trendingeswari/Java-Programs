/*
 Switch statement
Switch statement is used to take one of the action based on the input value.
The below program checks if the input number is 1,2,3 and prints "one" or "two" or "three"
accordingly.
Else it prints "Not one two three"
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 switch(number){
 case 1:
 System.out.println("one");
 break;
 case 2:
 System.out.println("two");
 break;
 case 3:
 System.out.println("three");
 break;
 default:
 System.out.println("Not one two three");
 }
 }
}
ProgramID- 48 SKILLRACK
Switch statement
Modify the program below so that it prints hundred when the input value of number is 100
 */

import java.util.Scanner;

public class SwitchStatement23 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 100:
                System.out.println("hundred");
                break;
            case 1000:
                System.out.println("thousand");
                break;
            default:
                System.out.println("Not hundred or thousand");
        }
    }
}
