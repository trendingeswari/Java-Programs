/*
 +    Unary plus operator; indicates positive value (numbers are positive without this, however)
-    Unary minus operator; negates an expression
++    Increment operator; increments a value by 1
--    Decrement operator; decrements a value by 1
!    Logical complement operator; inverts the value of a boolean
The increment/decrement operators can be applied before (prefix) or after (postfix) the operand. The
code result++; and ++result; will both end in result being incremented by one. The only difference is
that the prefix version (++result) evaluates to the incremented value, whereas the postfix version
(result++) evaluates to the original value.
The below program illustrates the way prefix and postfix operators work.
public class Hello {
 public static void main(String[] args) {
 int i = 3;
 i++;
 // prints 4
 System.out.println(i);
 ++i;
 // prints 5
 System.out.println(i);
 // prints 6
 System.out.println(++i);
 // prints 6
 System.out.println(i++);
 // prints 7
 System.out.println(i);
 }
}

Unary Operators
Fill in the missing lines of code to declare and initialize the value of int variable k so that the program
prints 5 followed by 7 as the output.
 */
public class UnaryOpeartor15 {
    public static void main(AbbrevationMatching[] args) {
        int k=5;
        System.out.println(k++);
        System.out.println(++k);
        }
}
