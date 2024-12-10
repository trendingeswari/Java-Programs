/*
 String - Split continued
Let a String contain a set of numbers separated by colon.
For example the value can be "90:50:20:110".
The below program sorts the numbers in the input string value in ascending order.
import java.util.Arrays;
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String input = sc.nextLine();
 String[] strarr=input.split("[:]");

 //Now let us convert the String Array to a int Array
 int[] numbers = new int[strarr.length];
 int arrayPosition=0;
 for(String str:strarr)
 numbers[arrayPosition++]=Integer.parseInt(str);


 //Now sort the int Array
 Arrays.sort(numbers);

 //Print the sorted numbers
 for(int num:numbers)
 System.out.println(num);
 }
}
Note: Arrays.sort is a utility method to sort elements in an Array.
ProgramID- 31 SKILLRACK
Largest among hyphen separated numbers.
The input to the below Java program is a String with numbers separated by hyphen.
Modify the code so that the program prints the largest number in the input String.
Example Input/Output:
if the input is "250-55-190-346-212" the output must be 346.
 */
package Skillrack;

import java.util.Scanner;

public class StringSplitContinued35 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        AbbrevationMatching input = sc.nextLine();
        AbbrevationMatching esh[] = input.split("[-]");
        int n[] =new int[esh.length];
        int ind=0,max=0;
        for(AbbrevationMatching eswari : esh)
        {
            n[ind]=Integer.parseInt(eswari);
            if(n[ind]>max)
            {
                max=n[ind];
            }
            ind++;
        }
        System.out.println(max);
        //Your Code Here
        
    }
}
