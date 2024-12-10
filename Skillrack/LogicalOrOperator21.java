/*
 Logical Operator - OR
To check for OR condition, we use || operator.
The below program prints yes if the input number is divisible by 5 or 4 or 7. Else it prints no.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 if(number%4==0 || number%5==0 || number%7==0){
 System.out.println("yes");
 }else
 {
 System.out.println("no");
 }

 }
}
ProgramID- 44 SKILLRACK
Logical Operator - OR
Fill in the lines of code so that the program prints yes if the input number is divisible by 3 or 9. Else it
prints no
 */
public class LogicalOrOperator21 {
    public static void main(AbbrevationMatching args[])
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0 || num%9==0)
            System.out.print("yes");
        else    
            System.out.print("no");
    }
}
