/*
Password Rules & Strength

The program must accept a string P representing a password as the input. The password rules are given below.
Rule 1: The password must have at least 8 characters.
Rule 2: The password must have at least one upper case and one lower case alphabet.
Rule 3: The password must have at least one digit.
Rule 4: The password must have at least one special character.
The program must print the output based on the following conditions.
- If only Rule 1 is satisfied or none of the rules satisfied, print WEAK as the output.
- If two rules (Rule 1 and any one rule from 2 to 4) are satisfied, print MEDIUM as the output.
- If three rules (Rule 1 and any two rules from 2 to 4) are satisfied, print GOOD as the output. - If all four rules are satisfied, print STRONG as the output.
Boundary Condition(s):
1 <= Length of P <= 100
Input Format:
The first line contains P.
Output Format:
The first line contains a string value based on the given conditions.

Example Input/Output 1:
Input:
Qwerty@123
Output:
STRONG
Explanation:
Here the password Qwerty@123 satisfied all the four rules.
So STRONG is printed as the output.
Example Input/Output 2:
Input:
Q$1a
Output:
WEAK
 */
import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray();
        boolean rule1=false,rule2_1=false,rule2_2=false,rule3=false,rule4=false;
        if(s.length>=8)
        {
            rule1=true;
        }
        sc.close();
        for(int i=0;i<s.length;i++)
        {
            if(Character.isLowerCase(s[i]))
            {
                rule2_1=true;
            }
            else if(Character.isUpperCase(s[i]))
            {
                rule2_2=true;
            }
            else if(Character.isDigit(s[i]))
            {
                rule3=true;
            }
            else
            {
                rule4=true;
            }
        }
        if(rule1&& rule2_1 && rule2_2 && rule3 && rule4)
        {
            System.out.print("STRONG");
        }
        else if((rule1 && rule2_1 && rule2_2  && rule3)||(rule1 && rule3 && rule4)||(rule1 && rule2_1 && rule2_2 && rule4))
        {
            System.out.print("GOOD");
        }
        else if(rule1 &&( (rule2_1 && rule2_2) || rule3 ||  rule4))
        {
            System.out.print("MEDIUM");
        }
        else
        {
            System.out.print("WEAK");
        }
	}
}
