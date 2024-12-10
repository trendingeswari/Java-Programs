/*
 Logical Operator - AND
To check for AND condition, we use && operator.
The below program prints yes if the input number is divisible by both 4 and 5. Else it prints no.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 if(number%5 == 0 && number%4 == 0){
 System.out.println("yes");
 }else{
 System.out.println("no");
 }
 }
}
ProgramID- 43 SKILLRACK
Logical Operator - AND
Fill in the lines of code so that the program given below prints yes if the input number is divisible by 5
and less than or equal to 100. Else it prints no.
 */
import java.util.Scanner;
public class LogicalAndOperator20 {
    public static void main(AbbrevationMatching args[])
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0 && num<=100)
            System.out.print("yes");
        else    
            System.out.print("no");
    }
}
