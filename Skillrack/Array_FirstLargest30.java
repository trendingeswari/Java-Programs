/*
 Array - Iterate an array
The length of an array can be found using "length" attribute.
As an example, the below program prints the length of the array "cities"
public class Hello {
 public static void main(String[] args) {
 String[] cities = new String[]{"Pune","Chennai","Bangalore","Delhi","Indore
 System.out.println(cities.length);
 }
}
Now let us write a program to find the sum of the numbers in an array
 public static void main(String[] args) {
 int[] numbers = new int[]{4,7,21,99,11};
 int sum=0;
 for(int ctr=0;ctr<numbers.length;ctr++){
 sum=sum+numbers[ctr];
 }
 System.out.println(sum);
 }
}
ProgramID- 27 SKILLRACK
Array - Iterate and find largest
Complete the program by filling the missing code so that the program prints the largest number
present in the integer array numbers.
Hint: Store the largest number in a variable. Use if condition inside the for loop to check for greater
than and update this variable.
 */

import java.util.Scanner;

public class Array_FirstLargest30 {
     public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int position=0,largestNumber=0;
        while(position < 5){
            numbers[position] = sc.nextInt();
            if(numbers[position]>largestNumber)
            {
                largestNumber=numbers[position];
            }
            position++;
        }      
        System.out.println(largestNumber);

    }
}
