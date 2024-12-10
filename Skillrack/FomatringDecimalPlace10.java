/*
 When printing data types like double and float as output, we can format the values upto certain
decimal places.
As an example, the below program rounds up the output value upto 2 decimal places.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double price = sc.nextDouble();
 System.out.format("%.2f", price);
 }
}
If the input to the above program is 12.2566, the output is 12.26 (rounded upto 2 decimal places).
If the input to the above program is 5.1249, the output is 5.12 (rounded upto 2 decimal places).

Formatting output - decimal places

Fill in the missing lines of code so that the program accepts the values for the double variables, price1
and price2 and prints their sum as the output rounding it upto 3 decimal places.
Hint: Use the format specifier as %.3f
 */

import java.util.Scanner;

public class FomatringDecimalPlace10 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        double price1 = sc.nextDouble() , price2 = sc.nextDouble();
        System.out.format("%.3f",price1+price2);
    }
}
