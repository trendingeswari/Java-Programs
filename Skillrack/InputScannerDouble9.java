/*
 To accept real (floating) point values, we use nextDouble() method of Scanner as shown below.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double val = sc.nextDouble();
 System.out.println(val);
 }
}
The above program just accepts a double and prints the input value as the output

Accepting Input using Scanner - double data type

Fill in the missing lines of code so that the program accepts the values for two double variables, price1
and price2 and prints their sum as the output.
 */

import java.util.Scanner;

public class InputScannerDouble9 {
     public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        double value1 = sc.nextDouble() , value2 = sc.nextDouble();
        System.out.print(value1+value2);
    }
}
