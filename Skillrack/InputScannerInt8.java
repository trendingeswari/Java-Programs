/*
 Till now in our examples we hardcoded values (also called literals). But in practice, the program must
accept input from a source.
Scanner is an important class whose instances are useful for breaking down formatted input into
tokens and translating individual tokens according to their data type.
As an example the below program reads an int data type, adds 100 to it and prints the new value as
the output.
import java.util.Scanner;
public class Hello {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int x = sc.nextInt();
 System.out.println(x + 100);
 }
}
The line import java.util.Scanner; denotes the package to find Scanner class. We will learn about
packages in later chapters.
Here the instance of the Scanner is created using the standard input (which is the console).
To accept a double we use nextDouble() method.
To accept a char we do not have nextChar but use the next() method and retrieve the first character as
shown below.
char c = sc.next().charAt(0);

Accepting Input using Scanner - int data type

Fill in the missing lines of code so that the program accepts two int data type values and prints their
sum as the output.
 */

import java.util.Scanner;

public class InputScannerInt8 {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        int esh = sc.nextInt(),eswari = sc.nextInt();
        System.out.println(esh+eswari);
    }
}
