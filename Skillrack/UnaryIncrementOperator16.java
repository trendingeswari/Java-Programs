/*
 Unary Increment Operator
Unary Increment operator is used to increase the value by 1.
It can be used before or after a variable as exhibited in the below program.
ProgramID- 46 SKILLRACK

Unary Increment Operator
Execute the below program by clicking on Run button below the code
 */
public class UnaryIncrementOperator16 {
    
    public static void main(AbbrevationMatching[] args) {

        int counter = 0;
        System.out.println(counter++); //Prints 0. The increment happens after printing
        
        //Now the counter is 1.
        
        System.out.println(++counter); //Prints 2. The increment happens before printing

    }
}
