package Skillrack;
/*
 Normally the output of a Java program is printed to the standard output which can be accessed using
System.out
System is a Java class present in java.lang package. (We will learn about package later)
out is the variable present in System class and represents the "standard" output stream.
The below program prints Mount Everest to the console (which is normally the standard output).
public class Hello {
 public static void main(String[] args) {
 System.out.println("Mount Everest");
 }
}
Now if we wish to print another line Super Hit the above program is modified as below.
public class Hello {
 public static void main(String[] args) {
 System.out.println("Mount Everest");
 System.out.println("Super Hit");
 }
}

Printing output to standard output

Amit wants to write a Java program which will print a line Wonderful Job to appreciate his kid (when
ever the kid does a smart stuff).
Please help Amit by inserting the missing lines of code in the program below.
Note: The output is case sensitive. Please note W in Wonderful and J in Job are in upper case
 */

public class PrintingOutput3 {
    public static void main(AbbrevationMatching[] args) {
        System.out.printf("Wonderful Job");
    }//end of main method
}
