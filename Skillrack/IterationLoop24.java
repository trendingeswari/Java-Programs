/*
 Iterating using for and while loops
for and while loops can be used for iteration.
As an example, the program below prints from 1 to 5 using for loop.
public class Hello {
 public static void main(String[] args) {
 for(int counter=1;counter<=5;counter++){
 System.out.print(counter+" ");
 }
 }
}
The same can be accomplished using while loop as below.
public class Hello {
 public static void main(String[] args) {
 int counter=1;
 while(counter<=5){
 System.out.print(counter+" ");
 counter++;
 }
 }
}
ProgramID- 23 SKILLRACK
Iterating using for loop
In the below Java program the input will be a positive number represented by count.
Complete the below program by inserting the single missing line of code containing the for loop or
while loop, so that it prints from 1 to count.
Example Input/Output:
If the input is "5", the output must be "1 2 3 4 5"
If the input is "9", the output must be "1 2 3 4 5 6 7 8 9"
 */

import java.util.Scanner;

public class IterationLoop24 {
    public static void main(AbbrevationMatching[] args) {
 Scanner sc=new Scanner(System.in);
 int count=sc.nextInt();
 int esh=1;
 while(esh<=count)
 {
 System.out.print(esh+" ");
 esh++;
 }
}
}
