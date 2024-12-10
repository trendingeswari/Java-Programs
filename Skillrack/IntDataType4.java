/*
 Java is statically-typed, which means that all variables must first be declared before they can be used.
This involves declaring the variable's type and name like
int age = 20;
The Java programming language supports eight primitive data types.
byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128
and a maximum value of 127 (inclusive).
short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of
-32,768 and a maximum value of 32,767 (inclusive).
int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum
value of -2^31 and a maximum value of 2^31 - 1.
long: The long data type is a 64-bit two's complement integer. The signed long has a minimum value
of -2^63 and a maximum value of 2^63-1.
float: The float data type is a single-precision 32-bit IEEE 754 floating point. This data type should
never be used for precise values, such as financial calculations.
double: The double data type is a double-precision 64-bit IEEE 754 floating point. This data type
should never be used for precise values, such as financial calculations.
boolean: The boolean data type has only two possible values: true and false. Use this data type for
simple flags that track true/false conditions.
char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0)
and a maximum value of '\uffff' (or 65,535 inclusive).
The below program declares two int variables x,y and prints their sum as the output.
The = is called assignment operator and is used to assign values to the variables.
public class Hello {
 public static void main(String[] args) {
 int x = 10;
 int y = 20;
 System.out.println(x + y);
 }
}

Java - int data type declaration

Fill in the missing lines of code to declare x, y and z as int variables, so that the below program
prints the sum of x, y and z
 */
public class IntDataType4 {
    public static void main(AbbrevationMatching[] args) {
        int x=0, y=0 , z=0;
        x = 10;
        y = 200;
        z = 30;
        System.out.println(x + y + z);
        }
       
}
